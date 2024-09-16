fun main(args: Array<String>){
    val options = arrayOf("Rock", "Paper", "Scissors")
    val gameChoice = getGameChoice(options)
    val userChoice = getUserChoice(options)

    printResult(userChoice, gameChoice)
}

fun getGameChoice(optionParam: Array<String>) =
    optionParam[(Math.random() * optionParam.size).toInt()]

fun getUserChoice(optionParam: Array<String>): String{
    var isValidChoice = false
    var userChoice = ""

    while (!isValidChoice) {
        print("Please enter one of the following:")
        for (item in optionParam) print(" $item")
        print(".")
        val userInput = readLine()
        if (userInput != null && userInput in optionParam) {
            userChoice = userInput
            isValidChoice = true
        }
        if (!isValidChoice) print("You must enter a valid choice.")
    }
    return userChoice
}

fun printResult(userChoice: String, gameChoice:String) {
    val result: String

    if (userChoice == gameChoice) result = "Tie!"
    else if ((userChoice == "Rock" && gameChoice == "Scissors") ||
        (userChoice == "Scissors" && gameChoice == "Paper") ||
        (userChoice == "Paper" && gameChoice == "Rock")) result = "You win!"
    else result = "You lose!"
    println("You chose $userChoice. I chose $gameChoice. $result")
}