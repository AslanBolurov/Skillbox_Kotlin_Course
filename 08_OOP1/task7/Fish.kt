package `08_OOP1`.task7

class Fish(
    energy:Int,weight:Int,
    maxAge:Int,name:String):
    DescendantOfAnimal(energy,weight,maxAge, name) {

    init {
        cntFishes++
    }

    override fun move(){
        println("$name is swimming")
    }

    override fun giveBirth(typeOfAnimal: String): Animal {
        cntFishes++
        return super.giveBirth("fish")
    }
    override fun birthInfo() {
        //super.birthInfo()
        println("The little fish with name: $name was born with energy:$energy, weight:$weight and maxAge:$maxAge")
    }
}