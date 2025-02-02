fun main() {
    val mutableList = mutableListOf(1, 2, 3, 4, 5)
    mutableList.replaceAll { it * 2 }
    println(mutableList) // Output: [2, 4, 6, 8, 10] // Correct output

    //Alternatively, using mapIndexedTo for in-place modification:
    val mutableList2 = mutableListOf(1,2,3,4,5)
    mutableList2.mapIndexedTo(mutableList2){index, i -> i * 2}
    println(mutableList2) //Output: [2, 4, 6, 8, 10] // Correct output
} 