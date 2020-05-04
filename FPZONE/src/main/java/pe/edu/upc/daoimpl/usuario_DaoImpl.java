package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import javax.transaction.Transactional;

import pe.edu.upc.daointerface.Iusuario_Dao;
import pe.edu.upc.entity.usuario;

public class usuario_DaoImpl implements Iusuario_Dao , Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@PersistenceContext(unitName ="FPZONE" )
	private EntityManager em;
	@Transactional
	public void insert(usuario u) {
		
		try {
			em.persist(u);
		} catch (Exception e) {
			
			System.out.println("Error en DAO Iinsert usuario_DaoImpl");
			
			// TODO: handle exception
		}
		
	}
	
	@SuppressWarnings("unchecked")
	
	public List<usuario> list(){
		
		List<usuario> lista = new ArrayList<usuario>();
		
		try {
			Query q = em.createQuery("select u from usuario u");
			lista = (List<usuario>) q.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar usuario_DAOImpl");
			// TODO: handle exception
		}
		return lista;
		
	}
	
	
	

}
