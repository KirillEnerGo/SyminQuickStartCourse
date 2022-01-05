package com.example.syminaquickstartcourse.start

fun main() {
	val array:Array<Int?> = arrayOf(1, 2, 5, 10, 50, null)
	val arrayNulls: Array<Int?> = arrayOfNulls(10)
	array[4] = null
	println(array[4])
	println(array)

	val listOfNumbers = ArrayList<Int>()
	listOfNumbers.add(5)
	println(listOfNumbers[0])

}