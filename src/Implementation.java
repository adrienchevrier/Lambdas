
import java.util.Objects;
import java.util.function.Consumer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nicolas
 */
public class Implementation implements Seq {

    @Override
    public void forEach(Consumer consumer) {
       
    }

    @Override
    public void display() {
       
    }

   private class Cons implements Seq {
    
    private final Object element;
    private final Seq next;
    
    public Cons (Object element, Seq next) {
        
        this.element = Objects.requireNonNull(element);
        this.next = Objects.requireNonNull(next);
    }

    @Override
    public void forEach(Consumer consumer) {
        
        consumer.accept(next);
    }
    
    public void display ()
    {
        System.out.println(element);
    }
    
}
   
   private abstract class Nil implements Seq {
    
    public Nil() {
        
        //empty
    }    

   
}

}
