package com.practice.burgertracker1.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.practice.burgertracker1.models.Burger;
import com.practice.burgertracker1.repositories.BurgerRepository;

@Service
public class BurgerService {

		private final BurgerRepository burgerRepository;
		public BurgerService(BurgerRepository burgerRepository) {
			this.burgerRepository=burgerRepository;
		}
		
		public List<Burger> allBurger(){
			return burgerRepository.findAll();
		}

		public void createBurger(Burger burger) { 
	        burgerRepository.save(burger);
	    }
		
}
