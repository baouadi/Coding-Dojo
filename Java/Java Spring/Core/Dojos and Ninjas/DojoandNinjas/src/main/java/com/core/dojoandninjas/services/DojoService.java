package com.core.dojoandninjas.services;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.core.dojoandninjas.models.Dojo;
import com.core.dojoandninjas.repositories.DojoRepository;

@Service
public class DojoService {
	   @Autowired
	    private DojoRepository dojoRepository;

	    public List<Dojo> allDojos() {
	        return dojoRepository.findAll();
	    }

	    public Dojo addDojo(Dojo dojo) {
	        return dojoRepository.save(dojo);
	    }
	    public Dojo findDojo(Long id) {
	    	Optional<Dojo> optionalDojo = dojoRepository.findById(id);
	    	if(optionalDojo.isPresent()) {
	    		return optionalDojo.get();
	    	}else {
	    		return null;
	    	}
	    }
}
