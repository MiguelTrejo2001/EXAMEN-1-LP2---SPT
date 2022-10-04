package upeu.edu.pe.pyventas.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import upeu.edu.pe.pyventas.service.CategoriesService;

@RestController
@RequestMapping("/api/categories")
public class CategoriesController {
	@Autowired
	private CategoriesService categoriesService;
	
	@GetMapping("/all")
	public List<Map<String, Object>> readAll(){		
		return categoriesService.readAll();
	}
}
