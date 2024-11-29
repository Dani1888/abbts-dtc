import kotlin.random.Random
import kotlin.random.nextInt

/**
 * Simuliert ein einfaches Würfelspiel zwischen dem
 * Computer und einem Spieler
 *
 * Autor: Andreas Wassmer
 * Version: 20241120
 */

fun main() {
    while (true) {
        val die = Random

        val playerScore = die.nextInt(1..6)
        val computerScore = die.nextInt(1..6)

        // Todo: Den Fehler im Programm finden und beheben
        // Todo: Den Spieler nach dem Namen fragen
        // Todo: Solange spielen bis Spieler abbricht
        // Todo: Ausgeben, wer mehr Runden gewonnen hat


        print("Gib deinen Namen ein: ")
        val name = readLine() ?: "" // Read user input and handle potential null
        println("Name = $name: ")






        ///
        println("Du würfelst: $playerScore  --  Computer würfelt: $computerScore")
        when {
            playerScore > computerScore -> println("Du gewinnst")
            playerScore < computerScore -> println("Der Computer gewinnt")
            else -> println("Unentschieden")
        }
    }
}