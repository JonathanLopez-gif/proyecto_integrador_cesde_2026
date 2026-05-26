package co.edu.cesde.ga.service.impl;

import co.edu.cesde.ga.model.Role;
<<<<<<< HEAD
import co.edu.cesde.ga.service.RoleService;

import java.util.ArrayList;
=======
import co.edu.cesde.ga.repository.RoleRepository;
import co.edu.cesde.ga.service.RoleService;

>>>>>>> bd82d578a7dd4179b4d8fbc49b1778c11c4ddbb0
import java.util.List;

public class RoleServiceImpl implements RoleService {

<<<<<<< HEAD
    // Atributos

    private List<Role> roles;
    private Long nextRoleId;

    // Constructor

    public RoleServiceImpl() {
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

=======
    private final RoleRepository roleRepository;

    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public Role create(Role role) {

        if (isInvalidRole(role)
                || roleRepository.existsByRoleId(role.getRoleId())) {
            return null;
        }

        return roleRepository.create(role);
    }

    @Override
    public boolean delete(Long roleId) {

        if (roleId == null || roleId <= 0L) {
            return false;
        }

        return roleRepository.delete(roleId);
    }

    @Override
    public boolean existsByRoleId(Long roleId) {

        if (roleId == null || roleId <= 0L) {
            return false;
        }

        return roleRepository.existsByRoleId(roleId);
    }

    @Override
    public int count() {
        return roleRepository.count();
    }

    @Override
    public Role findById(Long roleId) {

        if (roleId == null || roleId <= 0L) {
            return null;
        }

        return roleRepository.findById(roleId);
>>>>>>> bd82d578a7dd4179b4d8fbc49b1778c11c4ddbb0
    }

    @Override
    public List<Role> findAll() {
<<<<<<< HEAD

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

=======
        return roleRepository.findAll();
    }

    @Override
    public boolean update(Role role) {

        if (isInvalidRole(role)
                || role.getRoleId() == null
                || role.getRoleId() <= 0L) {
            return false;
        }

        if (roleRepository.findById(role.getRoleId()) == null) {
            return false;
        }

        return roleRepository.update(role);
    }

    public boolean isInvalidRole(Role role) {

        return role == null
                || role.getRoleId() == null
                || role.getRoleId() <= 0L
                || isBlank(role.getName())
                || isBlank(role.getDescription());
    }

    private boolean isBlank(String value) {
        return value == null || value.trim().isBlank();
    }
>>>>>>> bd82d578a7dd4179b4d8fbc49b1778c11c4ddbb0
}
