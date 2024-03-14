package com.github.aastrandemma;

public class App {
    public static void main(String[] args) {
        System.out.println(NameRepository.getSize());
        boolean isAddedTestName = NameRepository.add("Test Testsson");
        System.out.println("isAddedTestName = " + isAddedTestName);
        System.out.println(NameRepository.getSize());
        String foundTestName = NameRepository.find("test test");
        System.out.println("foundTestName = " + foundTestName);
    }
}