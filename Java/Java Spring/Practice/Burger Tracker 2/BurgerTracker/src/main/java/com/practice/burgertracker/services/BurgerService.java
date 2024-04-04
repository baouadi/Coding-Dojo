package com.practice.burgertracker.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.practice.burgertracker.models.Burger;
import com.practice.burgertracker.repositories.BurgerRepository;

@Service 
public class BurgerService {
	private final BurgerRepository burgerRepo;
	
	public BurgerService(BurgerRepository burgerRepo) {
		this.burgerRepo = burgerRepo;
	}
	
	public List<Burger> allBurgers() {
		return burgerRepo.findAll();
	}
	
	public Burger addBurger(Burger burger) {
		return burgerRepo.save(burger);
	}
	
	public Burger updateBurger(Burger burger) {
		return burgerRepo.save(burger);
	}

	public Optional<Burger> findBurger(Long id) {
		return burgerRepo.findById(id);
	}
}
