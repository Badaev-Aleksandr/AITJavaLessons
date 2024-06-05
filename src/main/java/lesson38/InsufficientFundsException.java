package lesson38;

public class InsufficientFundsException extends Exception{
    private double shortage;

    public InsufficientFundsException(double shortage) {
        super("You don't have enough money to perform this operation: " + shortage);
        this.shortage = shortage;
    }
}
