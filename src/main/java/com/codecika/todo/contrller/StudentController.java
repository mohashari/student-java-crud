package com.codecika.todo.contrller;

import com.codecika.todo.domain.presistance.Student;
import com.codecika.todo.service.StudentService;
import com.codecika.todo.vo.StudentVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @RequestMapping(value = "",
            method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Student saveModel(@RequestBody StudentVO vo) {
        return studentService.saveStrudent(vo);
    }

    @RequestMapping(value = "",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public List<StudentVO> getAll() {
        return studentService.getAll();
    }
}
