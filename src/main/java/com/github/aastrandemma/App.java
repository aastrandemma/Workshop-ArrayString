package com.github.aastrandemma;

public class App {
    public static void main(String[] args) {
        System.out.println(NameRepository.getSize());
        boolean isAddedTestName = NameRepository.add("Test Testsson");
        System.out.println("isAddedTestName = " + isAddedTestName);
        System.out.println(NameRepository.getSize());
        String foundTestName = NameRepository.find("test test");
        System.out.println("foundTestName = " + foundTestName);
        System.out.println();

        // Part 3
        partThreeOne();
        partThreeTwo();
        partThreeThree();

        // Part 4
        partFour();
    }

    private static void partThreeOne() {
        addFirstNamesForPartThree();
        //String[] foundAllByFirstName = NameRepository.findByFirstName("Jane"); // Matches 3
        String[] foundAllByFirstName = NameRepository.findByFirstName("Emma"); // No matches
        System.out.println();
        if (foundAllByFirstName.length >= 1) {
            for (String foundFirstName : foundAllByFirstName) {
                System.out.println("foundAllByFirstName = " + foundFirstName);
            }
        } else {
            System.out.println("No matches found by first name.");
        }
    }

    private static void partThreeTwo() {
        addLastNamesForPartThree();
        String[] foundAllByLastName = NameRepository.findByLastName("Doe"); // Matches 4
        //String[] foundAllByLastName = NameRepository.findByLastName("Test"); // No matches
        System.out.println();
        if (foundAllByLastName.length >= 1) {
            for (String foundLastName : foundAllByLastName) {
                System.out.println("foundLastName = " + foundLastName);
            }
        } else {
            System.out.println("No matches found by last name.");
        }
    }

    private static void partThreeThree() {
        boolean updatedFullName = NameRepository.update("Test Testsson", "Joe Schmo"); // Matches
        //boolean updatedFullName = NameRepository.update("Schmo Test", "Joe Schmo"); // False = original don't exist
        //boolean updatedFullName = NameRepository.update("Test Testsson", "Jane Doe"); // False = updateName exist
        if (updatedFullName) {
            System.out.println();
            System.out.println("updatedFullName = " + updatedFullName);
        }
    }

    private static void addFirstNamesForPartThree() {
        boolean isAddedTestNameOne = NameRepository.add("Jane Doe");
        boolean isAddedTestNameTwo = NameRepository.add("jane Harry");
        boolean isAddedTestNameThree = NameRepository.add("Jane Tom");
    }

    private static void addLastNamesForPartThree() {
        boolean isAddedTestNameOne = NameRepository.add("Harry Doe");
        boolean isAddedTestNameTwo = NameRepository.add("Tom doe");
        boolean isAddedTestNameThree = NameRepository.add("John Doe");
    }

    private static void partFour() {
        boolean isRemoved = NameRepository.remove("Test Testsson");
        //boolean isRemoved = NameRepository.remove("Anna Andersson"); // False = fullName don't exist
        System.out.println();
        System.out.println("isRemoved = " + isRemoved);
    }
}