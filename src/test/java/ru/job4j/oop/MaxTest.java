package ru.job4j.oop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {

    @Test
    public void whenMaxFrom3Numbers() {
        Max maximum = new Max();
        int result = maximum.max(10, 30, 40);
        assertThat(result).isEqualTo(40);
    }

    @Test
    public void whenMaxFrom2Numbers() {
        Max maximum = new Max();
        int result = maximum.max(10, -30);
        assertThat(result).isEqualTo(10);
    }

    @Test
    public void whenMaxFrom4Numbers() {
        Max maximum = new Max();
        int result = maximum.max(10, 30, 40, 154);
        assertThat(result).isEqualTo(154);
    }


}