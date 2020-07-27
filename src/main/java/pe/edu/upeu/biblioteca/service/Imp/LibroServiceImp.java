package pe.edu.upeu.biblioteca.service.Imp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.biblioteca.modelo.dao.LibroDao;
import pe.edu.upeu.biblioteca.service.LibroService;

@Service
public class LibroServiceImp implements LibroService {

	@Autowired
	private LibroDao librodao;
	@Override
	public List<Map<String, Object>> readall() {
		// TODO Auto-generated method stub
		return librodao.readall();
	}
	

}