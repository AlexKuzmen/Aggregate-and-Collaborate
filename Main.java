class Main {
  public static void main(String[] args) {
    
    Deck myDeck = new Deck();
    myDeck.shuffle();
    
    Hand myHand = new Hand();
    
    //myDeck.displayDeck();
    
    for(int i = 0; i < 5; i++){
      myHand.addCard(myDeck.drawCard());
    }
    
    myHand.displayHand();
    
  }
}