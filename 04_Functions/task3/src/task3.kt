fun main() {

    println(decipherMain ("F2p)v\"y233{0->c}ttelciFc"))

}


fun decipherMain(str: String):String{

    var strFirstPart=""
    var strSecondPart=""
    strFirstPart=str.takeLast(str.length/2)
    strSecondPart=str.take(str.length/2)

    return "${decipherFirstPart(strSecondPart)}${decipherSecondPart(strFirstPart)}"


}

fun decipherFirstPart(str:String):String{
    return str.shift(1)
        .replace("5","s",false)
        .replace("4","u",false)
        .shift(-3)
        .replace("0","o",false)
}
fun decipherSecondPart(str:String):String{
    return str.reversed()
    .shift(-4)
    .replace("_"," ",false)
}
private fun String.shift(offset:Int):String = this.map { letter -> letter + offset}.joinToString("")





