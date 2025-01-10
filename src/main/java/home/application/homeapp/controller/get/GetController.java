package home.application.homeapp.controller.get;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetController {
    private static final Logger log = LoggerFactory.getLogger(GetController.class);

    @GetMapping("/api/gaslocations")
    private void getGasstations(){
        log.info("Attempting to get gas stations list");
    }

}
