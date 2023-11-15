import java.util.*;

public class Deck{

  private ArrayList<Card> cardDeck;

  public Deck(){

    cardDeck = new ArrayList<Card>();
    
    for(int i=1; i<=4; i++){
      for(int j=1; j<=13; j++){
        String s, v;
        if(i==1){
          s = "Spades";
        }
        else if(i==2){
          s = "Clubs";
        }
        else if(i==3){
          s = "Hearts";
        }
        else{
          s = "Diamonds";
        }
        if(j==1){
          v = "A";
        }
        else if(j==11){
          v = "J";
        }
        else if(j==12){
          v = "Q";
        }
        else if(j==13){
          v = "K";
        }
        else{
          v = Integer.toString(j);
        }
        
        cardDeck.add(new Card(v,s));
        
      }//end inner loop
    }//end outer loop
  }//end constructor

  

  public void shuffle(){
    Collections.shuffle(cardDeck);
  }//end shuffle

  public void displayDeck(){
    for(int i=0;i<cardDeck.size(); i++){
      System.out.println(cardDeck.get(i).toString());
    }
  }//end displayDeck

  public Card drawCard(){
    Card dCard;
    if(cardDeck.size() < 1){
      dCard = null;
    }
    else{
      dCard = new Card(cardDeck.get(0));
      cardDeck.remove(0);
    }
    return dCard;
  }

  
}//end class