// Map, Filter, Reduce
fun main(args:Array<String>){
    var result = 
        // 1. Generating sequence
        Array(1000000, {i->i})

        // 2. Mapping the sequence into another
        .map { n -> n * 2}

        // 3. Filtering the sequence
        .filter { n -> n%3 == 0}

        // 4. Reducing the sequence
        .fold(0L) { x, y -> x.toLong() + y.toLong()}

    // As a result
    println(result.toString())
}
