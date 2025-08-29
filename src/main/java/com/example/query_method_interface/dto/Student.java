package com.example.query_method_interface.dto;

public class Student {
    public static StudentInterface getNameStudent() {
        return (name) -> "Welcome to " + "Mac Pham";
    }

    public static void main(String[] args) {
        System.out.println(getNameStudent().getName("Test"));
    }
}
