package com.webprizma;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SecondTest {
    @Test
    void TestFirst() {
        Assertions.assertTrue(3 > 2);
    }
    @Test
    void TestSecond() {
        Assertions.assertTrue(3 > 1);
    }
}
