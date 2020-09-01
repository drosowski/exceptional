package de.smartsquare.codingdojo.exceptional

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import java.lang.IllegalArgumentException

internal class PersonFileReaderTest {

    @Test
    fun missing_file() {
        assertThrows<IllegalArgumentException> {
            PersonFileReader().readFile(javaClass.classLoader.getResource("corrupt_data.csv").path)
        }
    }

    @Test
    fun corrupt_file() {
        assertThrows<IllegalArgumentException> {
            PersonFileReader().readFile(javaClass.classLoader.getResource("corrupt_data.csv").path)
        }
    }

    @Test
    fun happy_ever_after() {
        val persons = PersonFileReader().readFile(javaClass.classLoader.getResource("valid_data.csv").path)
        assertEquals(2, persons.size)
    }
}