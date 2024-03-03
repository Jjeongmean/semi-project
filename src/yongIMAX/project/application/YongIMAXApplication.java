package yongIMAX.project.application;

import yongIMAX.project.IMAX.IMAXReservationManager;
import yongIMAX.project.Info.Customer;
import yongIMAX.project.utils.Define;

import java.util.Scanner;

public class YongIMAXApplication {
    public static void main(String[] args) {
        IMAXReservationManager manager = IMAXReservationManager.getInstance();
        Scanner scanner = new Scanner(System.in);

        System.out.println("용산 아이맥스를 예매합니다.");

        System.out.println("좌석을 선택해주세요: ");
        String seat = scanner.nextLine(); // 좌석 선택

        System.out.println("예매할 영화를 선택해주세요.");
        System.out.println("1. " + Define.MOVIE_DUNKIRK);
        System.out.println("2. " + Define.MOVIE_DUNE);
        System.out.println("3. " + Define.MOVIE_INTERSTELLA);
        System.out.println("4. " + Define.MOVIE_TOPGUN);
        int movieChoice = scanner.nextInt();
        String movie;
        switch (movieChoice) {
            case 1:
                movie = Define.MOVIE_DUNKIRK;
                break;
            case 2:
                movie = Define.MOVIE_DUNE;
                break;
            case 3:
                movie = Define.MOVIE_INTERSTELLA;
                break;
            case 4:
                movie = Define.MOVIE_TOPGUN;
                break;
            default:
                movie = "정보가 없습니다.";
                break;
        }
        scanner.nextLine(); // 버퍼 비우기

        System.out.println("고객명을 입력해주세요: ");
        String name = scanner.nextLine();

        System.out.println("전화번호를 입력해주세요: ");
        String phoneNumber = scanner.nextLine();

        System.out.println("카드번호를 입력해주세요: ");
        String cardNumber = scanner.nextLine(); // 카드번호 입력

        Customer customer = new Customer(name, phoneNumber);

        manager.reserveSeat(seat); // 좌석 예약
        manager.selectMovie(movie);
        manager.enterCardNumber(cardNumber); // 입력 받은 카드번호 전달
        manager.completeReservation(customer);

        scanner.close();
    }
}
