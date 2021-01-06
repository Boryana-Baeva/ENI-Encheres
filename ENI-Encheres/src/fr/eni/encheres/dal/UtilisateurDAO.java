package fr.eni.encheres.dal;

import java.util.List;

import fr.eni.encheres.BusinessException;
import fr.eni.encheres.bo.Utilisateur;

public interface UtilisateurDAO {
	
	public void insert(Utilisateur utilisateur) throws BusinessException;
	
	public List<Utilisateur> getAll() throws BusinessException;
	
	public Utilisateur getById(int id) throws BusinessException;
	
	public void update(Utilisateur utilisateur) throws BusinessException;
	
	public void delete(int id) throws BusinessException;

	

	
}
