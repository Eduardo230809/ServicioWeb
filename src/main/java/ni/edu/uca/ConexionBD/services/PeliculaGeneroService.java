package ni.edu.uca.ConexionBD.services;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import ni.edu.uca.ConexionBD.models.PeliculaGenero;
import ni.edu.uca.ConexionBD.repositories.PeliculaGeneroIRepository;

@Service
public class PeliculaGeneroService implements PeliculaGeneroIRepository{

	@Override
	public List<Map<String, Object>> ListarRegistro() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int GuardarRegistro(PeliculaGenero pg) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int EditarRegistro(PeliculaGenero pg) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int EliminarRegistro(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
