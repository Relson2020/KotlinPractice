enum class Days (val days : Int){
    MONDAY(1){
        override fun display() {
            println("$this")
        }
             },
    TUESDAY(2){
        override fun display() {
            println("$this")
        }
              },
    WEDNESDAY(3){
        override fun display() {
            println("$this")
        }
                },
    THURSDAY(4){
        override fun display() {
            println("$this")
        }  },
    FRIDAY(5){
        override fun display() {
            println("$this")
        }
             },
    SATURDAY(6){
        override fun display() {
            println("$this")
        }
               },
    SUNDAY(7){
        override fun display() {
            println("$this")
        }
    };
    abstract fun display()

}
fun main(){

    val days = Days.THURSDAY
    println(days.name)
    println(days.days)
    println(days.ordinal)
    println(days.display())
    println(Days.valueOf("SUNDAY"))

    for (day in Days.values()){
        print("$day ")
    }


}