package com.ernando

fun main() {
    val x = 10
    val y = 9
    val z = 8

    println(x > y && x < z) // true lessThen greaterThen
    println(x < y || y == z) // true lessThen or equal
    println(!(x == y)) // false Not equal
    println(x == y && (x == z || y == z)) // true EQUAL ==, OR ||, AND &&

    // is operator
    val numberOne = 1
    val numberTwo = "2"
    println(numberOne is Int) // true
    println(numberTwo is Int) // false
    println(numberTwo !is Int) // true

    // in operator
    val numberThree = 3
    val numberEleven = 11
    val range = 1..10
    if (numberThree in range) {
        println("Number $numberThree  is between 1 and 10")
    } else {
        println("Number $numberThree  is not between 1 and 10")
    }
    if (numberEleven !in range) {
        println("Number $numberEleven  is not between 1 and 10")
    } else {
        println("Number $numberEleven  is between 1 and 10")
    }

    // as operator
    val numberFourteen: Any = 14
    println(numberFourteen as Int) // 14
    println(numberFourteen as? Int)




}