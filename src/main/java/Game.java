public class Game {

    private Player player;
    private Dealer dealer;
    private Deck deck;

    public Game(Player player, Dealer dealer, Deck deck) {
        this.player = player;
        this.dealer = dealer;
        this.deck = deck;
    }

    public Player getPlayer() {
        return player;
    }

    public Dealer getDealer() {
        return dealer;
    }

    public Deck getDeck() {
        return deck;
    }

    public String checkWinCondition(Player player) {
        String result = "";
        int total = 0;
        for(Card card: player.getHand()){
            total += card.getValueOfRank();
        }
        if(total < 21){
            result = "Continue";
        } else if (total == 21){
            result = "Win";
        } else {
            result = "Bust";
        }
        return result;
    }

    public void askPlayerStickOrTwist(String choice, Player player) {
        if(choice.toLowerCase().equals("twist")){
            Card card = deck.getNextCard();
            player.addCardToHand(card);
        }
    }
}
