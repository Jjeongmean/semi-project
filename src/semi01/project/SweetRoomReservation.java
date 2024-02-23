package semi01.project;

public class SweetRoomReservation extends RoomReservation{
    String BreakfastFree; // 조식무료제공(스위트만)
    double Discount; // 할인율(3박이상 예약시)

    public SweetRoomReservation(String GuestName, int ReserveDate) {
        super(GuestName, ReserveDate);
        super.RoomType = "SweetRoom";
        super.Price = 500000;
        super.Limit = 0;
        this.Discount = 0.2;
    }

    public String getBreakfastFree() {return BreakfastFree;}
}
