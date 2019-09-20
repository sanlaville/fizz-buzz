package com.orange.dojo.fizzbuzz

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource


class EnvTest {

    @Test
    fun `test environment is working`() {
        // Given

        // When

        // Then
        assertThat(0).isEqualTo(1)
    }

    @ParameterizedTest
    @CsvSource("1, a1", "2, a2")
    fun `parameterized test is working`(numberInput: Int, expected: String) {
        val actual = "a$numberInput"
        assertThat(actual).isEqualTo(expected)
    }
}
