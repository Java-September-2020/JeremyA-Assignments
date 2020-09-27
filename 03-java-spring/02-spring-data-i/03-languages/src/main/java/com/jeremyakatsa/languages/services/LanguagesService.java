package com.jeremyakatsa.languages.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jeremyakatsa.languages.models.Language;
import com.jeremyakatsa.languages.repositories.LanguagesRepository;

@Service
public class LanguagesService {
	@Autowired
	private final LanguagesRepository languageRepo;
	public LanguagesService(LanguagesRepository repository) {
		this.languageRepo = repository;
	}
	
	public List<Language> allLanguages() {
		return languageRepo.findAll();
	}
	
	public Language findLanguage(Long id) {
		return languageRepo.findById(id).orElse(null);
	}
	public Language createLanguage(Language lang) {
		return languageRepo.save(lang);
	}
	
	public Language updateLanguage(Language lang) {
		return languageRepo.save(lang);
	}
	
	public void deleteLanguage(Long id) {
		languageRepo.deleteById(id);
	}
}
