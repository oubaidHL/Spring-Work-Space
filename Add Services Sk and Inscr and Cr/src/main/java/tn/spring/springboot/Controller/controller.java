package tn.spring.springboot.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import tn.spring.springboot.Entity.Moniteur;
import tn.spring.springboot.Service.ICoursService;
import tn.spring.springboot.Service.IMoniteurService;
import tn.spring.springboot.Service.ISkieurService;

import java.util.List;

@RestController
public class controller {
    @Autowired
    ISkieurService sk;
    @Autowired
    ICoursService cs;
    @Autowired
    IMoniteurService moniteurService;



    // http://localhost:8089/stationSki/moniteur/retrieve-all-moniteurs
    @GetMapping("/retrieve-all-moniteurs")
    public List<Moniteur> getMoniteurs() {
        return moniteurService.retrieveAllMoniteurs();
    }

    @GetMapping("/retrieve-moniteur/{num_moniteur}")
    public Moniteur retrieveMoniteur(@PathVariable("num_moniteur") Long moniteurId) {
        return moniteurService.retrieveMoniteur(moniteurId);
    }

    @DeleteMapping("/removeMoniteur/{num_Moniteur}")
    public void deleteMoniteur(@PathVariable("num_Moniteur") Long moniteurId) {
        moniteurService.removeMoniteur(moniteurId);
    }

    @PostMapping("/addMoniteur")
    public Moniteur addMoniteur(@RequestBody Moniteur m) {
        return moniteurService.addOrUpdateMoniteur(m);
    }

    @PutMapping("/updateMoniteur")
    public Moniteur updateMoniteur(@RequestBody Moniteur m) {
        return moniteurService.addOrUpdateMoniteur(m);
    }
}
