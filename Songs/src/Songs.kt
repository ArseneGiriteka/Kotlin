class Song (val title: String, val artist: String){
    fun play(){
        println("Playing the song $title by $artist")
    }

    fun stop(){
        println("Stop playing $title")
    }
}

fun main(args: Array<String>){
    val songOne = Song("The Mesopotamians", "They must be Giants")
    val songTwo = Song("Going Underground", "The Jam")
    val songThree = Song("Make Me Smile", "Steve Harley")
    songTwo.play()
    songTwo.stop()
    songThree.play()
}