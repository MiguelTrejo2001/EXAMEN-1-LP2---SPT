package upeu.edu.pe.pyventas.dao;

import java.util.List;
import java.util.Map;

public interface Operaciones <T>{
	List<Map<String,Object>> readAll();
}
