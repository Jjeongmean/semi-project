package yongIMAX.project.IMAX;

import yongIMAX.project.Info.Customer;

public class Booking {
    private Customer customer; // 고객 정보
    private String seat; // 좌석 정보
    private String movie; // 영화 정보

    public Booking(Customer customer, String seat, String movie) {
        this.customer = customer;
        this.seat = seat;
        this.movie = movie;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }
}
