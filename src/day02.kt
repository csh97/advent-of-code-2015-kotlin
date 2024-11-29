private fun part1(input: List<String>): Int {
    return input.sumOf {
        val dimensions = it.split("x").let { Triple(it[0].toInt(), it[1].toInt(), it[2].toInt()) }

        val a = dimensions.first * dimensions.second
        val b = dimensions.second * dimensions.third
        val c = dimensions.third * dimensions.first

        (a * 2) + (b * 2) + (c * 2) + listOf(a, b, c).min()
    }
}

private fun part2(input: List<String>) {
    //smallest perimeter
    input.map {
        val dimensions = it.split("x").let { Triple(it[0].toInt(), it[1].toInt(), it[2].toInt()) }

        val a = dimensions.first * dimensions.second
        val b = dimensions.second * dimensions.third
        val c = dimensions.third * dimensions.first

        val smallest = listOf(a, b, c).min()

        (a * 2) + (b * 2) + (c * 2) + smallest
    }
}

fun main() {
    println("Part 1: ${part1("day02.txt".readLines())}")
}