package org.richrocksmy.makecodilitygreatagain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class TaskOneTest {

    @Test
    public void shouldBeTrue() {
        assertThat(new TaskOne().shouldBeTrue()).isTrue();
    }

}