fun main() {
    val wordArray1 = arrayOf("Harry Kane", "Jamal Musiala", "Bernaldo Silva", "Rodri", "Virgil Van Djik", "Manuel Nuer")
    val wordArray2 = arrayOf("Has", "Scored", "Played")
    val wordArray3 = arrayOf("3 gaols", "89 passes", "71 assists")

    val wordArray1Size = wordArray1.size
    val wordArray2Size = wordArray2.size
    val wordArray3Size = wordArray3.size

    val rand1 = (Math.random() * wordArray1Size).toInt()
    val rand2 = (Math.random() * wordArray2Size).toInt()
    val rand3 = (Math.random() * wordArray3Size).toInt()

    println("${wordArray1[rand1]} ${wordArray2[rand2]} ${wordArray3[rand3]}")
}
