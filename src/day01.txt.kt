fun part1(input: String): Int {
    return input.toCharArray().fold(0) { floor, char ->
        when(char) {
            '(' -> floor + 1
            ')' -> floor - 1
            else -> floor
        }
    }
}

fun part2(input: String): Int {
    return input.toCharArray().fold(0 to 0) { (floor, index), char ->
        if (floor == -1) return@part2 index
        when(char) {
            '(' -> (floor + 1) to index + 1
            ')' -> floor - 1 to index + 1
            else -> floor to index + 1
        }
    }.first
}

fun main() {
    val input = "day01.txt".readFile()
    println("Part 1: ${part1(input)}")
    println("Part 2: ${part2(input)}")
}