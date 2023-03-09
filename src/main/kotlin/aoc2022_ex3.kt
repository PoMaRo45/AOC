import java.io.File
import javax.swing.text.MutableAttributeSet

fun main () {
//    val minLettersValue = listOf<Int>(1 .. 26)
    var suma = 0
    val values = File("C:\\Users\\34674\\IdeaProjects\\adventOfCode2022\\src\\main\\kotlin\\aoc2022_ex3.txt").readLines()
    for (i in 0 .. values.lastIndex-2 step 3){
        for (j in values[i]){
            if (j in values[i+1] && j in values[i+2]){
                suma += if (j.code in 97..122) {
                    j.code -  96
                } else j.code - 38
                break
            }
        }
    }
    println(suma)
}
