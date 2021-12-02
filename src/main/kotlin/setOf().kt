fun main(){

    // defining the immutableSets
    val immutableSets = setOf("number2",2,4,"number4")

    // last element in the set
    println("last element in the set : ${immutableSets.last()}")

    // first element in the set
    println("first element in the set : ${immutableSets.first()}")

    //  contains() function in set
    println("set contains \"number\" : ${immutableSets.contains("number")}")

    // containsAll() function in set
    println("set contains \"number , 4 , number4\" :${immutableSets.containsAll(immutableSets)}")

    // isEmpty() function in set
    println("is set empty : ${immutableSets.isEmpty()}")

    // isNotEmpty() function in set
    println("is set not empty : ${immutableSets.isNotEmpty()}")

    // indexOf() function in set
    println("index of \"number4\" in set is : ${immutableSets.indexOf("number4")} ")

    // traversing the set
    immutableSets.forEach {
        print("$it ")
    }

    println("\n-----------mutableList------------------\n")
    // mutable list

    // defining the immutableSets
    val mutableSet = mutableSetOf<String>("there","where","where")

    // add elements in set
    mutableSet.add("their")
    mutableSet.add("were")

    // traversing the set
    mutableSet.forEach{
        print("$it ")
    }

    // remove() element from the set
    mutableSet.remove("number4")

    println("\n")
    // traversing the set
    mutableSet.forEach{
        print("$it ")
    }

    // last element in the set
    println("last element in the set : ${mutableSet.last()}")

    // first element in the set
    println("first element in the set : ${mutableSet.first()}")

    //  contains() function in set
    println("set contains \"number\" : ${mutableSet.contains("number")}")

    // containsAll() function in set
    println("set contains \"number , 4 , number4\" :${mutableSet.containsAll(mutableSet)}")

    // isEmpty() function in set
    println("is set empty : ${mutableSet.isEmpty()}")

    // isNotEmpty() function in set
    println("is set not empty : ${mutableSet.isNotEmpty()}")

    // indexOf() function in set
    println("index of \"number4\" in set is : ${mutableSet.indexOf("there")} ")

    // elementAt() function in set
    println("element at index 2 : ${mutableSet.elementAt(2)} ")

}