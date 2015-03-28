package com.lsoftware.lambdas.functional_interfaces.password_encoder;

@FunctionalInterface
public interface PasswordEncoder {

    String encode(String password, String salt);

}
