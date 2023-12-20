package demo.hkhop.service;

import demo.hkhop.repository.ReservationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class ReservationService {
    private final ReservationRepository reservationRepository = new
            ReservationRepository();

}
