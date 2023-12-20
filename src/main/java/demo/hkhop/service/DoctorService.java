package demo.hkhop.service;

import demo.hkhop.domain.Department;
import demo.hkhop.domain.Doctor;
import demo.hkhop.repository.DepartmentRepository;
import demo.hkhop.repository.DoctorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;


@Service
@RequiredArgsConstructor
public class DoctorService {

    private final DoctorRepository doctorRepository = new
            DoctorRepository();

        @Transactional
    public void MakeDoctor(Long doctor_id, Department department){
            Doctor doctor = doctorRepository.findById(doctor_id);
            doctor.setDepartment(department);
            department.getDoctorList().add(doctor);
            doctorRepository.save(doctor);
            DepartmentRepository.save(department);
        }

}
