package com.example.FormValidationJquery;


import lombok.*;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Emp {

    public int id;
    @NotEmpty(message = "name can not empty")
    @Size(max = 5, min = 1, message = "1 to 5")
    public String name;
    @NotEmpty(message = "age can not empty")
    @Size(max = 5, min = 1, message = "1 to 5")
    public String age;


}
