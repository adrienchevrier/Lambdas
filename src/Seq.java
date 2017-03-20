
import java.util.Objects;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nicolas
 */
public interface Seq {
    /*we only put the prototype of the function here since it is an interface*/
    Seq forEach(Cons consumer);

    /*it will be defined in the classes implementing the interface*/
    void display();

    static Seq nil() {
        return new Nil();
    }

    public Seq prepend(String str);



    /*INNER CLASSES*/
    /*Creating a static nested class allows to interact with its outer
     * class and other classes just like any top-level class, whereas
      * an inner class can only exist within an instance of its outer class*/

    /*Cons class*/
      class Cons implements Seq {

        private final Object element;
        private final Seq next;

        Cons(Object element, Seq next) {

            this.element = Objects.requireNonNull(element);
            this.next = Objects.requireNonNull(next);
        }

        /*Add new consumer at beginning of list*/
        public Seq prepend(String str){
            return new Cons(str,this);
        }

        @Override
        public Seq forEach(Cons consumer) {
            /*Check class type of next element to find Nil*/
            if (consumer.next.getClass()==((new Seq.Nil()).getClass())){
                return consumer;
            }

            return forEach((Cons) consumer.next);
        }

        public void display ()
        {
            System.out.println(element);
        }

    }
    /*Nil class*/
    class Nil implements Seq {

        Nil() {

            //empty
        }

        /*Add new consumer at beginning of list*/
        public Seq prepend(String str){
            return new Cons(str,this);
        }

        @Override
        public Seq forEach(Cons consumer) {
            return null;
        /*To change body of generated methods, choose Tools | Templates.*/


        }

        @Override
        public void display() {
        /*To change body of generated methods, choose Tools | Templates.*/
            throw new UnsupportedOperationException("Not supported yet.");

        }
    }
}


