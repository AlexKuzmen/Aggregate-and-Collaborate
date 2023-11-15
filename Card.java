public class Card{

  private String value;
  private String suit;

  public Card(String v, String s){
    value = v;
    suit = s;
  }

  public Card(Card c){
    value = c.value;
    suit = c.suit;
  }//copy
  
  public void setValue(String value) {
	this.value = value;
  }

  public void setSuit(String suit) {
	this.suit = suit;
  }

  public String toString() {
    return value + " of " + suit;
  } 
  
}//end Card class