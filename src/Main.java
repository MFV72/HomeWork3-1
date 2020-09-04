public class Main {
    public static void main(String[] args) {
        int ticketPrice = 3333355; //стоимость билета в копейках
        int count = 20;
        int totalMiles = (ticketPrice / 100) / count;
        System.out.println(totalMiles);
    }
}
