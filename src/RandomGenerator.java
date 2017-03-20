
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import static java.util.stream.StreamSupport.intStream;
import static java.util.stream.StreamSupport.intStream;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nicolas
 */
public class RandomGenerator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    Random random = new Random();  //we create a Random object so that we can use its property to generate random numbers
       
    IntStream intStream = random.ints(1, 100); // we create numbers between 1 and 100
    intStream.limit(1000).forEach(System.out::println); // for each stream we put the print out action
       
    }
    
}
