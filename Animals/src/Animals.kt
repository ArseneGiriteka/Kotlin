open class Animal {
    open val image = ""
    open val food = ""
    open val habitat  = ""
    var hunger = 10

    open fun makeNoise() {
        println("The animal is making noise")
    }

    open fun eat() {
        println("The animal is eating")
    }

    open fun roam() {
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

open class Canine: Animal() {
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
}
