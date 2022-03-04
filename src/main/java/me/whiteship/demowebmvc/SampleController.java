package me.whiteship.demowebmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleController {
    @GetHelloMapping
    @ResponseBody
    public String hello() {
        return "hello";
    }

    @GetMapping("/events")
    @ResponseBody
    public String getEvents() {
        return "events";
    }

    @GetMapping("/events/{id}")
    @ResponseBody
    public String getEvent(@PathVariable long id) {
        return "event";
    }

    @DeleteMapping("/events/{id}")
    @ResponseBody
    public String deleteEvent(@PathVariable long id) {
        return "deleteEvent";
    }
}
