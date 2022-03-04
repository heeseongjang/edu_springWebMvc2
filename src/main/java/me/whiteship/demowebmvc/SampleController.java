package me.whiteship.demowebmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SampleController {

    @GetMapping("/events/{id}")
    @ResponseBody
    public Event getEvent(@PathVariable Integer id, @MatrixVariable String name) {
        Event event = new Event();
        event.setId(id);
        event.setName(name);
        return event;
    }

    @PostMapping("/events")
    @ResponseBody
    public Event insertEvent(@RequestParam(required = false, defaultValue = "heeseong") String name) {
        Event event = new Event();
        event.setName(name);
        return event;
    }
}
