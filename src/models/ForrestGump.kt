package models

import generic.RandomBox

class ForrestGump<T>(val myLife:RandomBox<T>) {
    var isRunning:Boolean = false
    fun runForrest() {
        isRunning = true
    }

    fun sayTheLine():String {
        val picked = myLife.pickOne() ?: return "Life sucks"

        return "Life is like a box of chocolates: \n${picked}\n"
    }

}