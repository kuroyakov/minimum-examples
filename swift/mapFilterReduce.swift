// Map, Filter, Reduce
import Foundation       // NSDate

let start = Date()

let result = 
    // 1. Generating sequence
    (0..<10000000)
    // 2. Mapping the sequence into another
    .map {$0*2}
    // 3. Filtering the sequence
    .filter {$0 % 3 == 0}
    // 4. Reducing the sequence
    .reduce(0, +)

let end = Date().timeIntervalSince(start)
// As a result
print("\(result)")
print("\(end*1000) [msec]")
