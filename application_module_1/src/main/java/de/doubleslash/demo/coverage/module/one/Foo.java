package de.doubleslash.demo.coverage.module.one;

import java.io.*;
import java.nio.file.*;
import java.nio.charset.StandardCharsets;

public class Foo {

    public Foo() {
        init();
    }

    private void printInputStream(final InputStream is) throws Exception {
        try (final InputStreamReader streamReader =
                     new InputStreamReader(is, StandardCharsets.UTF_8);
             final BufferedReader reader = new BufferedReader(streamReader)) {

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (final IOException e) {
            e.printStackTrace();
        }
    }

    private void init() {
        try {
            final String fileName = "test.txt";
            InputStream is;

            // resource loading
            System.out.println("ClassLoader.getResource(test)");
            is = getClass().getClassLoader().getResourceAsStream(fileName);
            printInputStream(is);
            if (is != null) {
                is.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private int i = 5;
    private String s = "jacoco";

    public int fooMethod() {
        return i + 1;
    }

    public String conditionedFooMethod(boolean condition) {
        if (condition) {
            return s;
        }
        else {
            int j = i + 1;
            return s + String.valueOf(j);
        }
    }

}
