package com.example.helloworld;

/**
 * Contains classes related to the HelloWorld application.
 */
package com.example.helloworld;  // Ensure that this package has its own package-info.java file.

public final class App {
    
    /**
     * Private constructor to prevent instantiation.
     */
    private App() {
        // private constructor to prevent instantiation
    }

    /**
     * The entry point for the HelloWorld application.
     * 
     * @param args the command-line arguments (not used)
     */
    public static void main(final String[] args) {
        System.out.println("Hello World!");
    }
}
