// Map, Filter, Reduce

open System
open System.Diagnostics

let sw = Stopwatch()
let a = 
    // 1. Generating sequence
    [|0L..10000000L|]

 // Stopwatch start after generating sequence
sw.Start()
let result = 
    a
    // 2. Mapping the sequence into another (Defered execution)
    |> Seq.map ((*) 2L)
    // 3. Filtering the sequence (Defered execution)
    |> Seq.filter (fun n->n%3L=0L)
    // 4. Reducing the sequence
    |> Seq.fold (+) 0L
sw.Stop()

// As a result
printfn "%A" result
printfn "%A [msec]" sw.Elapsed.TotalMilliseconds