package com.github.aastrandemma;
import java.util.Arrays;

public class NameRepository {
    static String[] names = new String[0];

    public static String find(final String fullName) {
        for (String name : names) {
            if (name.equalsIgnoreCase(fullName)) {
                return name;
            }
        }
        return null;
    }

    public static boolean add(final String fullName) {
        String foundFullName = find(fullName);
        if (foundFullName != null) {
            return false;
        }
        String[] newNames = Arrays.copyOf(names, names.length + 1);
        newNames[newNames.length - 1] = fullName;
        names = newNames;
        return true;
    }

    public static int getSize() {
        return names.length;
    }

    // Part 3
    public static String[] findByFirstName(final String firstName) {
        // Searches the array trying to find all names that has passed in first name.
        // Returns a String array containing all matches.
        String[] findFirstName = new String[names.length];
        int count = 0;
        for (String name : names) {
            if (name.split(" ")[0].equalsIgnoreCase(firstName)) {
                findFirstName[count] = name;
                count++;
            }
        }
        findFirstName = Arrays.copyOfRange(findFirstName, 0, count);
        return findFirstName;
    }

    public static String[] findByLastName(final String lastName) {
        // Searches the array trying to find all names that has passed in last name.
        // Returns a String array containing all matches.
        String[] findLastName = new String[names.length];
        int count = 0;
        for (String name : names) {
            if (name.split(" ")[1].equalsIgnoreCase(lastName)) {
                findLastName[count] = name;
                count++;
            }
        }
        findLastName = Arrays.copyOfRange(findLastName, 0, count);
        return findLastName;
    }

    public static boolean update(final String original, final String updatedName) {
        // False if name could not be updated because name wasn't found
        if (find(original) == null) {
            return false;
        }
        // False if name was found but an existing name matching the updatedName already exists
        if (find(updatedName) != null) {
            return false;
        }
        // Should find a name and replace it with new fullName if available.
        // Returns true if name was found and updated.
        for (String name : names) {
            if (name.equalsIgnoreCase(original)) {
                name = updatedName;
                return true;
            }
        }
        return false;
    }
}