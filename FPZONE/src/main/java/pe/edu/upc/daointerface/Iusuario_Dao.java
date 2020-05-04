package pe.edu.upc.daointerface;

import pe.edu.upc.entity.usuario;
import java.util.List;

public interface Iusuario_Dao {

	public void insert(usuario u);
		
	public List<usuario> list();
		
}
