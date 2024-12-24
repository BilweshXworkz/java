package com.xworkz.gmailapp.maildata;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString

public class EMail {
    private int GId;
    private String to;
    private String from;
    private String subject;
    private String body;
    private boolean attached;
}
