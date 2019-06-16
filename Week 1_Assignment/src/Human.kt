class Human(name: String = "Leo") {
    val name: String = "Leo"
    fun attack() {
        println("$name use Fist Attack! ")
    }
}
class Mage(name: String = "Don") {
    val name: String = "Don"
    fun attack() {
        println("$name use Fireball! ")
    }
}
fun main() {
    val human = Human(name = "Leo")
    val mage = Mage(name = "Don")

    human.name
    human.attack()

    mage.name
    mage.attack()
}
