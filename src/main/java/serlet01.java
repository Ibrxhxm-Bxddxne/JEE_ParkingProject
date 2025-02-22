

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import projet0001.Parking;

import java.io.IOException;

/**
 * Servlet implementation class serlet01
 */
@WebServlet("/calculer")
public class serlet01 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public serlet01() {
        super();
        // TODO Auto-generated constructor stub
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			int duree = Integer.parseInt(request.getParameter("duree"));
            String periode = request.getParameter("periode");
            double taux = Double.parseDouble(request.getParameter("taux"));

            // Calcul du montant
            Parking parking = new Parking(duree, periode, taux);
            double montant = parking.calculerMontant();

            // Stocker les données pour affichage
            request.setAttribute("duree", duree);
            request.setAttribute("periode", periode);
            request.setAttribute("taux", taux);
            request.setAttribute("montant", montant);

        } catch (Exception e) {
            request.setAttribute("erreur", "Veuillez entrer des valeurs valides.");
        }
		// Rediriger vers la même JSP
		this.getServletContext().getRequestDispatcher("/WEB-INF/page.jsp").forward(request, response);
        
    }
	@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

		
	}


