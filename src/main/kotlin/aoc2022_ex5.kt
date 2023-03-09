import java.io.File

fun main () {
    var values = File("/dades/POL-MARTINEZ/Intellij proyectos/aoc2022/aoc2022/src/main/kotlin/aoc2022_ex5.txt").readLines()
    var listaDeCajas : MutableList<MutableList<String>> = MutableList(9){ mutableListOf() }
    var iterator = 7
    for ( i in 7 downTo 0){
        for (j in 0 ..  8){
            if (values[i].chunked(4)[j].replace(" ", "") != "   "){
                listaDeCajas[j].add(values[i].chunked(4)[j].replace(" ", "").replace("[", "").replace("]",""))
            }
        }
    }
    for (i in listaDeCajas.indices){
        listaDeCajas[i] = listaDeCajas[i].filter { it != "" } as MutableList<String>
    }
//    listaDeCajas= listaDeCajas.map{ it->
//        it.filter { ot->
//            ot != ""
//        }
//    } as MutableList<MutableList<String>>
    for (i in 10 until values.size){
        val move = values[i].split(" ")[1].toInt()
        val from = values[i].split(" ")[3].toInt()-1
        val to = values[i].split(" ")[5].toInt()-1
        val positionRelative = listaDeCajas[from].lastIndex-move+1
        for (j in 0 until  move){
            listaDeCajas[to].add(listaDeCajas[from][positionRelative])
            listaDeCajas[from].removeAt(positionRelative)
        }
    }
    for (i in listaDeCajas.indices){
        print(listaDeCajas[i][listaDeCajas[i].lastIndex])
    }
}