import java.util.*;

public class Hand{

    private ArrayList<Card> cardHand;
  
    public Hand(){
      cardHand = new ArrayList<Card>();
    }
  
    public void addCard(Card c){
      Card newCard = new Card(c);
      cardHand.add(newCard);
    }

    public Card playFirstCard(){
      Card pCard;
      if(cardHand.size() < 1){
        pCard = null;
      }
      else{
        pCard = new Card(cardHand.get(0));
        cardHand.remove(0);
      }
      return pCard;
    }
  
    public void displayHand(){
      for(int i=0;i<cardHand.size();i++){
        System.out.println(cardHand.get(i).toString());
      }
    }

    
  }//end class