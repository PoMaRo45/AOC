import java.io.File

fun main () {
    val values = File("C:\\Users\\34674\\IdeaProjects\\adventOfCode2022\\src\\main\\kotlin\\aoc2020_ex1.txt").readLines()
    for (i in values.indices){
        for (j in values.indices){
            for (h in values.indices){
                if (values[i].toInt() + values[j].toInt() + values[h].toInt() == 2020 ){
                    println( values[i].toInt() * values[j].toInt() * values[h].toInt())
                    break
                }
            }
        }
    }
}