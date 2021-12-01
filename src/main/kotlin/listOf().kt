fun main(){

    // immutable list
    val immutableList = listOf(1,2,3,4,6,5,7)

    // traversing through list
    for (i in 0 until immutableList.count()){
        print("${immutableList.indexOf(i)} ")
    }

    // last() function to see the last element of the list
    println("\nlast element in the list is : ${immutableList.last()}")

    // first() function to see the first element of the list
    println("first element in the list is : ${immutableList.first()}")

    // list sort()
    println("list after sort : ${immutableList.sorted()}")
    println("list after sort in descending order : ${immutableList.sortedDescending()}")

    // contains()
    println("list contains \"3\" : ${immutableList.contains(3)}")

    // containsAll()
    println("list contains \"3,7,1\" : ${immutableList.containsAll(immutableList)}")




    // mutable list
    val mutableList = mutableListOf("a","b","c")

    println("mutable list")
    // traversing through list
    for (i in mutableList){
        print(i)
    }

    // add in mutable list
    mutableList.add("d")
    mutableList.add(4,"e")

    println("\nmutable list after add ")
    // traversing through list
    for (i in mutableList){
        print(i)
    }

    // remove in mutable list
    mutableList.removeAt(4)

    println("\nmutable list after remove")
    // traversing through list
    for (i in mutableList){
        print(i)
    }

    // set in mutable list
    mutableList.set(3,"e")

    println("")
    // get in mutable list
    for (i in 0 until mutableList.count()){
        print(mutableList.get(i))
    }
    var mutableList1 : MutableList<String> = ArrayList()

}