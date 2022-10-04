package upeu.edu.pe.pyventas.daoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import upeu.edu.pe.pyventas.dao.Operaciones;
import upeu.edu.pe.pyventas.entity.Orders;

@Component
public class OrdersDaoImpl implements Operaciones<Orders>{

	@Autowired
	private JdbcTemplate jdbcTemplate;


	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		String SQL = "select O.ShipCountry ORDEN,count(C.CustomerID) as CANTIDAD from orders O  \r\n"
				+ "inner join customers C on  O.CustomerID =C.CustomerID group by C.Country;";
		return jdbcTemplate.queryForList(SQL);
	}

}
