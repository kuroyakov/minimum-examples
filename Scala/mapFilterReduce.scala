// Map, Filter, Reduce
object MapFilterReduce extends App{
    // 1. Generating sequence (Defered execution)
    val a = (0L to 9999999L).toArray
    // Stopwatch start after generating sequence
    var start = System.currentTimeMillis
    var result = 
        // 2. Mapping the sequence into another (Defered execution)
        a.map(_*2)
        // 3. Filtering the sequence (Defered execution)
        .filter(_%3==0)
        // 4. Reducing the sequence
        .fold(0L)(_+_)

    var end = System.currentTimeMillis
    // As a result
    println(result)
    println((end-start).toString() + " [msec]")
}