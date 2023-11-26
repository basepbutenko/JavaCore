package Another;

public class BeerSong {
    public static void main(String[] args) {
        int beerNum = 99;
        String word = "Bottles";
        while (beerNum > 0) {
            if (beerNum == 1) {
                word = "bottle";
            }

            System.out.println(beerNum + " " + word + " пива на стене");
            System.out.println(beerNum + " " + word + " пива.");
            System.out.println("Возьми одну.");
            System.out.println("Пусти по кругу.");
            beerNum = beerNum - 1;

            if (beerNum == 0) {
                System.out.println("нет бутылок пива на стене");
            }

        }

    }
}
