package train.service;

import train.Repository.StudentRepository;

public class StudentService {
    public void Incertitude(){
        StudentRepository StudentRepository=new StudentRepository();
        StudentRepository.findAll();
    }
}
