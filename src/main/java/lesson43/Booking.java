package lesson43;

public class Booking {
    private String customerName;
    private int hotelNumber;
    private String roomType;
    private String checkInDate;
    private String checkOutDate;

    public Booking(String customerName, int hotelNumber,
                   String roomType, String checkInDate, String checkOutDate) {
        this.customerName = customerName;
        this.hotelNumber = hotelNumber;
        this.roomType = roomType;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }



    @Override
    public String toString() {
        return "Booking{" +
                "customerName='" + customerName + '\'' +
                ", hotelNumber=" + hotelNumber +
                ", roomType='" + roomType + '\'' +
                ", checkInDate='" + checkInDate + '\'' +
                ", checkOutDate='" + checkOutDate + '\'' +
                '}';
    }

}
