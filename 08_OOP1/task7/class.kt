package `08_OOP1`.task7

import kotlin.random.Random
import kotlin.random.nextInt

fun main(){

    val N:Int=200//count iterations

    val NR= NatureReserve()
    println("After initialization in the natural reserve is " +
            "${Animal.cntBirds} birds, " +
            "${Animal.cntFishes} fishes, " +
            "${Animal.cntDogs} dogs, " +
            "and ${Animal.cntOtherAnimals} over animals. " +
            "Total: ${Animal.cntAnimals}")
    for (i in 1..N){
        for (j in NR.birds.indices){
            when (Random.nextInt(1..4)){
                1 -> NR.birds[j].sleep()
                2 -> NR.birds[j].eat()
                3 -> NR.birds[j].move()
                4 -> NR.birds[j].giveBirth()
            }
        }
        for (j in NR.dogs.indices){
            when (Random.nextInt(1..4)){
                1 -> NR.dogs[j].sleep()
                2 -> NR.dogs[j].eat()
                3 -> NR.dogs[j].move()
                4 -> NR.dogs[j].giveBirth()
            }
        }
        for (j in NR.fishes.indices){
            when (Random.nextInt(1..4)){
                1 -> NR.fishes[j].sleep()
                2 -> NR.fishes[j].eat()
                3 -> NR.fishes[j].move()
                4 -> NR.fishes[j].giveBirth()
            }
        }
        for (j in NR.otherAnimals.indices){
            when (Random.nextInt(1..4)){
                1 -> NR.otherAnimals[j].sleep()
                2 -> NR.otherAnimals[j].eat()
                3 -> NR.otherAnimals[j].move()
                4 -> NR.otherAnimals[j].giveBirth()
            }
        }
        if (Animal.cntAnimals <0){
            println("All animals is dead")
            break
        }
    }
    //deleting from NR animal which isToOld=true
    for (bird in NR.birds) {
        if (bird.isTooOld) {
            NR.removeFromNV("bird",bird)
        }
    }
    for (fish in NR.fishes) {
        if (fish.isTooOld) {
            NR.removeFromNV("fish",fish)
        }
    }
    for (dog in NR.dogs) {
        if (dog.isTooOld) {
            NR.removeFromNV("dog",dog)
        }
    }
    for (otherAnimal in NR.otherAnimals) {
        if (otherAnimal.isTooOld) {
            NR.removeFromNV("otherAnimal",otherAnimal)
        }
    }

    println("After iterations in the natural reserve is " +
            "${Animal.cntBirds} birds, " +
            "${Animal.cntFishes} fishes, " +
            "${Animal.cntDogs} dogs, " +
            "and ${Animal.cntOtherAnimals} over animals. " +
            "Total:${Animal.cntAnimals}")

}

