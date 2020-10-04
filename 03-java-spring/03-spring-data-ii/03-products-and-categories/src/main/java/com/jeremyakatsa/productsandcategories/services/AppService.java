package com.jeremyakatsa.productsandcategories.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jeremyakatsa.productsandcategories.models.Association;
import com.jeremyakatsa.productsandcategories.models.Category;
import com.jeremyakatsa.productsandcategories.models.Product;
import com.jeremyakatsa.productsandcategories.repositories.AssociationRepository;
import com.jeremyakatsa.productsandcategories.repositories.CategoryRepository;
import com.jeremyakatsa.productsandcategories.repositories.ProductRepository;

@Service
public class AppService {
	private final ProductRepository productRepo;
	private final CategoryRepository categoryRepo;
	private final AssociationRepository associationRepo;
	public AppService(ProductRepository prodRepo, CategoryRepository catRepo, AssociationRepository assoRepo) {
		this.productRepo = prodRepo;
		this.categoryRepo = catRepo;
		this.associationRepo = assoRepo;
	}
	
	public List<Product> findProducts() {
		return this.productRepo.findAll();
	}
	public Product getProduct(Long id) {
		return this.productRepo.findById(id).orElse(null);
	}
	public List<Category> findCategories() {
		return this.categoryRepo.findAll();
	}
	public Product createProduct(Product product) {
		return this.productRepo.save(product);
	}
	public Association createAssociation(Association ass) {
		return this.associationRepo.save(ass);
	}
	public List<Category> findCategoriesNotInProduct(Product product) {
		return categoryRepo.findByProductsNotContains(product);
	}
	public List<Product> findProductsNotInCategory(Category category) {
		return productRepo.findByCategoriesNotContains(category);
	}
}
