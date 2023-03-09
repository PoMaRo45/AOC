import java.io.File

fun main () {
    var counter = 0
    val values = File ("C:\\Users\\34674\\IdeaProjects\\adventOfCode2022\\src\\main\\kotlin\\puzzle.txt").forEachLine {
        val enemigo = it.split(" ")[0]
        val jo = it.split(" ")[1]
        val listaJo = listOf<String>("X", "Y", "Z")
        var selection:String = ""
        var loose = 0
        if (jo == "Y") loose = 1
        if (jo == "Z") loose = 2
        when (enemigo) {
            "A" -> {
                if (loose == 2) {
                    counter +=6
                    selection = "Y"
                }
                else if (loose == 1) {
                    counter +=3
                    selection = "X"
                }
                else selection ="Z"
            }
            "B" -> {
                if (loose == 2) {
                    counter +=6
                    selection = "Z"
                }
                else if (loose == 1) {
                    counter +=3
                    selection = "Y"
                }
                else selection ="X"
            }
            "C" -> {
                if (loose == 2) {
                    counter +=6
                    selection = "X"
                }
                else if (loose == 1) {
                    counter +=3
                    selection = "Z"
                }
                else selection ="Y"
            }
        }
        counter += listaJo.indexOf(selection)+1
    }
    println(counter)

}
