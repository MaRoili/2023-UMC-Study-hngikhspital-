package demo.hkhop.service;

import demo.hkhop.repository.HospitalRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class HospitalService {
    private final HospitalRepository hospitalRepository = new
            HospitalRepository();

}
