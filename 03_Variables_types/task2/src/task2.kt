fun  main() {
    val firstName="Aslan"
    val lastName="Bolurov"
    var height=179.0
    val weight=71F
    val isChild=if (height<150 || weight<40){
        true
    }else{
        false
    }
    val info="I'm $firstName $lastName. My height is $height centimeters and my weight is $weight kilograms. " +
            "Am I child? Answer: ${if (isChild) "Yes" else "No"} ))"
    print(info)
    height=181.0
    print(info)

}