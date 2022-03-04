package me.whiteship.demowebmvc;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(consumes = MediaType.APPLICATION_JSON_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE)
public class EventUpdateController {
    @PostMapping(value = "/events")
    @ResponseBody
    public String createEvents() {
        return "postEvents";
    }

    @PutMapping(value = "/events/{id}")
    @ResponseBody
    public String updateEvents(@PathVariable long id) {
        return "postEvents";
    }
}
