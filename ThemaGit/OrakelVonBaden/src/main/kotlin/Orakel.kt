import kotlin.random.Random

/**
 * Gibt beim Start einen Sinnspruch , ein Glückssymbol und eine Glückszahl
 * aus.
 *
 * Autor: Andreas Wassmer
 * Version: 20241120
 */

// Die Sprüche des Tages
val spells = listOf("Nutze den Tag.", "Heute ist ein toller Tag.")

// Todo: Hier die Liste mit den Glückssymbolen einfügen
// Liste mit Glückssymbolen
val glueckssymbole = listOf(
    "🍀 Kleeblatt",
    "🐞 Marienkäfer",
    "🐖 Glücksschwein",
    "🧲 Hufeisen",
    "🎋 Bambus",
    "🌟 Stern",
    "🪙 Münze",
    "🏵️ Blume des Lebens",
    "🦉 Eule",
    "🐘 Elefant"
)


fun main() {
    val random = Random
    val index = random.nextInt(spells.size)
    println("Dein Leitspruch heute: ${spells[index]}")

    val index2 = random.nextInt(glueckssymbole.size)
    println("Dein Glückssymbol heute ist: ${glueckssymbole[index2]}")
    // Todo: Hier das Glückssymbol ausgeben

    println("Deine Glückszahl ist $index2")
    // Todo: Hier die Glückszahl berechnen und ausgeben
}