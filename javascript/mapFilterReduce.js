// Map, Filter, Reduce
console.time("All");

// 1. Generating sequence
var a = new Array(10000000);
for (var index = 0; index < a.length; index++) {
    a[index] = index;
}
// 2. Mapping the sequence into another
var mapped = a.map(n=>n*2);

// 3. Filtering the sequence
var filtered = mapped.filter(n=>n%3==0);

// 4. Reducing the sequence
var result = filtered.reduce((a,b)=>a+b);

// As a result
console.log(result);
console.timeEnd("All");
