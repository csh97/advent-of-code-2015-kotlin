private fun part1(input: String): Int {
    println(input)

    val result = input.map { it.toString() }.fold((0 to 0) to setOf(0 to 0)) { (current, visited), direction ->
        val next = when (direction) {
            ">" -> current.first to current.second + 1
            "<" -> current.first to current.second - 1
            "^" -> current.first + 1 to current.second
            "v" -> current.first - 1 to current.second
            else -> current
        }

        next to visited + next
    }

    return result.second.count()
}

fun main() {
    println("Part 1: ${part1("day03.txt".readFile())}")
}