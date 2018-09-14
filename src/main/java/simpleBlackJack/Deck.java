package simpleBlackJack;

import java.util.List;
import java.util.LinkedList;
import java.util.Collections;


public class Deck {

    private List<Card> deck;

    //constructor
    public Deck() {
        //deck stores 52 cards as a linkedlist
        this.deck = new LinkedList<Card>();
    }

    public void generateWholeDeck(){
        //initialize cards of a deck
        for(int i=0; i< Card.Rank.length; i++ ) {
            for (int k = 0; k < Card.Suit.length; k++) {
                this.deck.add(new Card(Card.Suit[i]+ Card.Rank[k]));
            }
        }

    }

    public void generateGivenCards(String[] cards){

        this.deck = new LinkedList<Card>();

        //initialize cards of a deck with given cards
        for(int i=0; i< cards.length; i++ ) {
            this.deck.add(new Card(cards[i]));
        }

    }


    //shuffle the deck
    public void deckShuffle(){
        //Shuffle the whole deck
        Collections.shuffle(this.deck);
    }

    //get number of cards in the deck
    public int getNumCards(){
        return this.deck.size();
    }

    //get deck: list of cards
    public List<Card> getDeck(){
        return this.deck;
    }

    //withdraw the first card from the deck
    public Card drawCard(){
        //return the first card if deck has more than 0 cards
        return getNumCards() != 0 ? this.deck.remove(0) : null;
    }
}
