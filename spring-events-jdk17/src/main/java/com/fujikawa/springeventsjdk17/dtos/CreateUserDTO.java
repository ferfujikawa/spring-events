package com.fujikawa.springeventsjdk17.dtos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class CreateUserDTO {

    private String name;
    private String email;
}
