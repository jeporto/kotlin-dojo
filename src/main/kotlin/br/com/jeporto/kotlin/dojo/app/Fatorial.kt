package  br.com.jeporto.kotlin.dojo.app

class Fatorial() {

    fun fatorial (x: Int) :Int =
        if (x == 0)  1 else x * fatorial(x-1)
}