import java.io.Console;
import java.util.*;

import static java.lang.Math.random;


public class CardGame {

    public static void main(String[] args) {

        // Create a deck and add cards to it
        Stack<Card> deck = new Stack<>();
        deck.push(new Card("2-D"));
        deck.push(new Card("7-S"));
        deck.push(new Card("7-S"));
        deck.push(new Card("2-D"));
        deck.push(new Card("A-H"));
        deck.push(new Card("10-S"));
        deck.push(new Card("10-C"));
        deck.push(new Card("10-S"));
        deck.push(new Card("10-C"));
        deck.push(new Card("A-H"));

        // Create the discard pile
        Stack<Card> discardPile = new Stack<>();

        // Start the game
        SimpleCardGame game = new SimpleCardGame();
        game.setDeck(deck);
        game.setDiscardPile(discardPile);

        LinkedList<Card> Player1 = new LinkedList<Card>();
        LinkedList<Card> Player2 = new LinkedList<>();

        for (int i = 0; i < 3; i++) {
            Player1.add(game.getCardFromDeck());
            Player2.add(game.getCardFromDeck());
        }
        System.out.println("Player1 hand: " + Player1);
        System.out.println("Player2 hand: " + Player2);

        // TODO-Lab3.3: Implement a 2 player go-fish game.
        // player1 turn
        // check if player 2 has card in random position (0-2)
        // if player2 contains that card,
        Random rand = new Random();
        String choice = Player1.get(rand.nextInt(2)).getName();
        System.out.println("Player 1 would like to see if player 2 has: " + choice);
//        System.out.println(Player2.get(2).getName());

        boolean goFish = true;
        for (int i = 0; i < Player2.size(); i++){
            String PCard1 = Player1.get(2).getName();
            String PCard2 = Player2.get(i).getName();
            if(PCard1.equals(PCard2)){
                goFish = false;
            }
        }
        if(!goFish){
            System.out.println("Player 2 has the card: " + Player1.get(2));
            Player1.remove(Player1.get(2));
            Player2.remove(Player1.get(2));
        }
        else{
            System.out.println("Go Fish!");
            Player1.add(game.getCardFromDeck());
        }

//        if(Player2.contains(choice)){
//            System.out.println("Player 2 has that card!");
//        }else{
//            System.out.println("Go Fish!");
//        }


    }
}
