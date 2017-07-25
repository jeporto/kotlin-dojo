package br.com.jeporto.kotlin.dojo.app
import org.junit.Test
import org.junit.Assert.*
import org.hamcrest.Matchers.*

class FatorialTest {

    @Test fun fat1Test() {
        var fatorial = Fatorial().fatorial(1)
        assertThat(1, equalTo(fatorial))
    }

    @Test fun fat2Test() {
        var fat = Fatorial().fatorial(2)
        assertThat(2, equalTo(fat))

    }

    @Test fun fat3Test() {
        var fat = Fatorial().fatorial(3)
        assertThat(6, equalTo(fat))
    }
}