package pizza.chicagopizza.ingredient

import pizza.ingredient.clam.Clams

class FrozenClams: Clams() {
    override fun createClam() {
        println("๋๋ ์กฐ๊ฐ!")
    }
}