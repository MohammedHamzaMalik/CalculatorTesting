package com.calculator.commands

import com.calculator.storages.Storage

interface Command {
    fun execute(): Double
}

class AddCommand(
    private val firstNumber: Double,
    private val secondNumber: Double
) : Command {
    override fun execute(): Double {
        return Storage.addCommand(firstNumber,secondNumber)
    }
}

class SubtractCommand(
    private val firstNumber: Double,
    private val secondNumber: Double
) : Command {
    override fun execute(): Double {
        return Storage.subtractCommand(firstNumber,secondNumber)
    }
}

class MultiplyCommand(
    private val firstNumber: Double,
    private val secondNumber: Double
) : Command {
    override fun execute(): Double {
        return Storage.multiplyCommand(firstNumber,secondNumber)
    }
}

class DivideCommand(
    private val firstNumber: Double,
    private val secondNumber: Double
) : Command {
    override fun execute(): Double {
        return Storage.divideCommand(firstNumber,secondNumber)
    }
}