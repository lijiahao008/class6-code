
public class  MainDriver{
	public static void main(String[] args) {

    Card[][] set = new Card[2][1];
    Deck myDeck = new Deck();
    int count1=0;
    int count2=0;
    
    
    for (int i = 0; i < 26; i++) {
        System.out.println("Round "+i);
            for (int player = 0; player < set.length; player++)
                set[player][0] = myDeck.dealCard();

        for (int player = 0; player < set.length; player++) {
            printSet(set[player]);
        }

        int player1 = set[0][0].getValue(); 
        int player2 = set[1][0].getValue();
        
        
        if (player1 > player2){
            System.out.println("Player One Won This round");
            count1++;
        }
        else if (player2 > player1){
        	
            System.out.println("Player Two Won This round");
            count2++;
            
        }
            else
            System.out.println("This round is Tied");

    }
     if(count1>count2)
	System.out.println("player 1 won the game!");
     else if (count1<count2)
    System.out.println("player 2 won the game!");	 
     else
     System.out.println("tie game!");
	}
	 
	public static void printSet(Card[] set) {

	        for (int card = 0; card < set.length; card++)
	            System.out.printf("%s", set[card].toString());

	        System.out.println();

	    } 
}
