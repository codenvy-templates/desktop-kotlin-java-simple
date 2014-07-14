package com.codenvy.example.kotlin;

import junit.framework.TestCase;

public class HelloTest extends TestCase {
  public void testAssert() {
    assertEquals("Hello from Kotlin!", JavaHello.getHelloStringFromKotlin());
    assertEquals("Hello from Java!", com.codenvy.example.kotlin.KotlinPackage.getHelloStringFromJava());

    System.out.println(com.codenvy.example.kotlin.KotlinPackage.getHelloStringFromJava());
  }
}
