package ma.egilekom.api.entitiespoc.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/projects")
public class ProjectController {

    @GetMapping()
    public ResponseEntity<List<String>> listResponseEntity(){
        return ResponseEntity.ok( List.of(
                "building todo application",
                "egilekom-entities-poc",
                "egilekom-entities-poc",
                "egilekom-entities-poc"

        ));
    }
}
