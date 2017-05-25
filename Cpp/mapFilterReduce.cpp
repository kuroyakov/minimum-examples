// Caution!!!!!!
// If you use clang++, please add option "-std=c++11"
// Map, Filter, Reduce
#include <vector>
#include <algorithm> // transform, copy_if
#include <iterator>  // back_inserter
#include <iostream>  // cout
#include <numeric>   // accumulate
#include <chrono>    // timer
using namespace std;

int main(){
    // 1. Generating sequence
    auto a = vector<long long>(10000000);
    for (long long i=0; i < a.size(); ++i) a[i] = i;

    // Stopwatch start after generating sequence
    auto start = chrono::system_clock::now();
    // 2. Mapping the sequence into another
    auto mapped = vector<long long>(10000000);
    transform(a.begin(), a.end(), mapped.begin(), [](long long x){return x * 2;});

    // 3. Filtering the sequence
    vector<long long> filtered;
    copy_if(mapped.begin(), mapped.end(), back_inserter(filtered), [](long long x){return x%3==0;});

    // 4. Reducing the sequence
    long long result = accumulate(filtered.begin(), filtered.end(), (long long)0, [](long long a, long long b){return a+b;});

    auto end = chrono::system_clock::now();
    // As a result
    cout << result << endl;
    cout << chrono::duration_cast<chrono::milliseconds>(end - start).count() << " [msec]" << endl;
    return 0;
}

