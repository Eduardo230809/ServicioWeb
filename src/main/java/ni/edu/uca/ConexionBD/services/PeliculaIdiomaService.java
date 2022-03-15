package ni.edu.uca.ConexionBD.services;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import ni.edu.uca.ConexionBD.models.PeliculaIdioma;
import ni.edu.uca.ConexionBD.repositories.PeliculaIdiomaIRepository;

@Service
public class PeliculaIdiomaService implements PeliculaIdiomaIRepository{

	@Override
	public List<Map<String, Object>> ListarRegistro() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int GuardarRegistro(PeliculaIdioma pi) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int EditarRegistro(PeliculaIdioma pi) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int EliminarRegistro(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
