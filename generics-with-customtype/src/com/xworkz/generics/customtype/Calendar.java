package com.xworkz.generics.customtype;

import lombok.*;

import java.util.Comparator;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Calendar implements Comparable<Calendar> {
    private int calenderId;
    private String eventDate;
    private String description;
    private boolean isAllDayEvent;

    @Override
    public int compareTo(Calendar o) {
        return this.getEventDate().compareTo(o.getEventDate());
    }
}
