import java.io.File

fun main (){
    var final = 0
    val values = File("C:\\Users\\34674\\IdeaProjects\\adventOfCode2022\\src\\main\\kotlin\\aoc2020_ex2.txt").forEachLine {
        val rango = it.split( " " )[0]
        val firstNumberRange = rango.split("-")[0].toInt()-1
        val secondNumberRange = rango.split("-")[1].toInt()-1
        val orden = it.split( " " )[1].replace(":", "")
        val password = it.split( " " )[2]
        if (password[firstNumberRange].toString() == orden  && password[secondNumberRange].toString() != orden){
            final +=1
        }
        else if (password[firstNumberRange].toString() != orden  && password[secondNumberRange].toString() == orden){
            final += 1
        }
    }
    println(final)
}