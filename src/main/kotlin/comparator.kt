class ComparatorClass( val name : String ){
    override fun toString(): String {
        return name
    }
}
class CompareClass : Comparator<ComparatorClass>{
    override fun compare(o1: ComparatorClass?, o2: ComparatorClass?): Int {
        println("$o1 $o2")
        if (o1 == null || o2 == null){
            return 0
        }
        else{
            println("${o1.name.compareTo(o2.name)}")

            return o1.name.compareTo(o2.name)
        }
    }
}


fun main(){
  val nameList = ArrayList<ComparatorClass>()
    nameList.add(ComparatorClass("da"))
    nameList.add(ComparatorClass("ad"))
    nameList.add(ComparatorClass("ad"))
    nameList.add(ComparatorClass("ka"))
    println(nameList)
    val obj = CompareClass()
    nameList.sortedWith(obj)
    println(nameList)
}