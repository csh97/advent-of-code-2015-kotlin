import java.io.BufferedReader

fun String.readFile(): String = read().readText()

fun String.readLines(): String = read().readText()

fun String.read(): BufferedReader = object {}.javaClass.getResourceAsStream("day01.txt")?.bufferedReader()
    ?: throw Exception("Cant read file: $this")