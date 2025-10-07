// Task 5.2.2: conversion of marks into grades, using a function
fun main(args: Array<String>) {
    for (arg in args) {
        println(arg + " is a " + grade(arg.toInt()))
    }
}
fun grade(mark: Int) = when (mark) {
    in 0..39   -> "Fail"
    in 40..69  -> "Pass"
    in 70..100 -> "Distinction"
    else       -> "?"
}
