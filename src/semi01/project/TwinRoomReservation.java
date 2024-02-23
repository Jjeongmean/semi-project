package semi01.project;

public class TwinRoomReservation extends RoomReservation{
    double Discount; // 할인율(3박이상 예약시)
    public TwinRoomReservation(String GuestName, int ReserveDate) {
        super(GuestName, ReserveDate);
        super.RoomType = "Twin";
        super.Limit = 3;
        super.Price = 250000;
        this.Discount = 0.1;
    }
}
