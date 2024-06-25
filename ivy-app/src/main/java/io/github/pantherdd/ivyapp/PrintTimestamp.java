package io.github.pantherdd.ivyapp;

import io.github.pantherdd.datetime.format.DateTimeFormat;

import java.time.Instant;

/**
 * This is the Javadoc of the {@link PrintTimestamp} class.
 */
public class PrintTimestamp {

    /**
     * Prints the current date and time to the console.
     *
     * @param args Command-line arguments.
     */
    public static void main(String[] args) throws Exception {
        System.out.println("Now: " + DateTimeFormat.format(Instant.now()));

        Class<?> currentDateTime = Class.forName("io.github.pantherdd.datetime.current.CurrentDateTime");
        System.out.println(currentDateTime.getMethod("asMessage").invoke(null));
    }
}
