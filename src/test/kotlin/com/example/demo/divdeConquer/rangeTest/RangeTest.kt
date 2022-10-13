package com.example.demo.divdeConquer.rangeTest

import org.junit.jupiter.api.Test

class RangeTest {

    @Test
    fun `rangeTest`() {
        // given

        // when
        for (i in 0..3) {
            println(i)
        }
        // then
    }

    @Test
    fun `downTo_Test`() {
        // given

        // when
        for (i in 5 downTo 0) {
            println(i)
        }
        // then
    }
}
