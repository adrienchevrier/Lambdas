
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
public interface Seq {
    //empty for now
    
    public void forEach(Consumer consumer); // we only put the prototype of the function here since it is an interface
    public void display();                                       // it will be defined in the classes implementing the interface
}