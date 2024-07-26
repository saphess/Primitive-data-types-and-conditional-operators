public class Task1{
    public static void main(String[] args){
        int ticketPrice = 13_678;
        int priceOfTheMile = 20;

        int bonusMile = ticketPrice / priceOfTheMile;

        System.out.println("Ваших бонусных миль " + bonusMile);
    }
}