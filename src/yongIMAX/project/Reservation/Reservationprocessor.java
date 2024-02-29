package yongIMAX.project.Reservation;

import yongIMAX.project.Info.Customer;

public class Reservationprocessor {
    public void processReservation(Customer customer, String seat, String movie) {
        System.out.println("예매가 완료되었습니다.");
        System.out.println("예매 고객명: " + customer.getName());
        System.out.println("전화번호: " + customer.getPhoneNumber());
        System.out.println("선택한 영화: " + movie);
        System.out.println("선택한 좌석: " + seat);
    }
}
