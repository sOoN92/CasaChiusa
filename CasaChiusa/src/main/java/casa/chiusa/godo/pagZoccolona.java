package casa.chiusa.godo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class pagZoccolona extends HttpServlet {

	ServicesCrud crud = new ServicesCrud("bordello");
	GestioneOrdine gest = new GestioneOrdine();
	

	List<Mignotta> listaMignotte= new ArrayList<Mignotta>();
	public List<String> poplamentoLista(List<Mignotta> lista){
		List<String> listaNomiMignotte = new ArrayList<>();
		listaMignotte = gest.listaMignotte(crud);
		for (Mignotta mignotta : listaMignotte) {
			listaNomiMignotte.add(mignotta.getNomeCompleto()); 
		}
		return listaNomiMignotte;
		
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<String> listaNomiMignotte = poplamentoLista(listaMignotte);
		req.setAttribute("listaNomiMignotte", listaNomiMignotte);
		RequestDispatcher disp = req.getRequestDispatcher("/sceltaZoccolona.jsp");
		disp.forward(req, resp);
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//		String id= req.getParameter("id");
//		int idClienti = Integer.parseInt(id);
//		req.setAttribute("idCliente", id);
//		RequestDispatcher disp = req.getRequestDispatcher("/sceltaZoccolona.jsp");
//		disp.forward(req, resp);
		
	
	}
	
}
