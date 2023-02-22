fun main() {
people()
    cities()
    numbers()


}
fun people(){
    var people = arrayOf("Dosantos","Joyce","Abigael","Methuselah" )
    println(people.contentToString())

}
fun cities(){
    var string = arrayOf("harare", "mumbai","dodoma","jakarta")
    for (p in string)
        println(p.capitalize())

}
fun numbers() {
    var numbers = arrayOf(32, 17, 4, 213, 78, 43, 90, 31, 3, 73, 11, 158, 62)
    println(numbers[1] + (numbers[4]))

   println(numbers.indexOf(158))

    println(numbers.sortedArray().contentToString())

}
fun names(name1: String, name2: String, name3: String): String{
    var persons = arrayOf(name1, name2, name3)
    return (persons.contentToString())

}