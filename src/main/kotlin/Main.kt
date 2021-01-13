import org.ajbrown.namemachine.Gender
import org.ajbrown.namemachine.NameGenerator

fun main(args: Array<String>) {
    var nameGenerator = NameGenerator()

    println(nameGenerator.generateName())
    println(nameGenerator.generateNames(3))
    println(nameGenerator.generateName(Gender.MALE))
    println(nameGenerator.generateName(Gender.FEMALE))
    println(nameGenerator.generateNames(5, Gender.MALE))
    println(nameGenerator.generateNames(5, Gender.FEMALE))

}