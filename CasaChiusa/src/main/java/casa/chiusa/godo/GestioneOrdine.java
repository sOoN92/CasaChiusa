package casa.chiusa.godo;

import java.util.ArrayList;
import java.util.List;

public class GestioneOrdine {
	
	static ServicesCrud crud = new ServicesCrud("bordello");

	
	public static List<String> listaClienti(ServicesCrud crud){
		
		List<String> lClienti = new ArrayList<>();
		lClienti = crud.jpaRead("select c.id from Cliente c").getResultList();
		
		return lClienti;
		
	}
	
public static List<Mignotta> listaMignotte(ServicesCrud crud){
		
		List<Mignotta> lMignotte = new ArrayList<>();
		lMignotte = crud.jpaRead("select m from Mignotta m").getResultList();
		
		return lMignotte;
		
	}

}
