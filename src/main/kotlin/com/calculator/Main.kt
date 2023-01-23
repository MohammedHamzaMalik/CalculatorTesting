package com.calculator

import com.calculator.commands.*

class Calculator {
    private var current = 0.0
    fun execute(command: Command) {
        current = command.execute()
    }

    fun getCurrentValue() = current
}

fun main(args: Array<String>) {
    val calculator = Calculator()
    val requests = listOf(
        Request(AddCommand(1.0, 2.0)),
        Request(SubtractCommand(3.0, 4.0)),
        Request(MultiplyCommand(5.0, 6.0)),
        Request(DivideCommand(7.0, 8.0))
    )
    requests.forEach {
        calculator.execute(it.command)
        println(calculator.getCurrentValue())
    }
}