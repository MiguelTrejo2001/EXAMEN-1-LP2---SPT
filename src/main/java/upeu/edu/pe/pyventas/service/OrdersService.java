package upeu.edu.pe.pyventas.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import upeu.edu.pe.pyventas.dao.Operaciones;
import upeu.edu.pe.pyventas.daoImpl.OrdersDaoImpl;
import upeu.edu.pe.pyventas.entity.Orders;

@Service
public class OrdersService implements Operaciones<Orders>{
	@Autowired
	private OrdersDaoImpl daoImpl;
	
	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return daoImpl.readAll();
	}

}