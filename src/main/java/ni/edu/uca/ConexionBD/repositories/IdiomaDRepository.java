package ni.edu.uca.ConexionBD.repositories;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import ni.edu.uca.ConexionBD.models.Idioma;

@Repository
public class IdiomaDRepository implements IdiomaIRepository{

	@Override
	public List<Map<String, Object>> ListarRegistro() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int GuardarRegistro(Idioma i) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int EditarRegistro(Idioma i) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int EliminarRegistro(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
