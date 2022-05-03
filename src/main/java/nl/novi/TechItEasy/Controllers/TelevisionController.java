package nl.novi.TechItEasy.Controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController

public class TelevisionController {

    @GetMapping("/televisions")
    public ResponseEntity<Object> getAllTelevisions() {

        return (ResponseEntity<Object>) ResponseEntity.ok();

    }

    @GetMapping("/televisions/{id}")

    public ResponseEntity<Object> getTelevision() {
        return (ResponseEntity<Object>) ResponseEntity.ok();
    }

    @PostMapping("/televisions")
    public ResponseEntity<Object> addTelevision(@RequestBody String television) {

        URI http = null;
        return ((ResponseEntity<Object>) ResponseEntity.created(http));

    }

    @DeleteMapping("/televisions/{id}")
    public ResponseEntity<Object> deleteTelevision(@PathVariable int id) {

        return (ResponseEntity<Object>) ResponseEntity.noContent();

    }

    @PutMapping("/televisions/{id}")
    public ResponseEntity<Object> updateTelevision(@PathVariable int id, @RequestBody String television) {

        return (ResponseEntity<Object>) ResponseEntity.noContent();

    }

    @GetMapping("/televisions?branch={branch}")
    public ResponseEntity<Object> getAllTelevisions(@RequestParam String brand) {

        return (ResponseEntity<Object>) ResponseEntity.ok();

    }

}

