package lesson30;

public class User extends AccessCheck{


    public User() {
        super(1);
    }

    @Override
    boolean canRead() {
        return false;
    }

    @Override
    boolean canWright() {
        return false;
    }
}
