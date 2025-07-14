package tn.esprit.spring.schedular;


import lombok.AllArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import tn.esprit.spring.services.chambre.IChambreService;
import tn.esprit.spring.services.reservation.IReservationService;

@Component
@AllArgsConstructor
public class Schedular {

    IChambreService iChambreService;
    IReservationService iReservationService;

    @Scheduled(fixedRate = 300000)
    void service1() {
        iChambreService.listeChambresParBloc();
    }
}
