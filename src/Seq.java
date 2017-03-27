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
interface Seq<T> {
    /*we only put the prototype of the function here since it is an interface*/
    void forEach(Consumer consumer);

    /*it will be defined in the classes implementing the interface*/
    void display();
    static Seq nil() {
        return new Nil();
    }

    Seq prepend(T str);


    /*INNER CLASSES*/
    /*Creating a static nested class allows to interact with its outer
     * class and other classes just like any top-level class, whereas
      * an inner class can only exist within an instance of its outer class*/

    /*Cons class*/
      class Cons<T> implements Seq {

        private final T element;
        private final Seq next;

        Cons(T element, Seq next) {

            this.element = Objects.requireNonNull( element);
            this.next = Objects.requireNonNull(next);
        }




        @Override
        public void forEach(Consumer consumer) {
            /*execute foreach with next element*/

            consumer.accept(element);
            next.forEach(consumer);
        }

        public void display ()
        {
            System.out.println(element);
        }

        /*Add new consumer at beginning of list*/
        @Override
        public Seq prepend(Object str) {
            return  new Cons<>( str,this);
        }

    }
    /*Nil class*/
    class Nil<T> implements Seq {

        Nil() {

            //empty
        }

        /*Add new consumer at beginning of list*/
        @Override
        public Seq prepend(Object str){
            return  new Cons<>(str,this);
        }

        @Override
        public void forEach(Consumer consumer) {
        /*To change body of generated methods, choose Tools | Templates.*/
        }

        @Override
        public void display() {
        /*To change body of generated methods, choose Tools | Templates.*/
            throw new UnsupportedOperationException("Not supported yet.");

        }
    }
}


