package `08_OOP1`.task7

class Bird(energy:Int, weight:Int, maxAge:Int, name:String):
    DescendantOfAnimal(energy,weight,maxAge, name) {
    override fun move(){
        println("$name is flying")
    }
    init {
        cntBirds++
    }
    override fun giveBirth(typeOfAnimal: String): Animal {
        cntBirds++
        return super.giveBirth("bird")
    }

    override fun birthInfo() {
        //super.birthInfo()
        println("The little bird with name: $name was born with energy:$energy, weight:$weight and maxAge:$maxAge")
    }
}