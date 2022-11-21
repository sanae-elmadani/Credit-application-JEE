package web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.CreditMetierImplementatio;
import metier.ICredietMetier;

@WebServlet(name="cs",urlPatterns = {"/controleur",".do"})
public class ControleurServelet extends HttpServlet {
	
	private ICredietMetier metier ;
	

	@Override
	public void init() throws ServletException {
		metier =new CreditMetierImplementatio();	
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	    req.setAttribute("creditModel",new creditModel() );
		req.getRequestDispatcher("NewFile.jsp").forward(req, resp);
	}
	//databinding:relation entre le model et vue
    /* 
     *lire les donnees de la requet 
     *valider les donees 
     *stocker les donnees dans le model
     *faire appel ala cauche metier  pour les traitements 
     *stocker le resultat dans le model 
     * */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		double montant =Double.parseDouble(req.getParameter("montant"));
		double taux =Double.parseDouble(req.getParameter("taux"));
		int  duree=Integer.parseInt(req.getParameter("duree"));
		creditModel model=new creditModel();
		model.setCapital(montant);
		model.setDuree(duree);
		model.setTaux(taux);
		double r=metier.calculerMesualiteCredit(montant, taux, duree);
		model.setMesualite(r);
		//stocker le model dans objet req
		req.setAttribute("creditModel", model);
		req.getRequestDispatcher("NewFile.jsp").forward(req, resp);
		
		
	}
	
}
