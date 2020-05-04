package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuario_perfil")

public class usuario implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int id_Usuario;

	@Column(name = "Nombre_Usuario", nullable = false, length = 60)
	private String Nombre_Usuario;
	@Column(name = "ApellidoPa_Usuario", nullable = false, length = 60)
	private String ApellidoPa_Usuario;

	private int Edad_Usuario;
	private String Genero_Usuario;
	private String Pais_Usuario;

//ContrustorSinParametros
	public usuario() {
		super();
		// TODO Auto-generated constructor stub
	}


	// Contrusctor_Parametros

	public usuario(int id_Usuario, String nombre_Usuario, String ApellidoPa_Usuario, int Edad_Usuario,
			String Genero_Usuario, String Pais_Usuario) {
		super();
		
		this.id_Usuario =id_Usuario;
		this.Nombre_Usuario = nombre_Usuario;
		this.ApellidoPa_Usuario =ApellidoPa_Usuario;
		this.Edad_Usuario =Edad_Usuario;
		this.Genero_Usuario = Genero_Usuario;
		this.Pais_Usuario = Pais_Usuario;
		
		
		
		
	}

	
	// Get_sETER
	public int getId_Usuario() {
		return id_Usuario;
	}

	public void setId_Usuario(int id_Usuario) {
		this.id_Usuario = id_Usuario;
	}

	public String getNombre_Usuario() {
		return Nombre_Usuario;
	}

	public void setNombre_Usuario(String nombre_Usuario) {
		Nombre_Usuario = nombre_Usuario;
	}

	public String getApellidoPa_Usuario() {
		return ApellidoPa_Usuario;
	}

	public void setApellidoPa_Usuario(String apellidoPa_Usuario) {
		ApellidoPa_Usuario = apellidoPa_Usuario;
	}

	public int getEdad_Usuario() {
		return Edad_Usuario;
	}

	public void setEdad_Usuario(int edad_Usuario) {
		Edad_Usuario = edad_Usuario;
	}

	public String getGenero_Usuario() {
		return Genero_Usuario;
	}

	public void setGenero_Usuario(String genero_Usuario) {
		Genero_Usuario = genero_Usuario;
	}

	public String getPais_Usuario() {
		return Pais_Usuario;
	}

	public void setPais_Usuario(String pais_Usuario) {
		Pais_Usuario = pais_Usuario;
	}

	
}
