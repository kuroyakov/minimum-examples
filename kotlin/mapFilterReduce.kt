// Map, Filter, Reduce
// To increse VM heap size, set environment variable JAVA_OPTS 
// (For example: 'export JAVA_OPTS="$JAVA_OPTS -Xmx1024M"')
fun main(args:Array<String>){
    var a = 
        // 1. Generating sequence
        IntArray(10000000) { it }

    // Stopwatch start after generating sequence
    var start = System.currentTimeMillis()
    var result = 
        // 2. Mapping the sequence into another
        a.map { n -> n * 2}

        // 3. Filtering the sequence
        .filter { n -> n%3 == 0}

        // 4. Reducing the sequence
        .fold(0L) { x, y -> x.toLong() + y.toLong()}

    var end = System.currentTimeMillis()
    // As a result
    println(result.toString())
    println((end-start).toString() + " [msec]")
}
