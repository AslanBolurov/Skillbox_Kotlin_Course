fun main() {

    var nIsCorrect=false
    var n:Long=0

    while (!nIsCorrect){
        print("Please, enter a number: ")
        n= readLine()?.toLongOrNull() ?: return
        if (n<0) {
            println("input must be greater than or equal 0")
            nIsCorrect=false
        }else {
            nIsCorrect = true
        }
    }
    println("${n}th term of the fibonacci sequence is : ${getNumberFibonacci(n)}")

}

fun getNumberFibonacci(n:Long):Long {
    when (n){
        in 0..1 -> return 0
        2L -> return 1
        else -> {
            var term1=0L
            var term2=1L
            var sum=0L
            var counter=3L
            //version with while
//            while(counter <=n){
//                sum=term1+term2
//                term1=term2
//                term2=sum
//                counter++
//            }
            //version with for
            for (counter in 3..n){
                sum=term1+term2
                term1=term2
                term2=sum

            }
            return sum
        }
    }
}

