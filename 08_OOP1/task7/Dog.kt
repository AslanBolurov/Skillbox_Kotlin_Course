package `08_OOP1`.task7

class Dog(
    energy:Int,
    weight:Int,
    maxAge:Int,name:String):
    DescendantOfAnimal(energy,weight,maxAge, name) {

    init {
        cntDogs++
    }
    override fun move(){
        println("$name is running")
    }

    override fun giveBirth(typeOfAnimal: String): Animal {
        cntDogs++
        return super.giveBirth("dog")

    }

    override fun birthInfo() {
        //super.birthInfo()
        println("The little dog with name: $name was born with energy:$energy, weight:$weight and maxAge:$maxAge")
    }
}