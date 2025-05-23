import java.util.ArrayList;
import java.util.List;

public class Role {

    // Please note all details are examples only

    private int roleID;
    private String roleTitle;
    private String roleDescription;
    private static List<Role> roles = new ArrayList<>();

    // Constructor
    public Role(int roleID, String roleTitle, String roleDescription) {
        this.roleID = roleID;
        this.roleTitle = roleTitle;
        this.roleDescription = roleDescription;
    }

    public void addRole() { // adds new role

        roles.add(this);
        System.out.println("Role '" + this.roleTitle + "' added successfully.");
    }

    public void assignRole(int employeeID) { // assigns role

        System.out.println("Role '" + this.roleTitle +
                "' assigned to employee ID: " + employeeID);
    }

    public void editRole(String newTitle, String newDescription) { // edit role
        this.roleTitle = newTitle;
        this.roleDescription = newDescription;
        System.out.println("Role ID " + this.roleID + " updated successfully.");
    }

    public void deleteRole() { // delete role
        if (roles.removeIf(role -> role.roleID == this.roleID)) {
            System.out.println("Role ID " + this.roleID + " deleted successfully.");
        } else {
            System.out.println("Role not found.");
        }
    }

    // Getters and Setters
    public int getRoleID() {
        return roleID;
    }

    public String getRoleTitle() {
        return roleTitle;
    }

    public String getRoleDescription() {
        return roleDescription;
    }

    public static List<Role> getAllRoles() {
        return new ArrayList<>(roles);
    }
}
