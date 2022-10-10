package `08_OOP1`.task7

class NatureReserve(

) {
    var birds: List<Bird> = mutableListOf(
        Bird(10,11,4, "Donald"),
        Bird(11,10,5, "Lastochka"),
        Bird(12,12,4, "Sokol"),
        Bird(14,13,5, "Vorobushek"),
        Bird(8,9,3, "Mickey NotMouse")
    )

    val fishes: List<Fish> = mutableListOf(
        Fish(11,7,6, "Dorri"),
        Fish(12,8,8, "Nemo"),
        Fish(10,6,5, "Sharkidon"),
    )
    val dogs: List<Dog> = mutableListOf(
        Dog(20,30,25, "Barbos"),
        Dog(25,35,23, "Sharick"),
    )
    val otherAnimals: List<Animal> = mutableListOf(
        OtherAnimal(50,140,40, "KingKong"),
        OtherAnimal(60,150,30, "MelmanGiraffe"),
        OtherAnimal(80,100,10, "GenaCrocodile")
    )

    fun removeFromNV(animalType:String, element:Any){
        when(animalType){
            "bird" -> {
                birds.remove(element)
                Animal.cntBirds--
            }
            "fish" -> {
                fishes.remove(element)
                Animal.cntFishes--
            }
            "dog" -> {
                dogs.remove(element)
                Animal.cntDogs--
            }
            "otherAnimal" -> {
                otherAnimals.remove(element)
                Animal.cntOtherAnimals--
            }
        }
    }

}

private fun <E> List<E>.remove(element: E) {
    this.remove(element)
}
