package ni.edu.uca.ConexionBD.repositories;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import ni.edu.uca.ConexionBD.models.Pelicula;

@Repository
public class PeliculaDRepository implements PeliculaIRepository {

	@Override
	public List<Map<String, Object>> ListarRegistro() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int GuardarRegistro(Pelicula p) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int EditarRegistro(Pelicula p) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int EliminarRegistro(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
