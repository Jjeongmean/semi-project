package semi01.project;

public class DoubleRoomReservation extends RoomReservation{
    double Discount; // 할인율(3박이상 예약시)
    public DoubleRoomReservation(String GuestName, int ReserveDate) {
        super(GuestName, ReserveDate);
        super.RoomType = "Double";
        super.Price = 200000;
        super.Limit = 2;
        this.Discount = 0.05;
    }


}
