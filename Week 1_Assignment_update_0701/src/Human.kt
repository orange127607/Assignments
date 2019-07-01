import java.lang.IllegalArgumentException

open class Human(open val name: String, open val skill: String) {
    fun attack() {
        println("$name use $skill")
    }
}

class Mage(override val name: String, override val skill: String) : Human(name,skill) {
    var abilityAttack: String = ""
        set(value) {
            if (!value.startsWith("Fist")) {
                    throw IllegalArgumentException("Leo has no magic power")
            }
        field = value
        }
}

fun main() {
    val human = Human(name = "Leo", skill = "Fist Attack!")
    val mage = Mage(name = "Don", skill = "Fireball")

    human.attack()
    mage.attack()

    mage.abilityAttack = "Fireball"
    println(mage.abilityAttack)


}

