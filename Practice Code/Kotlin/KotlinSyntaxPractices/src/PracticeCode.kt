import com.sun.xml.internal.fastinfoset.util.StringArray

fun main() {
    //practicingForLoops()
    //practicingArrays()
    print(practicingWhenExpressions(101))
}

fun practicingWhenExpressions(obj: Any): String {
    var answer = String()
    answer = when (obj) {
        1, 100 -> 0.toString()
        else -> false.toString()
    }
    return answer
}
fun practicingArrays() {
    var x: IntArray = intArrayOf(1, 2, 3)
    var y = IntArray(5) //has a size of 5, but all elements are 0
    //[42, 42, 42, 42, 42]
    val arr = IntArray(5) { 42 } // has a size of 5 with all elements of value 42

    // e.g. initialise the values in the array using a lambda
    // Array of int of size 5 with values [0, 1, 2, 3, 4] (values initialised to their index value)
    var arr2 = IntArray(5) { it * 2 }

    for ((index, value) in arr2.withIndex()) {
        println("the element at $index is $value")
    }
}

fun practicingForLoops() {
    for (i in 1..9) {
        println(i)
    }
    print("BREAK")
    println()

    for (i in 5 downTo 0) {
        println(i)
    }
    print("BREAK")
    println()

    for (i in 5 downTo 0 step 2) {
        println(i)
    }
    print("BREAK")
    println()

    for (i in 0..6 step 2) {
        println(i)
    }

    /*
output:
1
2
3
4
5
6
7
8
9
BREAK
5
4
3
2
1
0
BREAK
0
2
4
6
     */
}