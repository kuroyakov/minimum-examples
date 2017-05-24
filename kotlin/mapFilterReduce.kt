// Map, Filter, Reduce
// To increse VM heap size, set environment variable JAVA_OPTS 
// (For example: 'export JAVA_OPTS="$JAVA_OPTS -Xmx1024M"')
fun main(args:Array<String>){
    var start = System.currentTimeMillis()
    var result = 
        // 1. Generating sequence
        Array(10000000, {i->i})

        // 2. Mapping the sequence into another
        .map { n -> n * 2}

        // 3. Filtering the sequence
        .filter { n -> n%3 == 0}

        // 4. Reducing the sequence
        .fold(0L) { x, y -> x.toLong() + y.toLong()}

    var end = System.currentTimeMillis()
    // As a result
    println(result.toString())
    println((end-start).toString() + " [msec]")
}
