package co.edu.cesde.am.infrastructure.repository.impl;

import co.edu.cesde.am.domain.model.Role;
import co.edu.cesde.am.application.repository.RoleRepository;

import java.util.ArrayList;
import java.util.List;


    public class RoleJpaRepository implements RoleRepository {

        // Atributos

        private List<Role> roles;
        private Long nextRoleId;

        // Constructor

        public RoleJpaRepository() {
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
        public Role findById(Long roleId){

            if (roleId == null){
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
        public boolean existsByRoleId(Long roleId) {
            return false;
        }

        @Override
        public boolean update(Role role){

            if (role == null) return false;

            for (int i = 0; i < roles.size(); i++){

                if (role.getRoleId().equals(roles.get(i).getRoleId())){

                    roles.set(i, role);

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


