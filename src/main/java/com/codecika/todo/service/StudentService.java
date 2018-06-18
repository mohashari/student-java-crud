package com.codecika.todo.service;

import com.codecika.todo.domain.presistance.Student;
import com.codecika.todo.domain.repository.StudenRepository;
import com.codecika.todo.vo.StudentVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudenRepository studenRepository;

    public Student saveStrudent(StudentVO vo) {
        Student student = new Student();
        student.setAlamat(vo.getAlamat().equals(null) ? "" : vo.getAlamat());
        student.setKelas(vo.getKelas().equals(null) ? "" : vo.getKelas());
        student.setNoHp(vo.getNoHp().equals(null) ? "" : vo.getNoHp());
        student.setNama(vo.getNama().equals(null) ? "" : vo.getNama());
        student.setStatusAktif(vo.getStatusAktif() == null ? false : vo.getStatusAktif());
        Student saved = studenRepository.saveAndFlush(student);
        return saved;
    }

    public List<StudentVO> getAll() {
        List<Student> students = studenRepository.findAll();
        List<StudentVO> vos = new ArrayList<>();
        students.forEach(model -> {
            StudentVO vo = new StudentVO();
            vo.setAlamat(model.getAlamat());
            vo.setNama(model.getNama());
            vo.setKelas(model.getKelas());
            vo.setNoHp(model.getNoHp());
            vo.setStatusAktif(model.getStatusAktif());
            vo.setId(model.getId());
            vos.add(vo);
        });
        return vos;
    }

    public StudentVO getDetail(String id) {
        Student model = studenRepository.getOne(Integer.getInteger(id));
        StudentVO vo = new StudentVO();
        vo.setAlamat(model.getAlamat());
        vo.setNama(model.getNama());
        vo.setKelas(model.getKelas());
        vo.setNoHp(model.getNoHp());
        vo.setStatusAktif(model.getStatusAktif());
        vo.setId(model.getId());
        return vo;
    }
}
