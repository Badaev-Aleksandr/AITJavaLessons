package lesson44;

public enum Role {
    USER, ADMIN, NONE;

    public static Role fromStringRole (String role){
        if(role.trim().equalsIgnoreCase("user")){
            return Role.USER;
        }
        else if(role.equals("admin")){
            return Role.ADMIN;
        }
        else {return Role.NONE;}
    }

    //Приведение значения из Role в String
    public static String toStringRole (Role role){
        if(role.equals(Role.USER)){
            return "user";
        }
        else if(role.equals(Role.ADMIN)){
            return "admin";
        }
        else return null;
    }


}

