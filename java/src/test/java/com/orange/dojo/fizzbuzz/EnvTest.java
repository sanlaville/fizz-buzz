package com.orange.dojo.fizzbuzz;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

@DisplayName("Check my environment")
public class EnvTest {

  @Test
  @DisplayName("My environment is ready to fail and pass...")
  public void check_environment() {
    Assertions.assertThat(false).isTrue();
  }

  @ParameterizedTest
  @CsvSource({
    "false, true",
    "true, false"
  })
  @DisplayName("My environment is ready to fail and pass with a parameterized test")
  public void check_environment(boolean actuel, boolean expected) {
    Assertions.assertThat(actuel).isEqualTo(expected);
  }
}
