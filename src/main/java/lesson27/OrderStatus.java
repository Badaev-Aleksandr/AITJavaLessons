package lesson27;

public enum OrderStatus {
    PENDING("Order is pending approval"),
    PROCESSING("Order is in process"),
    SHIPPED("Order is shipped"),
    DELIVERED("Order is delivered"),
    CANCELLED("Order is canceled");

    private String description;

    OrderStatus(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
    public boolean canCancel(){
        if (this.equals(PENDING)||this.equals(PROCESSING)){
            return true;
        }else{
            return false;
        }
    }
}
