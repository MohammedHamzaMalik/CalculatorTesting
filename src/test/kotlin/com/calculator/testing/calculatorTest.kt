package com.calculator.testing

import com.calculator.Calculator
import com.calculator.commands.AddCommand
import com.calculator.commands.DivideCommand
import com.calculator.commands.MultiplyCommand
import com.calculator.commands.SubtractCommand
import org.junit.jupiter.api.*
import kotlin.test.assertEquals

class CalculatorTest {
    private val calculator = Calculator()
    companion object {
        @BeforeAll
        @JvmStatic
        fun beforeAll() {
            println("This function is executed BEFORE ALL test functions.")
        }

        @AfterAll
        @JvmStatic
        fun afterAll() {
            println("This function is executed AFTER ALL test functions.")
        }
    }

    @BeforeEach
    fun beforeEach() {
        println("This function is executed BEFORE EACH test function.")
    }

    @AfterEach
    fun afterEach() {
        println("This function is executed AFTER EACH test function.")
    }
    @Test
    fun `test for addition`() {
        calculator.execute(AddCommand(1.0,2.0))
        assertEquals(3.0,calculator.getCurrentValue())
    }

    @Test
    fun `test for subtraction`() {
        calculator.execute(SubtractCommand(4.0,3.0))
        assertEquals(1.0,calculator.getCurrentValue())
    }

    @Test
    fun `test for multiplication`() {
        calculator.execute(MultiplyCommand(3.0,5.0))
        assertEquals(15.0,calculator.getCurrentValue())
    }

    @Test
    fun `test for division`() {
        calculator.execute(DivideCommand(20.0,4.0))
        assertEquals(5.0,calculator.getCurrentValue())
    }

    @Test
    fun `division by zero`() {
        assertThrows<IllegalArgumentException> {
            calculator.execute(DivideCommand(20.0,0.0))
        }
    }
}