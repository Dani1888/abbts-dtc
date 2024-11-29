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
    println("Drücke ESC, um das Programm zu beenden.")

    print("Gib deinen Namen ein: ")
    val name = readLine() ?: "" // Read user input and handle potential null
    println("Name = $name: ")

    while (true) {

        val die = Random

        val playerScore = die.nextInt(1..6)
        val computerScore = die.nextInt(1..6)

        // Todo: Den Fehler im Programm finden und beheben
        // Todo: Den Spieler nach dem Namen fragen
        // Todo: Solange spielen bis Spieler abbricht
        // Todo: Ausgeben, wer mehr Runden gewonnen hat


        println("Du würfelst: $playerScore  --  Computer würfelt: $computerScore")
        when {
            playerScore > computerScore -> println("Du gewinnst")
            playerScore < computerScore -> println("Der Computer gewinnt")
            else -> println("Unentschieden")
        }

        // Abbruch
        println("Wollen sie abbrechen drücken sie q")
        val key = System.`in`.read() // Liest den ASCII-Wert der gedrückten Taste
        println("Key = $key")

        if (key == 113) { // 27 ist der ASCII-Wert für ESC
            println("ESC gedrückt. Programm wird beendet.")
            break
        } else {
            println("Gedrückte Taste: $key (ASCII-Wert: $key)")
        }
    }
}
