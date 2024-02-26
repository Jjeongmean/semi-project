package semi01.project;

public class SweetRoomReservation extends RoomReservation{
    String BreakfastFree; // 조식무료제공(스위트만)

    public SweetRoomReservation(String GuestName, int ReserveDate) {
        super(GuestName, ReserveDate);
        super.RoomType = "SweetRoom";
        super.Price = 500000;
        super.Limit = 0;
        this.Discount = 0.2;
        this.BreakfastFree = "제공합니다.";
    }

    public double getDiscount() {
        return Discount;
    }

    public void setDiscount(double discount) {
        Discount = discount;
    }

    @Override
    public void reservationData() {
        System.out.println("룸 이름: " + getRoomType() + "," + "예약일수: " + getReserveDate() + "," + "조식여부: " + getBreakfastFree());

    }

    public String getBreakfastFree() {return BreakfastFree;}

}
