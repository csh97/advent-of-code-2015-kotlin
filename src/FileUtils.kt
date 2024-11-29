import java.io.BufferedReader

fun String.readFile(): String = read().readText()

fun String.readLines(): List<String> = read().readLines()

fun String.read(): BufferedReader = object {}.javaClass.getResourceAsStream(this)?.bufferedReader()
    ?: throw Exception("Cant read file: $this")