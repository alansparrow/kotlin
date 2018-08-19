package EnumLesson;

/**
 * Create an enum called Animals and add the following types:
 * CAT, DOG, RAT, BIRD, HAMSTER
 */

// Your Solution Here
enum class Animal {
    CAT,
    DOG,
    RAT,
    BIRD,
    HAMSTER;
}

/**
 * Create another enum called Cage and add the following:
 * SMALL, MEDIUM, LARGE
 */
// Your Solution Here
enum class Cage {
    SMALL,
    MEDIUM,
    LARGE;
}

/**
 * Write a function named addAnimalToCage that takes a animal and Cage and print
 * out the animal and the cage that it will be in
 */
// Your Solution Here
fun addAnimalToCage(animal: Animal, cage: Cage) {
    println("The $animal is in $cage cage")
}



/**
 * Call addAnimalToCage multiple times with different animals and cages
 * Try to use the appropriate cage size for the animal
 */
fun main(args: Array<String>) {
    // Your Solution Here
    addAnimalToCage(Animal.BIRD, Cage.MEDIUM)
    addAnimalToCage(Animal.DOG, Cage.LARGE)
    addAnimalToCage(Animal.HAMSTER, Cage.SMALL)
}
