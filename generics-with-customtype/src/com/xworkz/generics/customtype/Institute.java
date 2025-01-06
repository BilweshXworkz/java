package com.xworkz.generics.customtype;

import lombok.*;

import java.util.ArrayList;
import java.util.Collection;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Institute implements Comparable<Institute> {
    private int id;
    private String name;
    private String email;
    private long phoneNumber;
    private boolean isPlaced;

    @Override
    public int compareTo(Institute o) {
        return Integer.valueOf(this.getId()).compareTo(o.getId());
    }
}
