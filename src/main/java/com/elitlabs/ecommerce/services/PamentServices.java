package com.elitlabs.ecommerce.services;

import com.elitlabs.ecommerce.models.PamentDTO;

import java.util.List;
import java.util.Optional;

public interface PamentServices {

    List<PamentDTO> findAllPament();

    String savePament(PamentDTO pamentData);

    String updatePament(PamentDTO newPamentData);

    Optional<PamentDTO> findUByid(Integer id);
}
