/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 */


import java.util.Scanner;
public class CardTrick {
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue((int)(Math.random()*13 + 1));
            c.setSuit(Card.SUITS[(int)(Math.random()* 3 + 0)]);
            
            magicHand[i] = c;
            System.out.println(magicHand[i].getSuit()+ " " + magicHand[i].getValue());
        }
        
        //insert code to ask the user for Card value and suit, create their card
        Card userCard = new Card();
        
        System.out.println("Enter a suit for you card: ");
        String userSuit = input.next();
        
        System.out.println("Enter a value for your card: ");
        int userValue = input.nextInt();
        
        userCard.setSuit(userSuit);
        userCard.setValue(userValue);

        System.out.println(userCard.getSuit()+ " " + userCard.getValue());
        // and search magicHand here
        for (int i=0; i<magicHand.length; i++){
        
                if(magicHand[i].getSuit().equals(userCard.getSuit())&& magicHand[i].getValue()==userCard.getValue()){
                
                    System.out.println("It matches");
                }
                else{
                    System.out.println("There is no match");
                }
        }
        
            
        
            
        
        //Then report the result here
    }
}
    

