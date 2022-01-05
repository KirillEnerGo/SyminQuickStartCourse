package com.example.syminaquickstartcourse.start

fun main() {
//	val array = arrayOf(1, 3, 5, 6)
//	for (i in array)
//		println(i)
//
//	val arrayNull = arrayOfNulls<Int?>(101)
//	for(i in arrayNull.size-1 downTo 0 step 2)
//	{
//		arrayNull[i] = i
//		println(i)
//	}
//
////	for(i in arrayNull)
////		println(i)

	var arrayHome = arrayOfNulls<Int>(301)
	for ((index, i) in (300 .. 600).withIndex())
	{
		arrayHome[index]  = i
		println(arrayHome[index])
	}

//	for ((index, i) in arrayHome.withIndex()){
//		arrayHome[index] = i?.times(2)
//	}


//	for ((index, i) in (600..300).withIndex()){
//		println(arrayHome[index])
//	}
//	for (i in arrayHome)
//		println(i)
	for (i in arrayHome.size - 1 downTo 0 step 5)
	{
		println(arrayHome[i])

	}
}