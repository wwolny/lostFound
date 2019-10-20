package com.wawcode.ramjonsoftware.api;

import java.util.List;
import java.util.ArrayList;

import com.wawcode.ramjonsoftware.entity.EventRepository;
import com.wawcode.ramjonsoftware.entity.LostEvent;
import com.wawcode.ramjonsoftware.entity.SinglePin;
import com.wawcode.ramjonsoftware.entity.SinglePinRepository;
import com.wawcode.ramjonsoftware.exceptions.EventNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
class EventController {

    @Autowired
    private EventRepository repository;

    @Autowired
    private SinglePinRepository pinRepository;

    @GetMapping("/events")
    List<LostEvent> all() {
        return repository.findAll();
    }

    @PostMapping("/event")
    LostEvent newEvent(@RequestBody LostEvent newEvent) {

        for(SinglePin pin : newEvent.getSinglePins()){
//            pin.setLostEvent(tempEvent);
            pinRepository.save(pin);
        }
//        ArrayList<SinglePin> singlePins = new ArrayList<>();
//        singlePins.addAll(newEvent.getSinglePins());
//        newEvent.setSinglePins(null);
//        for (SinglePin pin : singlePins) {
//            newEvent
//        }
        LostEvent tempEvent = repository.save(newEvent);
        return tempEvent;
    }

    @GetMapping("/pins")
    List<SinglePin> allPins() {
        return pinRepository.findAll();
    }

    @GetMapping("/events/{id}")
    LostEvent one(@PathVariable Long id) {

        return repository.findById(id).orElseThrow(() -> new EventNotFoundException(id));
    }

    @GetMapping("/rect/{lowerBound}/{upperBound}/{leftBound}/{rightBound}")
    List<LostEvent> listArea(@PathVariable Double lowerBound, @PathVariable Double upperBound,
            @PathVariable Double leftBound, @PathVariable Double rightBound) {

//        return repository.findInRectangle(lowerBound, upperBound, leftBound, rightBound);
        return null;
    }

    @DeleteMapping("/events/{id}")
    void deleteEvent(@PathVariable Long id) {
        repository.deleteById(id);
    }
}