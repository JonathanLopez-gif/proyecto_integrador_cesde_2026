package co.edu.cesde.ga.model;

public class Role {

    // Atributos
    private Long roleId;
    private String name;
    private String description;

    // Constructor vacío
    public Role() {
    }

    // Constructor lleno
    public Role(Long roleId, String name, String description) {
        this.roleId = roleId;
        this.name = name;
        this.description = description;
    }

    // Métodos de acceso

    public Long getRoleId() {
        return roleId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}