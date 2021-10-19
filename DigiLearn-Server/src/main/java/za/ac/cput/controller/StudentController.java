//package za.ac.cput.controller;
//
//
//import za.ac.cput.entity.Student;
//import za.ac.cput.factory.StudentFactory;
//import za.ac.cput.service.impl.StudentService;
//
//import java.util.Set;
//@RestController
//@RequestMapping ("/student")
//public class StudentController {
//    @Autowired
//    private StudentService studentService;
//
//    @PostMapping("/create")
//    public Student createStudent(@RequestBody Student student){
//        Student newStudent = StudentFactory.createStudent(student.getFirstName(), student.getLastName(), student.getStudentEmail(), student.getCourseID());
//        return studentService.create(newStudent);
//    }
//
//    @GetMapping("/read/{id}")
//    public Student getStudent(@PathVariable String id){
//        return studentService.read(id);
//    }
//
//    @PostMapping("/update")
//    public Student updateStudent(@RequestBody Student student){
//        return studentService.update(student);
//    }
//
//    @DeleteMapping("/delete/{id}")
//    public boolean deleteStudent(@PathVariable String id){
//        return studentService.delete(id);
//    }
//
//    @GetMapping("/getAll")
//    public Set<Student> getAllStudent(){
//        return studentService.getAll();
//    }
//
//}
//
//
