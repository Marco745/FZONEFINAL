package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import pe.edu.upc.daointerface.Iusuario_Dao;
import pe.edu.upc.entity.usuario;
import pe.edu.upc.serviceinterface.Iusuario_service;

public class usuario_ServiceImpl implements Iusuario_service, Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Iusuario_Dao iD;
	
	
	public void insert (usuario u) {
		try {
			
		iD.insert(u);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error en el service al insertar un usuario");
		}

		
	}
	
	public List<usuario> list(){
		
		
		return iD.list();
	}
	
	
}
