package yongIMAX.project.Reservation;

import yongIMAX.project.Info.Customer;

public class ReservationImpl implements Reservation{
    private String seat; // 좌석
    private String movie; // 영화
    private String cardNumber; // 결제 카드 번호

    @Override
    public void selectSeat(String seat) {
        this.seat = seat;
    }

    @Override
    public void selectMovie(String movie) {
        this.movie = movie;
    }

    @Override
    public void enterCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void completeReservation(Customer customer) {
        System.out.println("예매가 완료되었습니다.");
        System.out.println("선택한 좌석: " + seat);
        System.out.println("선택한 영화: " + movie);
        System.out.println("결제 정보: 카드 번호 - " + cardNumber);
    }
}
