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
        String foundFulName = find(fullName);
        if (foundFulName != null) {
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
}