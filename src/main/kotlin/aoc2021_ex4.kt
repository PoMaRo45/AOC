import java.io.File

fun main () {
    var values : MutableList<String>  = File("C:\\Users\\34674\\IdeaProjects\\adventOfCode2022\\src\\main\\kotlin\\aoc2021_ex4.txt").readLines() as MutableList<String>
    val ordendes = values[0].split(",")
    val tableros : MutableList<MutableList<MutableList<Int>>> = mutableListOf(mutableListOf(mutableListOf()))
    values.removeAt(1)
    values.removeFirst()
    var iterator = 0

}