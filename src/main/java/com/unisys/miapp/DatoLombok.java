package com.ejemplos.clases;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DatoLombok {
    private String name;
    private Integer age;
    private Date fecha;

}