import java.util.Stack;
import java.util.Random;
public class SimpleCardGame {
    // Draw deck
    private Stack<Card> deck;

    // Discard pile
    private Stack<Card> discardPile;

    public Card getCardFromDeck() {
        return deck.pop();
    }

    public void discard(Card card) {
        discardPile.push(card);
    }

    public Card lookAtTopCard() {

        return deck.peek();
    }

    public void setDeck(Stack<Card> deck)
    {
        this.deck = deck;
    }

    public void setDiscardPile(Stack<Card> discardPile){
        this.discardPile = discardPile;
    }

    public Stack<Card> getDiscardPile(){
        return discardPile;
    }

    public void Shuffle(Stack<Card> deck, Stack<Card> discard){
        // To-do : implement the shuffle of two decks
        Random rand = new Random();

        while(!(deck.empty()) && !(discard.empty())){
            Card c1 = new Card(deck.pop().getName());
            Card c2 = new Card(discard.pop().getName());
            int random = rand.nextInt(1);
            if(random == 1){
                deck.push(c1);
                deck.push(c2);
            }
            else{
                deck.push(c2);
                deck.push(c1);
            }

        }

    }

}
