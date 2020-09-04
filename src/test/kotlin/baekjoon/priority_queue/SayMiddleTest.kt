package baekjoon.priority_queue

import org.junit.Test
import util.SystemIOTest

class SayMiddleTest : SystemIOTest() {
    val action: () -> Unit = {
        sayMiddle(arrayOf())
    }

    @Test
    fun `Test example input 1`() {
        val input = """
            7
            1
            5
            2
            10
            -99
            7
            5
        """.trimIndent()

        val expected = """
            1
            1
            2
            2
            2
            2
            5
        """.trimIndent()

        action at input be expected
    }
}