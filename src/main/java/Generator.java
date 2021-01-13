import org.ajbrown.namemachine.Gender;
import org.ajbrown.namemachine.NameGenerator;

public class Generator {

    public static void main(String[] args) {
        NameGenerator nameGenerator = new NameGenerator();
        System.out.println(nameGenerator.generateName());
        System.out.println(nameGenerator.generateNames(3));
        System.out.println(nameGenerator.generateName(Gender.MALE));
        System.out.println(nameGenerator.generateName(Gender.FEMALE));
        System.out.println(nameGenerator.generateNames(5, Gender.FEMALE));
        System.out.println(nameGenerator.generateNames(5, Gender.MALE));
    }
}
