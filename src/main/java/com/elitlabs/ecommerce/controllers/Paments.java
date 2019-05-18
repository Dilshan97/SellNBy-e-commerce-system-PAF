package com.elitlabs.ecommerce.controllers;

import com.elitlabs.ecommerce.models.PamentDTO;
import com.elitlabs.ecommerce.services.PamentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController //api endpoint call karanna ona wenawa
@RequestMapping("/pament") // api end point eka sadaha
public class Paments {

    @Autowired
    private PamentServices pamentServices;

    @GetMapping("/all")
    public List<PamentDTO> allPament() {
        return pamentServices.findAllPament();
    }

    @PostMapping("/add")
    public String addPament(@RequestBody PamentDTO PamentData) {
        return pamentServices.savePament(PamentData);
    }

    @PutMapping("/update")
    public String updatePament(@RequestBody PamentDTO newPamentData) {
        return pamentServices.updatePament(newPamentData);
    }

    @GetMapping("/find/{id}")
    public Optional<PamentDTO> getPamentById(@PathVariable Integer id) {
        return pamentServices.findUByid(id);
    }
}
