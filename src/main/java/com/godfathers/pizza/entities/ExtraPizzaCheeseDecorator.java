package com.godfathers.pizza.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Setter
@Getter
@Slf4j
@ToString
public class ExtraPizzaCheeseDecorator extends ExtraPizzaDecorator{
    public ExtraPizzaCheeseDecorator(){
        super("Cheese",0.69, 92.0);
    }
    public ExtraPizzaCheeseDecorator(Consumation pizza){
        super("Cheese",0.69, 92.0);
        this.decoratedPizza = pizza;
    }

}
