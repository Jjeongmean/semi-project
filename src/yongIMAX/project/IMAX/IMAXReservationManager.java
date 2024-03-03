package yongIMAX.project.IMAX;

import yongIMAX.project.Info.Customer;
import yongIMAX.project.Reservation.Reservation;
import yongIMAX.project.Reservation.ReservationImpl;

public class IMAXReservationManager {
    private static IMAXReservationManager instance;
    private Reservation reservation;

    private IMAXReservationManager() {
        reservation = new ReservationImpl();
    }

    // 인스턴스 반환
    public static IMAXReservationManager getInstance() {
        if (instance == null) {
            instance = new IMAXReservationManager();
        }
        return instance;
    }

    // 좌석 예약
    public void reserveSeat(String seat) {
        reservation.selectSeat(seat);
    }

    // 영화 선택
    public void selectMovie(String movie) {
        reservation.selectMovie(movie);
    }

    // 카드 정보 입력
    public void enterCardNumber(String cardNumber) {
        reservation.enterCardNumber(cardNumber);
    }

    // 예약 완료
    public void completeReservation(Customer customer) {
        reservation.completeReservation(customer);
    }
}
