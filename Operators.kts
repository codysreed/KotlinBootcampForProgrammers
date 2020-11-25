/*
 * Lesson 2-3: Operators
 */

print(1 + 1)
print(53 - 3)
print(50 / 10)
print(1 / 2) // Dividing integers always returns integers
print(1.0 / 2.0) // Dividing floats always returns floats
print(6 * 50)

print(fish * 2) // Kotlin lets you overwrite the default operators

val fish = 2 // Kotlin keeps number types as primitives
fish.times(6) // but will let you call methods on them like they're objects
fish.div(10)
fish.plus(3)
fish.minus(3)

/*
 * Typing and Mutability
 */

// use primitive 'int' as an object
1.toLong() // supports object wrappers

// pr. put int in a box
val boxed: Number = 1 // all numerical types have a super-type 'Number'
boxed.toLong() // must be wrapped or "boxed" (implicitly done when needed)

val aquarium = 1
// aquarium = 2 - can't do, immutable
print(aquarium)

var fish = 2
fish = 50
print (fish)
// fish = "Bubbles" - can't change type

val plants = 5
val fish = 2
plants + fish

val b: Byte = 1 // OK, literals are statically checked
// val i: Int = b - can't do, numerical types don't implicitly convert to other types
val i: Int = b.toInt() // but can cast

// supports underscores in numbers for readability
// type is infered
val oneMillion = 1_000_000
val socialSecurityNumber = 999_99_9999L
val hexBytes = 0xFF_EC_DE_5E
val bytes = 0b11010010_01101001_10010100_10010010

/*
 * Nullability
 */

// var rocks: Int = null - can't be done because variable is not nullable
var marbles: Int? = null // use '?' operator to indicate nullable field
var lotsOfFish: List<String?> = listOf(null, null) // nullable elements, non-nullable list
var everMoreFish List<String>? = null // nullable list
var definitelyFish: List<String?>? = null // nullable both
definitelyFish = listOf(null, null)

// !! is the not null assertion operator
goldfish = null
// goldfish!!.eat() - bad idea

var fishFoodTreats = 5
fishFoodTreats?.dec() ?: 0 // elvis operator (null check), return 0 if null
