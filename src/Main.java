public class Main {
    public static void main(String[] args) {
        int ticketPrice;
        int count;
        int totalMiles;
        count = 20;
        ticketPrice = 3333355; //стоимость билета в копейках
        totalMiles = (ticketPrice / 100) / count;
        System.out.println(totalMiles);
    }
}
