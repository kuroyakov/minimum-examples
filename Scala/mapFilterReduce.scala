// Map, Filter, Reduce
object MapFilterReduce extends App{
    // 1. Generating sequence (Defered execution)
    val a = (0L to 9999999L).toArray
    // Stopwatch start after generating sequence
    var start = System.currentTimeMillis
    // 2. Mapping the sequence into another (Defered execution)
    var result = a.map(_*2)
    // 3. Filtering the sequence (Defered execution)
                  .filter(_%3==0)
    // 4. Reducing the sequence
                  .fold(0L)((z, x) => z + x)

                  
    var end = System.currentTimeMillis
    // As a result
    println(result)
    println((end-start).toString() + " [msec]")
}