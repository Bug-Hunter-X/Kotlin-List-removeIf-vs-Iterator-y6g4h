fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    list.removeIf { it > 2 }
    println(list) // Output: [1, 2]

    val list2 = mutableListOf(1, 2, 3, 4, 5)
    val iterator = list2.iterator()
    while (iterator.hasNext()) {
        val item = iterator.next()
        if (item > 2) {
            iterator.remove()
        }
    }
    println(list2) // Output: [1, 2]

    //Demonstrating the bug:
    val buggyList = mutableListOf(1, 2, 3, 4, 5)
    for (i in buggyList.indices) {
        if (buggyList[i] > 2) {
            buggyList.removeAt(i)
        }
    }
    println(buggyList) //Output will be unexpected depending on list size
} 