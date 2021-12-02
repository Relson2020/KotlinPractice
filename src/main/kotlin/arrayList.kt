fun main() {

    // creating empty ArrayList<String> of String type
    val arrayList = ArrayList<String>()

    // adding elements in ArrayList
    arrayList.add("hello")
    arrayList.add("there")
    arrayList.add("welcome")
    arrayList.add("in")
    arrayList.add("world")
    arrayList.add(4, "kotlin")

    // traversing ArrayList using for loop
    for (word in arrayList) {
        print("$word ")
    }

    // removing the element from ArrayList
    arrayList.remove("in")
    arrayList.removeAt(2)

    println("")
    // traversing ArrayList using for loop
    for (word in arrayList) {
        print("$word ")
    }

    // indexOf in ArrayList
    println("\nindexOf \"world\" in ArrayList : ${arrayList.indexOf("world")}")

    // set() in ArrayList
    arrayList.set(2, "welcome back in kotlin")

    // ge() in ArrayList
    for (i in 0 until arrayList.count()) {
        print("${arrayList.get(i)} ")
    }

    // adding the ArrayList to another ArrayList
    val arrayList2 = ArrayList<String>()

    arrayList2.addAll(arrayList)
    val arrayList3 = ArrayList<String>()

    arrayList.forEachIndexed { index, item ->
        if (index < 3)
            arrayList3.add(item)
    }

    // clearing the arrayList
    arrayList.clear()

    println("\nthe size of the arrayList is : ${arrayList.size}")

    // traversing ArrayList2 using for loop
    for (word in arrayList2) {
        print("$word ")
    }

    println("")
    // mutableArray list
    val mutableList1 : MutableList<String> = ArrayList()
    mutableList1.add("hey")
    mutableList1.add("there")

    mutableList1.forEach{
        print("$it ")
    }
}