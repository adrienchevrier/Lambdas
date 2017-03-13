import java.util.Comparator;
import java.util.TreeSet;

/**
 * Created by adrien on 13/03/17.
 *
 */
public class Hello {
    private TreeSet<String> treeSet;
    private TreeSet<String> treeSetLambda;//treeset using lambdas

    /*CONSTRUCTOR*/
    public Hello() {
        //Print Hello World using lambdas
        Thread thread = new Thread(() -> System.out.println("Hello World!"));
        thread.start();

        /*
        * The following code is uselessly complicated because we need to
        * define a new treeSet and call the function recursively,
        * whereas it could be written in 1 line with a stream*/
        treeSet = new TreeSet<>(new Comparator<String>(){
            @Override
            public int compare(String s1, String s2){
                return s1.compareTo(s2);
            }
        });
        /*By replacing the functions with lambdas within the IDE,
        We create correct lambda functions, this is false fir Android
        developing, which does not manages lambdas the same way*/
        treeSetLambda = new TreeSet<>(String::compareTo);
    }

    public static void main(String[] args) {
        Hello hello = new Hello();
        System.out.println("compare hello and hello:"+hello.treeSet.comparator().compare("hello","hello"));//print result of "normal" comparison
        System.out.println("compare hello and hello with lambdas:"+hello.treeSetLambda.comparator().compare("hello","hello"));////print result of "lambda" comparison
    }
}
