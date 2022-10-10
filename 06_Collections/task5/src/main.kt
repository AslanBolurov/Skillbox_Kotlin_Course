fun main() {
    var nIsCorrect=false
    var N:Int=0

    while (!nIsCorrect){
        print("Please, enter a count of numbers: ")
        N= readLine()?.toIntOrNull() ?: return
        if (N<=0) {
            println("N must be greater than zero")
            nIsCorrect=false
        }else {
            nIsCorrect = true
        }
    }
    var numbersList=getNumbersList(N)

    println("Numbers which starts with \"+7\": ${numbersList.
        filter { it.startsWith("+7")  }
        .joinToString(",") }")

    val distinctCount=numbersList.toSet().size
    println("The distinct count of numbers is $distinctCount")

    val sumOfLenghtsAllNumbers=numbersList.sumOf { it.length }
    println("The sum of lenght of all numbers in our list: $sumOfLenghtsAllNumbers")

    val numbersMutableMap:MutableMap<String,String> = mutableMapOf()
    numbersList.toSet().forEach{
        print("Enter person's name with phone number $it: ")
        val name= readLine().toString()
        numbersMutableMap.put(it,name)
    }
    numbersMutableMap.forEach{entry ->
        println("Person: ${entry.value}. Phone number:${entry.key}")
    }

    val numbersMutableMapSortedByKeys=numbersMutableMap.toSortedMap()
    println("Map sorted by Keys: $numbersMutableMapSortedByKeys")


    //version after consultation with teacher
    val numbersMutableMapSortedByValues=
        numbersMutableMap.toSortedMap(compareBy{numbersMutableMap[it] })
    println("Map sorted by Values: $numbersMutableMapSortedByValues")

}


fun getNumbersList(N: Int):MutableList<String>{
    var numbersList:MutableList<String> = mutableListOf()
    for (i in 1 .. N){
        print("Inter a number: ")
        numbersList.add(readln())
    }
    return numbersList
}