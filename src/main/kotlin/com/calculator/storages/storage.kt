package com.calculator.storages

import com.calculator.commands.Command

object Storage {
    fun addCommand(firstNumber: Double, secondNumber: Double): Double {
        return firstNumber+secondNumber
    }
    fun subtractCommand(firstNumber: Double, secondNumber: Double): Double {
        return firstNumber-secondNumber
    }
    fun multiplyCommand(firstNumber: Double, secondNumber: Double): Double {
        return firstNumber*secondNumber
    }
    fun divideCommand(firstNumber: Double, secondNumber: Double): Double {
        if (secondNumber == 0.0) {
            throw IllegalArgumentException("Cannot divide by zero")
        }
        return firstNumber/secondNumber
    }
}

