/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package javaapplication1;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Silviu Patras
 */
public class JavaApplication1 {

    public static class Deck
    {
        private
        int[] deck = new int[53];
      
        public 
        int[] cardsP1 = new int[28];
        int[] cardsP2 = new int[28];
       Deck()
        {
          for(int i=0;i<53;i++)
              deck[i]=0;
        }
       
        void set2PlayersCards()
        {
          Random randomGenerator = new Random();
          int randomInt;
          for (int idx = 1; idx <= 26; ++idx)
          {  
              do{
            randomInt = randomGenerator.nextInt(14);
            
              }while(randomInt==1 || randomInt==0);
           cardsP1[idx]=randomInt;
        
           
           do{
            randomInt = randomGenerator.nextInt(14);
            
              }while(randomInt==1 || randomInt==0);
           cardsP2[idx]=randomInt;
         
          }
                
        }
        
    }
    
    public static class cardGames
    {
        private
        Deck deck = new Deck();
        int nrP1m;
        int nrP2m;
        
        cardGames()
        {
            nrP1m=0;
            nrP2m=0;
        }
       
        public
        void War()
        {
            deck.set2PlayersCards();
            
            for(int i=1;i<=26;++i)
            {  
                
                    System.out.print(deck.cardsP1[i]);
                    System.out.print(' ');
                    System.out.print(deck.cardsP2[i]);
                    System.out.print(' ');
                    
                    
                if(deck.cardsP1[i]>deck.cardsP2[i])
                {
                     nrP1m++;
                    System.out.println("P1 win");
                
                }
                
                if(deck.cardsP1[i]==deck.cardsP2[i])
                    System.out.println("Skip"); 
            
                if(deck.cardsP1[i]<deck.cardsP2[i])
                {
                     nrP2m++;
                    System.out.println("P2 win");

                }
            }
            
            System.out.println("Scoreboard:");
            System.out.print(nrP1m);
            System.out.print(' ');
            System.out.println(nrP2m);

            if(nrP1m>nrP2m)
                System.out.println("Player1 Won!");
            
            if(nrP1m<nrP2m)
                System.out.println("Player2 Won!");
            
        }
             
    }
    


    public static void main(String[] args)
    {
        
        Deck d1 = new Deck();
        cardGames G = new cardGames();
        G.War();
       
         //Scanner input=new Scanner(System.in); 
         //char[] array = input.nextLine().toCharArray();
        
         //System.out.println(array);
        

    }
    
}
