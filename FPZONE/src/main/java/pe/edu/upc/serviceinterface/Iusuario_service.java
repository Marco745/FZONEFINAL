package pe.edu.upc.serviceinterface;

import java.util.List;

import pe.edu.upc.entity.usuario;

public interface Iusuario_service {

	public void insert(usuario  u);
	
	public List<usuario> list();
}
