package head.consultAdd.Application.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import head.consultAdd.Application.customObjects.Person;
import head.consultAdd.Application.model.Student;
import head.consultAdd.Application.model.StudentMarks;

@RestController
public class Controller {
    
    @GetMapping("/")
    public String index() {
        return "Hello World yo!";
    }
    @GetMapping("/getAllStudents")
    public String test() {
        String uri="http://localhost:8080/getAllStudents";
        RestTemplate restTemplate=new RestTemplate();
        String result=restTemplate.getForObject(uri, String.class);
        return result;
    }
    @PostMapping("/addStudent")
    public String addStudent(@RequestBody Student student) {
        System.out.println(student);
        String uri="http://localhost:8080/addStudent";
        RestTemplate restTemplate=new RestTemplate();
        String result=restTemplate.postForObject(uri, student, String.class);
        return result;
    }
    @PutMapping("/update/{email}")
    public ResponseEntity<String>updateStudent(@PathVariable String email,@RequestBody StudentMarks studentMarks) {
        String uri="http://localhost:8080/update/"+email;
        RestTemplate restTemplate=new RestTemplate();
        System.out.println(studentMarks.getChemMarks());
        restTemplate.postForObject(uri, studentMarks, String.class);
        return ResponseEntity.ok("Updated");
    }
    @DeleteMapping("/delete/{email}")
    public ResponseEntity<String>deleteStudent(@PathVariable String email) {
        String uri="http://localhost:8080/delete/"+email;
        RestTemplate restTemplate=new RestTemplate();
        restTemplate.delete(uri);
        return ResponseEntity.ok("deleted");
    }


}
