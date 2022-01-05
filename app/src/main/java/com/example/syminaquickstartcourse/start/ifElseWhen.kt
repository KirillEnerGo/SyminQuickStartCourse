package com.example.syminaquickstartcourse.start

fun main() {
	temp(30)
	println(weather(7, "good"))

}

fun temp(temp: Int)
{
	var consistance = if(temp < 0)
		"ice"
	else if(temp < 100)
		"liquid"
	else
		"пар"
	println(consistance)
	consistance = when(temp)
	{
		in -273..0 -> "ice"
		in 0..100 ->"liquid"
		else -> "vapor"
	}
	println(consistance)
}

fun weather(hour: Int, weather: String): String
{
	return when
	{
		hour in 7..21 && weather == "good" -> "go walk"
		hour in 7..21 && weather == "bad" -> "read the book"
		else -> "sleep"
	}
}