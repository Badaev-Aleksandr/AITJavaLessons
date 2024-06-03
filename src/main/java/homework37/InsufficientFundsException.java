package homework37;

import lombok.Getter;
import lombok.Setter;

public class InsufficientFundsException extends Exception{
    @Getter
    @Setter
    private double shortage;

    public InsufficientFundsException(String message, double shortage) {
        super(message);
        this.shortage = shortage;
    }

}
