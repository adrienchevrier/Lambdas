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

        //Seq seq = new Seq.Cons("bye",new Seq.Cons(" bye", new Seq.Nil()));
        //Seq seq2 = new Seq.Cons("hello",new Seq.Cons("world", seq));
        //System.out.println(seq2.forEach((Seq.Cons) seq2));
        Seq seq = Seq.nil();
        Seq seq2 = seq.prepend("world").prepend("Hello");
        seq2.forEach(System.out::println);

        /*
          We call the display function that is defined in the interface
          and implemented in the seq class that implements
          the abstract Seq class
        */
        //seq.display();
    }
}
