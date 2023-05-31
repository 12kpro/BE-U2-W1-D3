package com.godfathers.pizza.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Setter
@Getter
@Slf4j
//@ToString
//@Component
public class Merchandise extends Product{
    public Merchandise(String name, Double price) {
        super(name, price);
    }

    @Override
    public String toString() {
        return "Merchandise{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
