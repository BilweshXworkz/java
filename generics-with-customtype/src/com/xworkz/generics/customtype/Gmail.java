package com.xworkz.generics.customtype;

import lombok.*;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Gmail implements Comparable<Gmail> {
    private String toAddress;
    private String fromAddress;
    private String description;

    @Override
    public int compareTo(Gmail o) {
        return this.getToAddress().compareTo(o.getToAddress());
    }
}
