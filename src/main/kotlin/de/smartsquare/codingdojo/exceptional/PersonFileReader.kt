package de.smartsquare.codingdojo.exceptional

import java.io.File
import java.io.FileNotFoundException

class PersonFileReader {

    /**
     * This can be done better, right? Please refactor!
     */
    fun readFile(filename: String): List<Person> {
        val content = try {
            File(filename).readText()
        } catch (ex: FileNotFoundException) {
            throw IllegalArgumentException(ex.message)
        }

        return try {
            content.lines()
                .map {
                    val columns = it.split(";")
                    Person(columns[0], columns[1], columns[2])
                }
        } catch (ex: IndexOutOfBoundsException) {
            throw IllegalArgumentException(ex.message)
        }
    }

    data class Person(
        val firstName: String,
        val lastName: String,
        val role: String
    )
}