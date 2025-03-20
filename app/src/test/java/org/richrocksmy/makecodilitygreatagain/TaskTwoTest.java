package org.richrocksmy.makecodilitygreatagain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class TaskTwoTest {

    @Test
    public void shouldBeTrue() {
        assertThat(new TaskTwo().shouldBeTrue()).isTrue();
    }


}