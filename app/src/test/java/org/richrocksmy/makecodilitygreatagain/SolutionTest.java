package org.richrocksmy.makecodilitygreatagain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @Test
    public void testCaseOne() {
        int[][] inputArray = new int[][] {
                {1, 3},
                {3, 2},
                {4, 5},
        };
        assertThat(new Solution().solution(inputArray)).isEqualTo(4);
    }

    @Test
    public void testCaseTwo() {
        int[][] inputArray = new int[][] {
                {100, 12, 6},
                {19, 12, 15},
                {6, 1, 10},
        };
        assertThat(new Solution().solution(inputArray)).isEqualTo(29);
    }

    @Test
    public void testCaseThree() {
        int[][] inputArray = new int[][] {
                {-4, 0, -1},
                {-8, 1, -3},
                {1, -10, -5},
        };
        assertThat(new Solution().solution(inputArray)).isEqualTo(17);
    }

    @Test
    public void testCaseFour() {
        int[][] inputArray = new int[][] {
                {1, 3, 3},
                {10, 2, 2},
                {1, 3, 3},
        };
        assertThat(new Solution().solution(inputArray)).isEqualTo(8);
    }
}