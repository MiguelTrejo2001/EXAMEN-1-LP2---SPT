package upeu.edu.pe.pyventas.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import upeu.edu.pe.pyventas.service.OrdersService;

@RestController
@RequestMapping("/api/orders")
public class OrdersController {
	@Autowired
	private OrdersService ordersService;
	
	@GetMapping("/all")
	public List<Map<String, Object>> readAll(){		
		return ordersService.readAll();
	}
}
