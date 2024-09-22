interface Roamable {
    fun roam()
}

abstract class Animal: Roamable {
    abstract val image: String
    abstract val food: String
    abstract val habitat: String
    var hunger = 10

    abstract fun makeNoise()

    abstract fun eat()

    override fun roam() {
        println("The animal is roaming")
    }

    fun sleep() {
        println("The animal is sleeping")
    }
}

class Hippo: Animal() {
    override val image = "Hippo.jpg"
    override val food = "Grass"
    override val habitat = "Water"

    override fun makeNoise() {
        println("Grunt! Grunt!")
    }

    override fun eat() {
        println("The Hippo is eating $food")
    }
}

abstract class Canine: Animal() {
    override fun roam() {
        println("Canine is roaming")
    }
}

class Wolf: Canine() {
    override val image = "wolf.gpj"
    override val food = "meat"
    override val habitat = "Forest"

    override fun makeNoise() {
        println("Hoooooow!")
    }

    override fun eat() {
        println("Wolf is eating $food")
    }
}

class Vehicle: Roamable {
    override fun roam() {
        println("The vehicle is roaming")
    }
}

class Vet {
    fun giveShot(animal: Animal) {
        animal.makeNoise()
    }
}

fun main(args: Array<String>) {
    val animals = arrayOf(Hippo(), Wolf())

    for (animal in animals) {
        animal.roam()
        animal.eat()
    }

    val vet = Vet()
    val wolf = Wolf()
    val hippo = Hippo()

    vet.giveShot(wolf)
    vet.giveShot(hippo)

    val roamables = arrayOf(Hippo(), Wolf(), Vehicle())

    for (item in roamables) {
        item.roam()
        if (item is Animal) {
            item.eat()
        }
    }
}
