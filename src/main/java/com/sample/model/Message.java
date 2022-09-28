package com.sample.model;

import org.kie.api.definition.type.ClassReactive;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ClassReactive
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Message {
    public static final int HELLO=0;
    public static final int GOODBYE=1;

    private int status;
    private String message;
}
