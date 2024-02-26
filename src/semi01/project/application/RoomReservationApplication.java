package semi01.project.application;

import semi01.project.DoubleRoomReservation;
import semi01.project.RoomReservation;
import semi01.project.SweetRoomReservation;
import semi01.project.TwinRoomReservation;

import java.util.ArrayList;
import java.util.Scanner;

public class RoomReservationApplication {
    private static ArrayList<RoomReservation> RoomReservationList = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        boolean run = true;
        while (run) {
            System.out.println("1. 룸 예약하기  | 2. 모든 룸의 정보 보기 | 3. 모든 고객 정보보기 | 4. 특정 고객 찾기 | 5. 프로그램 종료");
            int select = scan.nextInt();

            switch (select) {
                case 1: reserve();
                    break;
                case 2: findAllRoomInfo();
                    break;
                case 3: findAllCustomerInfo();
                    break;
                case 4:
                    System.out.println("예약자명을 입력해주세요.");
                    String name = scan.next();
                    specificCustomerInfo(name);
                    break;
                case 5:
                    run = false;
                    break;
            }


        }

        System.out.println("프로그램 종료합니다.");
    }

    //1. 룸 예약하기
    public static void reserve() {
        System.out.println("고객 예약자명: ");
        String Guest = scan.next();
        System.out.println("숙박 일수를 입력해주세요.");
        int date = scan.nextInt();
        System.out.println("원하시는 룸타입을 입력해주세요.");
        String type = scan.next();

        RoomReservation reserve = null;
        switch (type) {
            case "single":
                reserve = new RoomReservation(Guest, date);
                break;
            case "double":
                reserve = new DoubleRoomReservation(Guest, date);
                break;
            case "twin":
                reserve = new TwinRoomReservation(Guest, date);
                break;
            case "sweet":
                reserve = new SweetRoomReservation(Guest, date);
                break;
            default:
                System.out.println("잘못된 룸 타입입니다.");
                return;
        }

        System.out.println("숙박 인원을 입력해주세요");
        int person = scan.nextInt();

        if (person <= reserve.getLimit() || reserve.getLimit() == 0 ) {
            //RoomReservationList에 이름,일자,룸 저장
            RoomReservationList.add(reserve);
            System.out.println("결제금액: " + reserve.calc());
            reserve.reservationData();
        } else {
            System.out.println("인원 제한이 있습니다.");
        }
    }


    //2.모든 정보 룸 보기
    public static void findAllRoomInfo() {
        System.out.println(" 1) 룸 타입: 싱글 | 2) 숙박 가격: 10만원  | 3) 인원제한: 1명 ");
        System.out.println(" 1) 룸 타입: 더블 | 2) 숙박 가격: 20만원  | 3) 인원제한: 2명 ");
        System.out.println(" 1) 룸 타입: 트윈 | 2) 숙박 가격: 25만원  | 3) 인원제한: 3명 ");
        System.out.println(" 1) 룸 타입: 스위트 | 2) 숙박 가격: 50만원  | 3) 인원제한: 없음  | 4) 조식여부: O");
    }

    //3. 모든 고객 예약 정보 보기
    public static void findAllCustomerInfo() {
        for (RoomReservation List:RoomReservationList ) {
            List.reservationData();
        }
    }

    public static void specificCustomerInfo(String name) {
        for (RoomReservation List: RoomReservationList) {
            if (List.getGuestName().equals(name)) {
                List.reservationData();
                return;
            }
        }
        System.out.println("예약자가 없습니다.");
    }
}
