package co.edu.cesde.ga.repository.impl;

import co.edu.cesde.ga.model.Role;
import co.edu.cesde.ga.repository.RoleRepository;

import java.util.ArrayList;
import java.util.List;


    public class RoleRepositoryInMemory implements RoleRepository {

        // Atributos

        private List<Role> roles;
        private Long nextRoleId;

        // Constructor

        public RoleRepositoryInMemory() {
            this.roles = new ArrayList<>();
            this.nextRoleId = 1L;
        }

        // Sobrecarga de métodos

        @Override
        public Role create(Role role){

            if (role == null){
                return null;
            }

            role.setRoleId(nextRoleId++);
            roles.add(role);
            return role;

        }

        @Override
        public List<Role> findAll() {

            return new ArrayList<>(roles);

        }

        @Override
        public Role findById(Long enrollmentId){

            if (enrollmentId == null){
                return null;
            }

            for (Role role : roles){

                if (role.equals(role.getRoleId())){
                    return role;
                }

            }

            return null;
        }

        @Override
        public boolean update(Role updatedRole){

            if (updatedRole == null) return false;

            for (int i = 0; i < roles.size(); i++){

                if (updatedRole.getRoleId().equals(roles.get(i).getRoleId())){

                    roles.set(i, updatedRole);

                    return true;

                }

            }

            return false;

        }

        @Override
        public boolean delete(Long roleId){

            Role role = findById(roleId);

            if (roleId == null) return false;

            roles.remove(role);

            return true;

        }

        @Override
        public int count(){
            return roles.size();
        }

    }


