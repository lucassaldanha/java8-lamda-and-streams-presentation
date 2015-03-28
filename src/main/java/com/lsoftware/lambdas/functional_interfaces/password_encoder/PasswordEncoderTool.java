package com.lsoftware.lambdas.functional_interfaces.password_encoder;

public class PasswordEncoderTool {

    public static void main(String[] args) {
        PasswordEncoder passwordEncoder = makeBadEncoder();
        doSomething(passwordEncoder);
    }

    public static PasswordEncoder makeBadEncoder() {
        return (password, salt) -> password.toUpperCase();
    }

    public static void doSomething(PasswordEncoder passwordEncoder) {
        String salted = passwordEncoder.encode("abc", "123");
        System.out.println(salted);
    }

}
