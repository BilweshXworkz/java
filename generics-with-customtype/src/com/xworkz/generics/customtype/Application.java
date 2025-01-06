package com.xworkz.generics.customtype;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Application implements Comparable<Application>{
    private String appName;
    private double version;
    private String developer;

    @Override
    public int compareTo(Application o) {
        return this.getAppName().compareTo(o.getAppName());
    }
}
