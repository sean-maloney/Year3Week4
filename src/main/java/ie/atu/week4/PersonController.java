package ie.atu.week4;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/People")
public class PersonController {

    List<Person>personList = new ArrayList<>();
   @GetMapping("/listPerson")
   public List<Person> getperson(){ return personList; }
    @PostMapping("/createPerson")
    public List<Person> addPerson(@Valid @RequestBody Person person){
        personList.add(person);
        return personList;
    }
}
