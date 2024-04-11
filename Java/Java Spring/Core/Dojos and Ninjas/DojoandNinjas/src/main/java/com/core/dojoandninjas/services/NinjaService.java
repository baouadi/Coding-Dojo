package com.core.dojoandninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.core.dojoandninjas.models.Ninja;
import com.core.dojoandninjas.repositories.NinjaRepository;

@Service
public class NinjaService {
	@Autowired
    private NinjaRepository ninjaRepository;

    public List<Ninja> allNinjas() {
        return ninjaRepository.findAll();
    }

 
    public Ninja save(Ninja ninja) {
        return ninjaRepository.save(ninja);
    }
    
    public Ninja findNinja(Long id) {
    	Optional<Ninja> optionalNinja = ninjaRepository.findById(id);
    	if(optionalNinja.isPresent()) {
    		return optionalNinja.get();
    	}else {
    		return null;
    	}

    }}
