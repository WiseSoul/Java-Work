/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package besix;
import java.util.*;

/**
 *
 * @author Silviu Patras
 */
interface BLABLA {

 void sayHello();

    
}


class Copil implements BLABLA{
    public
    @Override
    void sayHello()
    {
        System.out.println("copilu HELLO");
    }
    
}

class Baietas implements BLABLA{
    public
    @Override
    void sayHello()
    {
        System.out.println("baietasu HELLO");
    }
    
}

class Array{
    public
     ArrayList<BLABLA> list;
    Array()
    {
        Baietas b = new Baietas();
        Copil n = new Copil();
        
        list = new ArrayList<BLABLA>();
        list.add(b);
        list.add(n);
        
        
    }
    
    void hello()
    {
       for(BLABLA object: list)
       {
           object.sayHello();
       }
            
    }
    
}
 