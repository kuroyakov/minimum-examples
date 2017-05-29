#!/bin/bash
export JAVA_OPTS="$JAVA_OPTS -Xmx1024M"

echo "C++:"
clang++  -std=c++11 -O3 Cpp/mapFilterReduce.cpp
./a.out

echo "F#:"
fsharpi fsharp/mapFilterReduce.fsx

echo "Javascript:"
node javascript/mapFilterReduce.js 

echo "Python:"
python python/mapFilterReduce.py

echo "Swift:"
swiftc -Ounchecked swift/mapFilterReduce.swift
./mapFilterReduce

echo "Kotlin:"
kotlinc kotlin/mapFilterReduce.kt
kotlin MapFilterReduceKt

echo "Scala:"
scalac Scala/mapFilterReduce.scala
scala MapFilterReduce