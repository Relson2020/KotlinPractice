
// A simple class to represent a name
class Name(val firstName: String,val lastName: String){
    override fun toString(): String {
        return """$firstName $lastName"""
    }
}

// A comparator to compare first names of Name
class ComparatorOne: Comparator<Name>{
    override fun compare(o1: Name?, o2: Name?): Int {
        println("$o1  $o2")
        if(o1 == null || o2 == null){
            return 0;
        }
        println("${o1.firstName.compareTo(o2.firstName)}")

        return o1.firstName.compareTo(o2.firstName)
    }
}

// A comparator to compare last names of Name
class AnotherComparator: Comparator<Name>{
    override fun compare(o1: Name?, o2: Name?): Int {
        if(o1 == null || o2 == null)
            return 0
        return o1.lastName.compareTo(o2.lastName)
    }
}

fun main(){
    val list = ArrayList<Name>()
    list.add(Name("Steve","Waugh"))
    list.add(Name("Steve","Smith"))
    list.add(Name("Virat","Kohli"))
    list.add(Name("Kane","Williamson"))
    list.add(Name("Joe","Root"))

    println("The list is:")
    println(list)

    val comparatorOne = ComparatorOne()
    // Sorting list according to first names
    list.sortWith(comparatorOne)
    println("List sorted according to first name")
    println(list)

    val anotherComparator = AnotherComparator()
    val finalComparator = comparatorOne.then(anotherComparator)
    // Sorting list according to first name then by last name
    list.sortWith(finalComparator)
    println("List sorted according to first name and last name")
    println(list)

    val reverseComparator = finalComparator.reversed()
    // Reverse sorting the list
    list.sortWith(reverseComparator)
    println("List reverse sorted")
    println(list)
}