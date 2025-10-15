// Task 8.3: weather station temperature analysis program

fun main() {
    // Add code here to:
    //   - Fetch data
    val dataset = fetchData()
    //   - Find records with lowest and and highest temperatures
    val lowest = dataset.minBy { it.second }
    val highest = dataset.maxBy { it.second }
    //   - Compute average temperature
    //val avg = averageTemp(dataset)
    val avg = dataset.map { it.second } .average()  //why doesn't dataset.average { it.second } work? is this possible without a map?
    //   - Display all of these statistics
    println("""
    dataset: $dataset
    lowest: $lowest
    highest: $highest
    average: $avg
    """)
}
