package me.whiteship.demowebmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class SampleController {

    @GetMapping("/events/form")
    public String eventsForm(Model model) {
        Event newEvent = new Event();
        newEvent.setLimit(50);
        model.addAttribute("event", newEvent);
        return "events/form";
    }

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
    public Event insertEvent(@Valid @ModelAttribute Event event, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            System.out.println("============================");
            bindingResult.getAllErrors().forEach(e -> System.out.println(e.toString()));
        }
        event.setName(event.getName());
        event.setLimit(event.getLimit());
        return event;
    }
}
