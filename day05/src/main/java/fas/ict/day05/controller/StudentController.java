package fas.ict.day05.controller;

import fas.ict.day05.model.Student;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController extends CrudController<String,Student>{
Student Bob = new Student("2021IT01", "Bob Marely", 23, "IT", 3.2);
	Student Alice = new Student("2021IT02", "Alice corner", 24, "IT", 3.6);
	Student John = new Student("2021IT03", "John Parker", 23, "IT", 3.3);

	public StudentController() {	
		getMap().put(Alice.getRegNo(), Alice);
		getMap().put(Bob.getRegNo(), Bob);
		getMap().put(John.getRegNo(), John);
	}
}
