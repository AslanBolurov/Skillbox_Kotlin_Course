package `08_OOP1`.task7

import kotlin.random.Random

open class Animal(
    var energy: Int,
    var weight: Int,
    val maxAge: Int,
    val name: String
) {
    constructor( maxAge: Int, name: String):this(Random.nextInt(1,10),
        Random.nextInt(1,5),
        maxAge,
        name){
        cntOtherAnimals++
    }
    init {
        cntAnimals = cntBirds + cntDogs + cntFishes + cntOtherAnimals
    }


    var currentAge: Int = 0
    val isTooOld = currentAge >= maxAge

    fun sleep(){
        energy+=5
        currentAge++
        println("$name is sleeping")
    }
    fun eat(){
        energy+=3
        weight++
        tryIncrementAge()
        println("$name is eating")
    }
    open fun move(){
        if (energy -5 >=0) energy -=5
        if (weight-1>=0) weight--
        tryIncrementAge()
        println("$name is moving")
    }


    fun tryIncrementAge(){
        if (Random.nextBoolean())currentAge++
    }
    open fun giveBirth(typeOfAnimal:String="animal"): Animal {

        val maxAge=this.maxAge
        val name=this.name
        val energy=Random.nextInt(1,10)
        val weight = Random.nextInt(1,5)
        println("The little $typeOfAnimal with name: $name was born with energy:$energy, weight:$weight and maxAge:$maxAge")
        cntAnimals++
        return Animal(energy,weight,maxAge, name)
    }
    open fun birthInfo(){
        println("$name was born with energy:$energy, weight:$weight and maxAge:$maxAge")
    }
    companion object{
        var cntAnimals=0
        var cntBirds=0
        var cntFishes=0
        var cntDogs=0
        var cntOtherAnimals=0

    }

}
