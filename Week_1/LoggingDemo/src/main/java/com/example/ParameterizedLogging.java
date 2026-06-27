package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ParameterizedLogging {

    private static final Logger logger =
            LoggerFactory.getLogger(ParameterizedLogging.class);

    public static void main(String[] args) {

        String name = "Hasini";
        int age = 20;

        logger.info("Student name is {} and age is {}", name, age);

        String course = "Java";
        int marks = 95;

        logger.info("Course: {}, Marks: {}", course, marks);
    }
}