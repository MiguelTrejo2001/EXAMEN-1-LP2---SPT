package upeu.edu.pe.pyventas.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import upeu.edu.pe.pyventas.dao.Operaciones;
import upeu.edu.pe.pyventas.daoImpl.CategoriesDaoImpl;
import upeu.edu.pe.pyventas.entity.Categories;

@Service
public class CategoriesService implements Operaciones<Categories> {
	@Autowired
	private CategoriesDaoImpl daoImpl;

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return daoImpl.readAll();
	}
	
}
