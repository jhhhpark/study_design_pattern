package starbuz.category

import starbuz.Beverage

class Decaf: Beverage() {
    override val description: String = "๋์นดํ์ธ"
    override fun cost() : Double = 1.05
}