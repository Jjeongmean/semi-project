package semi01.project;

import java.util.Scanner;

public class RoomReservation {
    protected String GuestName; // 예약자명
    protected int ReserveDate; // 숙박일
    protected String RoomType; // 예약할 룸(룸 타입)
    int Limit; // 인원제한
    int Price; // 가격(1박)



    //생성자
    public RoomReservation() {initReserve();}
    public RoomReservation(String GuestName, int ReserveDate) {
        this.GuestName = GuestName;
        this.ReserveDate = ReserveDate;
        initReserve();
    }


    //룸 타입 초기화(싱글) 메소드
    private void initReserve() {
        RoomType = "SINGLE";
        Price = 100000;
    }

    public String getGuestName() {
        return GuestName;
    }

    public void setGuestName(String guestName) {
        GuestName = guestName;
    }

    public int getReserveDate() {
        return ReserveDate;
    }

    public void setReserveDate(int reserveDate) {
        ReserveDate = reserveDate;
    }

    public String getRoomType() {
        return RoomType;
    }

    public void setRoomType(String roomType) {
        RoomType = roomType;
    }

    public int getLimit() {
        return Limit;
    }

    public void setLimit(int limit) {
        Limit = limit;
    }
}
