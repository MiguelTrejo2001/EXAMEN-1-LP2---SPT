package upeu.edu.pe.pyventas.daoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import upeu.edu.pe.pyventas.dao.Operaciones;
import upeu.edu.pe.pyventas.entity.Categories;

@Component
public class CategoriesDaoImpl implements Operaciones<Categories>{

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		String SQL = "select C.CategoryName as CATEGORIA,count(P.CategoryID) as CANTIDAD from products P\r\n"
				+ "inner join categories C on  P.CategoryID =C.CategoryID group by P.CategoryID;";
		return jdbcTemplate.queryForList(SQL);
	}
}
