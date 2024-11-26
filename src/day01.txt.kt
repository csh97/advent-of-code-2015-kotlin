fun part1(input: String): Int {
    return input.toCharArray().fold(0) { floor, char ->
        when(char) {
            '(' -> floor + 1
            ')' -> floor - 1
            else -> floor
        }
    }
}

fun main() {
    val input = "day01.txt".readFile()
    println("Part 1: ${part1(input)}")
}