
import java.util.Scanner;

class BlackjackGame {
    private Deck deck;
    private Hand playerHand;
    private Hand dealerHand;

    public BlackjackGame() {
        deck = new Deck();
        deck.shuffle();
        playerHand = new Hand();
        dealerHand = new Hand();
    }

    public void play() {
        System.out.println("Welcome to Blackjack!");
        playerHand.addCard(deck.drawCard());
        dealerHand.addCard(deck.drawCard());
        playerHand.addCard(deck.drawCard());
        dealerHand.addCard(deck.drawCard());

        // Player's turn
        playPlayerTurn();

        // Dealer's turn
        playDealerTurn();

        // Determine the winner
        findWinner();
    }

    private void playPlayerTurn() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Your hand: " + playerHand);
            System.out.println("Your hand value: " + playerHand.getValue());

            if (playerHand.getValue() > 21) {
                System.out.println("You busted! Dealer wins.");
                break;
            }

            System.out.print("Do you want to hit or stand? (h/s): ");
            String choice = scanner.nextLine();

            if (choice.equalsIgnoreCase("h")) {
                playerHand.addCard(deck.drawCard());
            } else if (choice.equalsIgnoreCase("s")) {
                break;
            }
        }
    }

    private void playDealerTurn() {
        while (dealerHand.getValue() < 17) {
            dealerHand.addCard(deck.drawCard());
        }

        System.out.println("Dealer's hand: " + dealerHand);
        System.out.println("Dealer's hand value: " + dealerHand.getValue());
    }

    private void findWinner() {
        int playerValue = playerHand.getValue();
        int dealerValue = dealerHand.getValue();

        if (playerValue > 21) {
            System.out.println("You busted! Dealer wins.");
        } else if (dealerValue > 21) {
            System.out.println("Dealer busted! You win.");
        } else if (playerValue > dealerValue) {
            System.out.println("You win!");
        } else if (playerValue < dealerValue) {
            System.out.println("Dealer wins.");
        } else {
            System.out.println("It's a tie!");
        }
    }
}