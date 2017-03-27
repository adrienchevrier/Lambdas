import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * Created by adrien on 13/03/17.
 * Collect the stream of teachers declared above to group the teaches according to their gender
 */
public class Teacher {
    private final String name;
    private final Gender gender;

    /*CONSTRUCTOR*/
    private Teacher(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }

    /*GETTERS*/
    private Gender getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    private enum Gender{
        MALE,
        FEMALE
    }


    /*MAIN*/
    public static void main(String[] args) {
        //We create a map sorting teachers by gender
        Map<Gender,List<Teacher>>teacher = (Stream.of(
                new Teacher("Ravault",Gender.MALE),
                new Teacher("Soukane",Gender.FEMALE),
                new Teacher("Palasi",Gender.FEMALE),
                new Teacher("Segado",Gender.MALE),
                new Teacher("Diedler",Gender.MALE))
                        .collect(Collectors.groupingBy(Teacher::getGender))
                );
        System.out.println(teacher);
    }

}
