package com.jeremyakatsa.dojooverflow.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jeremyakatsa.dojooverflow.models.Answers;
import com.jeremyakatsa.dojooverflow.models.Questions;
import com.jeremyakatsa.dojooverflow.models.Tags;
import com.jeremyakatsa.dojooverflow.repositories.AnswersRepository;
import com.jeremyakatsa.dojooverflow.repositories.QuestionsRepository;
import com.jeremyakatsa.dojooverflow.repositories.TagsRepository;

@Service
public class AppService {
	private final AnswersRepository answersRepo;
	private final QuestionsRepository questionsRepo;
	private final TagsRepository tagsRepo;
	public AppService(AnswersRepository aRepo, QuestionsRepository qRepo, TagsRepository tRepo) {
		this.answersRepo = aRepo;
		this.questionsRepo = qRepo;
		this.tagsRepo = tRepo;
	}
	
	public Questions createQuestion(Questions questions) {
		return questionsRepo.save(questions);
	}
	public Answers createAnswer(Answers answers) {
		return answersRepo.save(answers);
	}
	public Tags createTag(Tags tags) {
		return tagsRepo.save(tags);
	}
	 public List<Questions> allQuestions() {
		 return questionsRepo.findAll();
	 }
	 public List<Answers> allAnswers() {
		 return answersRepo.findAll();
	 }
	 public List<Tags> allTags() {
		 return tagsRepo.findAll();
	 }
	 public Tags findTag(Long id) {
		 return this.tagsRepo.findById(id).orElse(null);
	 }

}
