package org.example;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;
import org.junit.jupiter.api.Test;

class MainTest {
  @Test
  void test() {
    int i = new Random().nextInt(10);
    assertTrue(i >= 3);
  }
}