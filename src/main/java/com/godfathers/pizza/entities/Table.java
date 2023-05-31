package com.godfathers.pizza.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Setter
@Getter
@Slf4j
@ToString
public class Table {
    String ref;
    int seats;
    Boolean free = true;
    int occupiedPlaces = 0;

    public Table() {

    }
    public Table(String ref, int seats) {
        this.ref = ref;
        this.seats = seats;
    }

}
