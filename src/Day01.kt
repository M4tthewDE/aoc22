
fun main() {
    val input = readInput("day1")
    println(calculateFattestReindeer(input))
}

fun calculateFattestReindeer(input: List<String>) : Int {
    // ugly partitioning
    val partitions = mutableListOf<List<Int>>()
    var tmpList = mutableListOf<Int>()
    for (s in input) {
        if (s.isEmpty()) {
            partitions.add(tmpList)
            tmpList = mutableListOf();
        } else {
            tmpList.add(s.toInt())
        }
    }

    return partitions.maxOfOrNull(List<Int>::sum)!!
}
