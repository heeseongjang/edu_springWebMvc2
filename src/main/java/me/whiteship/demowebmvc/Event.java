package me.whiteship.demowebmvc;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Min;

@Getter
@Setter
public class Event {
    private Integer id;
    private String name;
    @Min(0)
    private Integer limit;
}
