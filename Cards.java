
import java.util.*;
class Cards {
    int value;
    String suit;

    public void setCards(String suit, int r) {
        this.value = r;
        this.suit = suit;
    }

    //Write your code here.

    public int getSuitPriority(String suitString) {
        switch (suitString) {
            case "Spades":
                return 4;
            case "Diamond":
                return 3;
            case "heart":
                return 2;
            case "Clubs":
                return 1;
            default:
                return 0;
        }
    }
}

     class ClassicGame {
        int points1 = 0;
        int points2 = 0;

        Cards cards = new Cards();

        public void game(Cards c1, Cards c2) {
            int i = c1.value;
            int j = c2.value;

            points1 = i + cards.getSuitPriority(c1.suit);
            points2 = j + cards.getSuitPriority(c2.suit);

            //Write your code here.

            System.out.println("points of player 1 :" + " " + points1);
            System.out.println("points of player 2 :" + " " + points2);
        }

    }
     class CardsData {

        public static void main(String[] args) {
            //Two objects (cards) of class Cards
            Cards c1 = new Cards();
            Cards c2 = new Cards();
            Scanner in = new Scanner(System.in);
            //Enter the suit of card 1
            String s1 = in.nextLine();
            c1.setCards(s1, in.nextInt());
            in.nextLine();
            //Enter the suit of card 2
            String s2 = in.nextLine();
            c2.setCards(s2, in.nextInt());
            ClassicGame c = new ClassicGame();

            c.game(c1, c2);
        }
    }