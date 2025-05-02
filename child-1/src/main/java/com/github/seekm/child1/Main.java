package com.github.seekm.child1;

import java.util.Random;

public class Main {
  String generateSecretToken() {
    Random r = new Random();
    return Long.toHexString(r.nextLong());
  }
}