package com.xworkz.generics.customtype;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class MusicPlayer implements Comparable<MusicPlayer>{
    private String title;
    private  String singer;
    private float duration;

    @Override
    public int compareTo(MusicPlayer o) {
        return Float.valueOf(this.getDuration()).compareTo(o.getDuration());
    }
}
