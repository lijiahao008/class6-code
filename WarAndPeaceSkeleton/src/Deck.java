import java.lang.Math;


public class Deck {

    private Card[] deck = new Card[52];
    private int firstCard;

    Deck() {

        firstCard = 0;
        
        for (int i = 0; i < deck.length; i++)
            deck[i] = new Card(i);

    }

    public  void Random() {

        firstCard = 0;

        for (int i = 0; i < 100; i++) {
            int j =  (int) (Math.random() % 52);
            int k =  (int) (Math.random() % 52);
            Card topCard = deck[j];
            deck[j] = deck[k];
            deck[k] = topCard;
        } 
   }

    public Card Draw() {
        Card theCard;
        if (firstCard < deck.length) {
            theCard = deck[firstCard];
            firstCard++;
        }
        else
            theCard = null;

        return theCard;
    }
}
