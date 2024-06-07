package org.calculus.calculus;

import org.calculus.CalculusApplication;
import org.springframework.boot.SpringApplication;

public class TestCalculusApplication {

    public static void main(String[] args) {
        SpringApplication.from(CalculusApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
