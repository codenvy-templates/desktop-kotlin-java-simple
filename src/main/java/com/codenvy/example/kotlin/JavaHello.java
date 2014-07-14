package com.codenvy.example.kotlin;

public class JavaHello {
  public static String JavaHelloString = "Hello from Java!";

  public static String getHelloStringFromKotlin() {
    return com.codenvy.example.kotlin.KotlinPackage.getKotlinHelloString();
  }

  public static void main(String[] args) {
    System.out.println(getHelloStringFromKotlin());
    System.out.println(com.codenvy.example.kotlin.KotlinPackage.getHelloStringFromJava());
  }
}
