/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nicolas
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Seq seq = new Cons("hello",new Cons("world", new Nil()));
        seq.display(); // We call the display function that is defined in the interface
                       // and implemented in the seq class that implements the abstract Seq class
                       
        
    }
    
}
