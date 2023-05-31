/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

/**
 * @author dilpreet singh  , student number = 991676940
 */
import java.util.Random;
import java.util.Scanner;
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            Random random = new Random();
            c.setValue(random.nextInt(13) + 1);
            c.setSuit(Card.SUITS[random.nextInt(4)]);
            magicHand[i] = c;
        }
         Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value of the card (1-13): ");
        int usrCardValue = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Enter suit of the card (Hearts, Diamonds, Spades, Clubs): ");
        String usrCardSuit = scanner.nextLine();

        Card userCard = new Card();
        userCard.setValue(usrCardValue);
        userCard.setSuit(usrCardSuit);

        boolean found = false;
        for (Card card : magicHand) {
            if (card.getValue() == userCard.getValue() && card.getSuit().equals(userCard.getSuit())) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Card found ");
        } else {
            System.out.println("Card not found ");
        }
       
    }
    
}
