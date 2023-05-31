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
///@Component
public class Drink extends  Consumation{
    public Drink(String name, Double price, Double calories) {
        super(name, price, calories);
    }

    @Override
    public String toString() {
        return "Drink{" +
                "calories=" + calories +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
