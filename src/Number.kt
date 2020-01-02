class Number(var intArray: IntArray) {

    fun getSum(): Int = this.intArray.sum()
    fun getSum(string: String): String = string.plus(this.getSum())
    fun getSum(number: Int): Int = number + this.getSum()
}

fun main() {
    val arraySize = (0..10).random()
    val randomIntArray = IntArray(arraySize) { (0..20).random() }

    Number(randomIntArray).run {
        this.intArray.forEach { print("$it ") }
        println()
        println(this.getSum())
        println(this.getSum("Sum: "))
        print(this.getSum(10))
    }
}