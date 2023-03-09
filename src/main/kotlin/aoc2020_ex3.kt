import java.io.File

fun main (){
    val values = File("/dades/POL-MARTINEZ/Intellij proyectos/aoc2022/aoc2022/src/main/kotlin/aoc2020_ex3.txt").readLines()
    println(treeCounter(3,1,values))
    println(treeCounter(1,2,values))
    println(treeCounter(1,1, values) * treeCounter(3,1, values) * treeCounter(5,1, values) * treeCounter(7,1, values) * treeCounter(1, 2, values))
}
fun treeCounter (pendientederecha: Int, pendienteAbajo:Int, values: List<String>):Long{
    var arboles = 0L
    var derecha = 0
    var abajo = 0
    while (abajo != values.size){
        if (values[abajo][derecha] == '#') {
            arboles += 1
        }
        if (derecha + pendientederecha > values[1].length - 1) {
            derecha = (derecha + pendientederecha) % 31
        } else derecha += pendientederecha
        if (abajo + pendienteAbajo > values.size) break
        else abajo += pendienteAbajo
    }
    return arboles
}