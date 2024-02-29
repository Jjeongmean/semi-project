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

    public static IMAXReservationManager getInstance() {
        if (instance == null) {
            instance = new IMAXReservationManager();
        }
        return instance;
    }
    public void reserveSeat(String seat) {
        reservation.selectSeat(seat);
    }
    public void selectMovie(String movie) {
        reservation.selectMovie(movie);
    }
    public void enterCardNumber(String cardNumber) {
        reservation.enterCardNumber(cardNumber);
    }
    public void completeReservation(Customer customer) {
        reservation.completeReservation(customer);
    }
}
