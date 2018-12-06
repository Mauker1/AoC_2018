package day01

import java.io.File

const val PATH = "src/day01/input.txt"

fun main(args: Array<String>) {
    println(part1())
    println(part2())
}

private fun part1() = File(PATH).readLines().sumBy { it.toInt() }

private fun part2(): String {
    val inputList = File(PATH).readLines().map { it.toInt() }
    var frequency = 0

    val frequencySet = HashSet<Int>()

    while (true) {
        inputList.forEach {
            frequencySet.add(frequency)
            frequency += it
            if (frequencySet.contains(frequency)) {
                return frequency.toString()
            }
        }
    }
}