package com.sample.model;

import org.kie.api.definition.type.ClassReactive;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ClassReactive
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Oid {
    private String oid;
    private String value;
    private String result = "";
}
