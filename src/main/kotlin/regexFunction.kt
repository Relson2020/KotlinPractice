fun main(){

    val match = Regex("^a")
    println(" ---- containsMatchIn()")

    // containsMatchIn("string / character sequence")

    println("${match.containsMatchIn("abc")}")
    println("${match.containsMatchIn("bas")}")

    println(" ----matches()")

    // matches(character sequence )

    val matches = Regex("hello")
    val ans3: Boolean = matches.matches("hello")
    println(ans3)

    println(" ---- matchEntire()")

    // matchEntire( character sequence)

    val matchEntireRegex = Regex("hello world hello")
    val ans4 : MatchResult? = matchEntireRegex.matchEntire("hello world hello")
    println("${ans4?.value}")

    println(" ----find()")

    // find(character sequence , starting index)

    val find = Regex("Hel")
    val ans : MatchResult? = find.find("hello world hello",9)
    println("${ans?.value}")

    println(" ----findAll()")

    // findAll(character sequence , starting index)

    val findAll = Regex("hel..")
    val ans2 : Sequence<MatchResult?> = findAll.findAll("hello world hello", 0)
    ans2.forEach {
        println(it?.value)
    }

    println("\n ---- replace() ")

    // replace( character sequence , replace with String )

    val replaceString = Regex("hell")
    val replace : String = replaceString.replace("hell world hell","hello")
    println(replace)

    println("\n ---- replaceFirst()")

    // replaceFirst( character sequence , replace with String )

    val replaceFirst : String = replaceString.replaceFirst("hell world hell","hello")
    println(replaceFirst)
}