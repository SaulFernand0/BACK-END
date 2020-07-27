package pe.edu.upeu.biblioteca.modelo.daoIMP;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.biblioteca.modelo.dao.LibroDao;

@Repository
public class LibroDaoImp implements LibroDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Map<String, Object>> readall() {
		// TODO Auto-generated method stub
		return jdbcTemplate.queryForList("select * from libro");
	}
}
