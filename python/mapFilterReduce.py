# Map, Filter, Reduce
import functools            # for reduce function
import time                 # for evaluation performance

# 1. Generating sequence (Defered execution)
a = list(range(10000000))

# Stopwatch start after generating sequence
ts = time.time()

# 2. Mapping the sequence into another (Defered execution)
mapped = map(lambda n:n*2, a)

# 3. Filtering the sequence (Defered execution)
filtered = filter(lambda n:n%3==0, mapped)

# 4. Reducing the sequence
result = functools.reduce(lambda a,b:a+b, filtered)
# As a result
te = time.time()

print (result)
print (str((te-ts)*1000) + " [msec]")
