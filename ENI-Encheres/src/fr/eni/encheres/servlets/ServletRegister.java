package fr.eni.encheres.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.eni.encheres.BusinessException;
import fr.eni.encheres.bll.UtilisateurManager;
import fr.eni.encheres.bo.Utilisateur;

/**
 * Servlet implementation class ServletRegister
 */
@WebServlet("/register")
public class ServletRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletRegister() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		try {
			
			String nom = request.getParameter("nom");
			String prenom = request.getParameter("prenom");
			String pseudo = request.getParameter("pseudo");
			String email = request.getParameter("email");
			String password = request.getParameter("mdp");
			String confirmation = request.getParameter("mdpConf");
			String telephone = request.getParameter("tel");
			String rue = request.getParameter("rue");
			String ville = request.getParameter("ville");
			String codePostal = request.getParameter("cp");
			
			if(nom.length()==0 || nom.isEmpty() ) {
				request.setAttribute("erreur", "Le nom n'a pas �t� renseign�, veuillez le saisir ...");
				this.getServletContext().getRequestDispatcher("/ServletRegister").forward(request, response);
			}
			
			else if (prenom.length()==0 || prenom.isEmpty() ) {
				request.setAttribute("erreur", "Le pr�nom n'a pas �t� renseign�, veuillez le saisir ...");
				this.getServletContext().getRequestDispatcher("/ServletRegister").forward(request, response);
			}
			else if (pseudo.length()==0 || pseudo.isEmpty() ) {
				request.setAttribute("erreur", "Le pseudo n'a pas �t� renseign�, veuillez le saisir ...");
				this.getServletContext().getRequestDispatcher("/ServletRegister").forward(request, response);
			}
			else if (email.length()==0 || email.isEmpty() ) {
				request.setAttribute("erreur", "L'email n'a pas �t� renseign�, veuillez le saisir ...");
				this.getServletContext().getRequestDispatcher("/ServletRegister").forward(request, response);
			}
			else if (password.length()==0 || password.isEmpty() ) {
				request.setAttribute("erreur", "Le mot de passe n'a pas �t� renseign�, veuillez le saisir ...");
				this.getServletContext().getRequestDispatcher("/ServletRegister").forward(request, response);
			}
			else if (telephone.length()==0 || telephone.isEmpty() ) {
				request.setAttribute("erreur", "Le telephone n'a pas �t� renseign�, veuillez le saisir ...");
				this.getServletContext().getRequestDispatcher("/ServletRegister").forward(request, response);
			}
			else if (rue.length()==0 || rue.isEmpty() ) {
				request.setAttribute("erreur", "La rue n'a pas �t� renseign�, veuillez le saisir ...");
				this.getServletContext().getRequestDispatcher("/ServletRegister").forward(request, response);
			}
			else if (ville.length()==0 || ville.isEmpty() ) {
				request.setAttribute("erreur", "La ville n'a pas �t� renseign�, veuillez le saisir ...");
				this.getServletContext().getRequestDispatcher("/ServletRegister").forward(request, response);
			}
			else if (codePostal.length()==0 || codePostal.isEmpty() ) {
				request.setAttribute("erreur", "Le code postal n'a pas �t� renseign�, veuillez le saisir ...");
				this.getServletContext().getRequestDispatcher("/ServletRegister").forward(request, response);
			}
			else if (confirmation.equals(password)) {
				HttpSession session = request.getSession();
				
				Utilisateur user = new Utilisateur();
				
				user.setNom(nom);
				user.setPrenom(prenom);
				user.setPseudo(pseudo);
				user.setEmail(email);
				user.setPassword(password);
				user.setTelephone(telephone);
				user.setRue(rue);
				user.setVille(ville);
				user.setCodePostal(codePostal);
				
				session.setAttribute("RegisteredUser", user);
				
				UtilisateurManager.inscriptionUtilisateur(pseudo, nom, prenom, email, telephone, rue, codePostal, ville, password)
				
				
			}
			
		}catch (BusinessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
