package MovieDriver;

import java.util.Scanner;

class Movie {
    private String title;
    private String rating;
    private int ticketsSold;

    public Movie() {
        title = "";
        rating = "";
        ticketsSold = 0;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public void setTicketsSold(int ticketsSold) {
        this.ticketsSold = ticketsSold;
    }

    public String getRating() {
        return rating;
    }

    public int getTicketsSold() {
        return ticketsSold;
    }
}

public class MovieDriver {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userChoice = "y";

        while (userChoice.equals("y")) {
            Movie movie = new Movie();

            System.out.print("Enter the title of the movie: ");
            String title = scanner.nextLine();
            movie.setTitle(title);

            System.out.print("Enter the movie's rating: ");
            String rating = scanner.nextLine();
            movie.setRating(rating);

            System.out.print("Enter the number of tickets sold: ");
            int ticketsSold = scanner.nextInt();
            movie.setTicketsSold(ticketsSold);

            System.out.println("Conclusion: Rating: " + movie.getRating() + ", Tickets Sold: " + movie.getTicketsSold());

            System.out.print("Do you want to enter another? (y or n): ");
            scanner.nextLine();
            userChoice = scanner.nextLine();
        }

        System.out.println("Goodbye!");

        scanner.close();
    }
}
