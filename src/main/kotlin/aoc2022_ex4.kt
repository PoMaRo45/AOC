import java.io.File

fun  main () {
    var counter = 0
    val values = File("C:\\Users\\34674\\IdeaProjects\\adventOfCode2022\\src\\main\\kotlin\\aoc2022_ex4.txt").forEachLine {
        val firstElf = it.split(",")[0]
        val firstValueFirst = firstElf.split("-")[0].toInt()
        val secondValuesFirst = firstElf.split("-")[1].toInt()
        val secondElf = it.split(",")[1]
        val firstValueSecond = secondElf.split("-")[0].toInt()
        val secondValuesSecond = secondElf.split("-")[1].toInt()
        if (firstValueFirst <= firstValueSecond && secondValuesFirst >= secondValuesSecond || firstValueSecond<=firstValueFirst && secondValuesSecond>= secondValuesFirst){
            counter +=1
        }
    }
    println(counter)
}