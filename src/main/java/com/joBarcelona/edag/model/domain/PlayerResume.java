package com.joBarcelona.edag.model.domain;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PlayerResume {
    private String name;
    private String squad;
    private String age;
    private int goals;

}
