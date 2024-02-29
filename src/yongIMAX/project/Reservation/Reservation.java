package yongIMAX.project.Reservation;

import yongIMAX.project.Info.Customer;

public interface Reservation {
    void selectSeat(String seat);
    void selectMovie(String movie);
    void enterCardNumber(String cardNumber);
    void completeReservation(Customer customer);
}
