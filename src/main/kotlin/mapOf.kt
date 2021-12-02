fun main(){

    //immutable map
    val immutableMap = mapOf(1 to "thing1 ", 2 to "thing2" , 3 to "thing3")

    // print map key
    println("printing map keys : ${immutableMap.keys}")

    // print map values
    println("printing map values : ${immutableMap.values}")

    // map size
    println("map size : ${immutableMap.size}")

    // map count
    println("map count : ${immutableMap.count()}")

    // getting map values
    println("map value 1 : ${immutableMap[1]}")
    println("map value 2 : ${immutableMap.get(2)}")
    println("map value 3 : ${immutableMap.getOrDefault(4,"hey")}")
    println("map value 3 : ${immutableMap.getOrElse(4) { 0 }}")

    // map containsKey
    println("map contain the key \"2\" : ${immutableMap.containsKey(2)}")

    // map containsValue
    println("map contain the value \"thing2\" : ${immutableMap.containsValue("thing")}")


    println("----------mutableMapOf--------------")
    val mutableMap = mutableMapOf(1 to "here", 2 to "there", 3 to "near" , 4 to "where")

    mutableMap.put(5 , "here")
    mutableMap.put(6  ,"were")
    mutableMap.remove(5, "here")

    for (i in mutableMap){
        print("${mutableMap[i.key]} ")
    }

    val hashMap = hashMapOf<Int,String>()
    mutableMap.forEach{
        hashMap.put(it.key,it.value)
    }
    println("-------------------------------------------")
    for (i in mutableMap){
        print("${mutableMap[i.key]} ")
    }

}