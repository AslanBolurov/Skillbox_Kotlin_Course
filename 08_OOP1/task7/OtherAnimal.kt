package `08_OOP1`.task7

class OtherAnimal(
    energy:Int,weight:Int,
    maxAge:Int,name:String):
    DescendantOfAnimal(energy,weight,maxAge, name) {

    init {
        cntOtherAnimals++
    }

    override fun move(){
        println("$name is moving")
    }

    override fun giveBirth(typeOfAnimal: String): Animal {
        cntOtherAnimals++
        return super.giveBirth("fish")
    }
    override fun birthInfo() {
        //super.birthInfo()
        println("The little monster with name: $name was born with energy:$energy, weight:$weight and maxAge:$maxAge")
    }
}