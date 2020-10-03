package com.jeremyakatsa.dojosninjas.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jeremyakatsa.dojosninjas.models.Dojo;
import com.jeremyakatsa.dojosninjas.models.Ninja;
import com.jeremyakatsa.dojosninjas.repositories.DojoRepository;
import com.jeremyakatsa.dojosninjas.repositories.NinjaRepository;

@Service
public class AppService {
	private final DojoRepository dojoRepo;
	private final NinjaRepository ninjaRepo;
	public AppService(DojoRepository dRepo, NinjaRepository nRepo) {
		this.dojoRepo = dRepo;
		this.ninjaRepo = nRepo;
	}
	
	public Dojo getDojo(Long id) {
		return dojoRepo.findById(id).orElse(null);
	}
	public List<Dojo> getDojos() {
		return dojoRepo.findAll();
	}
	public Dojo createDojo(Dojo dojo) {
		return dojoRepo.save(dojo);
	}
	public Ninja createNinja(Ninja ninja) {
		return ninjaRepo.save(ninja);
	}
	public List<Ninja> getNinjas() {
		return ninjaRepo.findAll();
	}
	
}

