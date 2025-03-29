package org.example.day4

import java.io.File
import java.io.BufferedReader

fun main() {

    val bufferedReader: BufferedReader = File("C:/Users/yassi/IdeaProjects/AoC24/resources/input.txt").bufferedReader()
    val fileText = bufferedReader.use { it.readText() }

    val lines = fileText.trim().lines()

    println(lines)

    val MAS = "MAS"

    var result = 0
    for (i in lines.indices) {
        val curLine = lines[i]
        for (j in curLine.indices) {

            if (i + 3 <= lines.size && j + 3 <= curLine.length) {
                val str1 = "" + lines[i][j] + lines[i+1][j+1] + lines[i+2][j+2]
                val str2 = "" + lines[i+2][j] + lines[i+1][j+1] + lines[i][j+2]
                result += if ((str1 == MAS || str1.reversed() == MAS) && (str2 == MAS || str2.reversed() == MAS)) 1 else 0
            }
        }
    }

    println("found $result $MAS occurrences")

}