/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package besix;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Silviu Patras
 */


    
public class BeSix {

    /**
     * @param args the command line arguments
     */
    
    public static class Turbo6
    {
    private 
    int[] v = new int[50];
    int[] ticket = new int[7];
    
    boolean check(int random,int index)
    {
        for(int i=0;i<=index;i++)
            if(random==v[i])
                return false;
        
        return true;
    }
    
    void pickNumbers()
    {
        int i,randomInt,j=0;
        Random randomGenerator = new Random();

        for(i=0;i<49;i++)
        {
         
            do{
            randomInt = randomGenerator.nextInt(50);
            }while(check(randomInt,i)==false || randomInt==0);
            
           v[i]=randomInt;
                    
        }        
    }
    
   
    public
    Turbo6(int[] a)
    {
        for(int j=0;j<49;j++)
            v[j]=0;
        
        for(int i=0;i<6;i++)
        {
            ticket[i]=a[i];
        }
    }
    
    void isWinner()
    {
        int contor=0,ok=0;
        int[] aux = new int[7];
        
        for(int i=0;i<6;i++)
            aux[i]=ticket[i];
        
        pickNumbers();
        
        for(int i=0;i<7;i++)
        for(int j=0;j<35;j++)
        {
            if(ticket[i]==v[j])
            {
                contor++;
                ticket[i]=0;
                break;
               
            }
        }
        
                for(int j=0;j<35;j++)
                {System.out.print(v[j]);
                  System.out.print(' ');}
                
                System.out.println();
                
                for(int j=0;j<6;j++)
                 {System.out.print(ticket[j]);
                  System.out.print(' ');}
                
        
        if(contor==6)
        {
            System.out.println("CASTIGATOR!");
            
            for(int i=34;i>=0;i--)
            {
            for(int j=0;j<7;j++)
            {
                if(aux[j]==v[i])
                {
                    System.out.print("Ai castigat ");
                    System.out.print(6000/i);
                    System.out.println(" lei!");
                    ok=1;
                    break;                
                }   
            }
            
        if(ok==1)
            break;
            }
            
        }
   
        else
        {   System.out.println();
            System.out.print(contor);
            System.out.print(" din 6 -> ");   
            
            System.out.println("NECASTIGATOR!");
        }
        
    }

    }
    
 
    
    public static void main(String[] args) {

            int[] v = new int[7];
            int i=0;
                  // v[0]=42;v[1]=16;v[2]=22;v[3]=9;v[4]=5;v[5]=1;
                       
             
            System.out.println("Introduceti 6 numere:");
            Scanner scan=new Scanner(System.in); 
            
            for(i=0;i<6;i++)
            {
            
            do{
            v[i] = scan.nextInt();
            }while(v[i]<0 || v[i]>50 );
            
            }
            
       /*     
            Array a = new Array();
            a.hello();
*/            
            Turbo6 game = new Turbo6(v);
            game.isWinner();

    }
    
}