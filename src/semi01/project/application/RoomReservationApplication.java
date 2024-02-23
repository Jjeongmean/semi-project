package semi01.project.application;

import semi01.project.DoubleRoomReservation;
import semi01.project.RoomReservation;
import semi01.project.SweetRoomReservation;
import semi01.project.TwinRoomReservation;

import java.util.ArrayList;
import java.util.Scanner;

public class RoomReservationApplication {
    private static ArrayList<RoomReservation> RoomReservationList = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String Guest = scan.next();
        int date = scan.nextInt();
        String type = scan.next();
        RoomReservation reserve = null;
        switch (type) {
            case "single":
                reserve = new RoomReservation(Guest,date); break;
            case "double":
                reserve = new DoubleRoomReservation(Guest, date); break;
            case "twin":
                reserve = new TwinRoomReservation(Guest, date); break;
            case "sweet":
                reserve = new SweetRoomReservation(Guest, date); break;

        }

        RoomReservation limit= null;
        int person = scan.nextInt();
        switch (person) {
            case 1:
                limit = new
        }

        //RoomReservationList에 이름,일자,룸 저장
        RoomReservationList.add();

    }
}
