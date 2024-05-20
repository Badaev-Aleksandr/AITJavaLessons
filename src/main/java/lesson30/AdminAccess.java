package lesson30;

public class AdminAccess extends AccessCheck{
    public AdminAccess(int level) {
        super(2);
    }

    @Override
    boolean canRead() {
        return true;
    }

    @Override
    boolean canWright() {
        return true;
    }


}
