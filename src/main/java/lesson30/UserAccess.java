package lesson30;

public class UserAccess extends AccessCheck{

    public UserAccess(int level) {
        super(level);
    }

    @Override
    boolean canRead() {
        return true;
    }

    @Override
    boolean canWright() {
        return false;
    }


}
