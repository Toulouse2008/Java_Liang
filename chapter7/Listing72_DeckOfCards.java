public class Listing72_DeckOfCards{
  public static void main(String[] args){
    int[] deck = new int[52];
    String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
    String[] ranks ={"Ace", "2", "3", "4", "5", "6", "7", "8", "9",
                     "10", "Jack", "Queen", "King"};
    //initialize the cards
    for(int i = 0; i < deck.length; i++)
      deck[i] = i; //+ 1???;

    //shuffle the cards
    for(int i = 0; i < deck.length; i ++){
      //generate an random index
      int index = (int) (Math.random() * deck.length);
      int temp = deck[i];
      deck[i] = deck[index];
      deck[index] = temp;
    }
    //display the first four cards
    for(int i = 0; i < 4; i++){
      int cardNumber = (int)(Math.random()*deck.length);
      String suit = suits[cardNumber / 13];
      String rank = ranks[cardNumber % 13];
      /*alternative code ****/
      //String suit = suits[deck[i] / 13];
      //String rank = ranks[deck[i] % 13];
      System.out.printf("%s %s\n", suit, rank);
    }
  }
}
