import java.io.File
import kotlin.math.pow

fun main () {
    val listaGamma : MutableList<String> = mutableListOf()
    val listaEpsilon : MutableList<String> = mutableListOf()
    var values = File("C:\\Users\\34674\\IdeaProjects\\adventOfCode2022\\src\\main\\kotlin\\aoc2021_ex3.txt").readLines()
    for (j in values[0].indices){
        var counter = 0
        for (i in values.indices){
            if (values[i][j] == '1') counter +=1
            else counter -=1
        }

        listaGamma.add(if (counter>0) "1" else "0")
        listaEpsilon.add(if (counter<0) "1" else "0")
    }
    println(converterDecimal(listaEpsilon.toList(), listaGamma.toList()))
    var minimumValues = values
    var iterator = 0
    while (values.size != 1){
        var counter = 0
        for (i in values.indices){
            if (values[i][iterator] == '1') counter += 1
            else counter -= 1
        }
        if (counter > 0) values = values.filter { it[iterator] == '1' }
        else if (counter == 0) values = values.filter { it[iterator] == '1' }
        else values = values.filter { it[iterator] == '0' }
        iterator +=1
    }
    iterator = 0
    while (minimumValues.size > 1){
        var minimumCounter = 0
        for (i in minimumValues.indices){
            if (minimumValues[i][iterator] == '1') minimumCounter += 1
            else minimumCounter -= 1
        }
        if (minimumCounter > 0) minimumValues = minimumValues.filter { it[iterator] == '0' }
        else if (minimumCounter == 0) minimumValues = minimumValues.filter { it[iterator] == '0' }
        else minimumValues = minimumValues.filter { it[iterator] == '1' }
        iterator +=1
    }
    println(minimumValues)
    println(values)
    var sum = 0
    for (i in 0 .. values[0].lastIndex) {
        sum += values[0][i].toString().toInt() * Math.pow(2.0, values[0].length.toDouble()-1-i).toInt()
    }
    var secondSum = 0
    for (i in 0 .. minimumValues[0].lastIndex) {
        secondSum += minimumValues[0][i].toString().toInt() * Math.pow(2.0, minimumValues[0].length.toDouble()-1-i).toInt()
    }
    println(sum * secondSum)
}
fun converterDecimal (values:List<String>, minimumValues: List<String>):Int{
    var sum = 0
    for (i in values.indices) {
        sum += values[i].toInt() * Math.pow(2.0, values.size.toDouble()-1-i).toInt()
    }

    var secondSum = 0
    for (i in minimumValues.indices) {
        secondSum += minimumValues[i].toInt() * Math.pow(2.0, minimumValues.size.toDouble()-1-i).toInt()
    }
    return sum * secondSum
}