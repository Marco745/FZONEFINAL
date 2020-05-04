package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import pe.edu.upc.entity.usuario;
import pe.edu.upc.serviceinterface.Iusuario_service;

@Named
@RequestScoped
public class usuario_controller implements Serializable  {

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Iusuario_service iService;
	//variables
	private usuario u;
	List<usuario> Lista_usuario;
	
	@PostConstruct 
	public void init() {
		
		this.Lista_usuario = new ArrayList<usuario>();
		this.u= new usuario();
		this.List();
	}
	
	//metodos
	
	public String new_usuario() {
		this.setU(new usuario());
		return "infectiousAgent.xhtml";
	}
	
	
	
	public void insert() {
		try {
			iService.insert(u);
			clean_usuario();
			this.List();
		} catch (Exception e) {
			System.out.println("Error al insertar usuario");
			// TODO: handle exception
		}
	}
	
	private void List() {
		
		Lista_usuario = iService.list();
		System.out.println("Error listar");
		// TODO Auto-generated method stub	
	}
	
	
	public void clean_usuario() {
		this.init();
		
	}
	
	
	//get_set
	
	
	public usuario getU() {
		return u;
	}

	public void setU(usuario u) {
		this.u = u;
	}
	
	public List<usuario> getLista_usuario() {
		return Lista_usuario;
	}

	public void setLista_usuario(List<usuario> lista_usuario) {
		Lista_usuario = lista_usuario;
	}
}
