package homework43;

public enum Role {
    USER, ADMIN, NONE;

    public static Role fromStringRole(String role) {
        if (role.trim().equalsIgnoreCase("user"))
            return Role.USER;
        else if (role.trim().equalsIgnoreCase("admin"))
            return Role.ADMIN;
        else
            return Role.NONE;
    }
}
