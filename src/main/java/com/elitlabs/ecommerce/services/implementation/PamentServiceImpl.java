package com.elitlabs.ecommerce.services.implementation;

import com.elitlabs.ecommerce.models.PamentDTO;
import com.elitlabs.ecommerce.repositories.PamentRepository;
import com.elitlabs.ecommerce.services.PamentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PamentServiceImpl implements PamentServices {

    @Autowired
    private PamentRepository pamentRepository;

    @Override
    public List<PamentDTO> findAllPament() {
        List<PamentDTO> allPament = pamentRepository.findAll();
        return allPament;
    }

    @Override
    public String savePament(PamentDTO pamentData) {
        pamentRepository.save(pamentData);
        return "data save";
    }

    @Override
    public String updatePament(PamentDTO newPamentData) {
        String msg = null;
        if(newPamentData.getP_id() != null){
            pamentRepository.save(newPamentData);
            msg = "Data updated";
        }else{
            msg = "Data not updated";
        }
        return msg;
    }

    @Override
    public Optional<PamentDTO> findUByid(Integer id) {
        return pamentRepository.findById(id);

    }


}
