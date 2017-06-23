package casa.chiusa.godo;

import java.util.ArrayList;
import java.util.List;

public class GestioneOrdine {
	
	static ServicesCrud crud = new ServicesCrud("bordello");

	
	public static List<String> listaClienti(ServicesCrud crud){
		
		List<Integer> lClienti = new ArrayList<>();
		List<String> parsedListClienti = new ArrayList<>();
		lClienti =  crud.jpaRead("select c.id from Cliente c").getResultList();
		
		for(Integer i : lClienti){
			String id = i.toString();
			parsedListClienti.add(id);
		}
		
		return parsedListClienti;
		
	}
	
public static List<Mignotta> listaMignotte(ServicesCrud crud){
		
		List<Mignotta> lMignotte = new ArrayList<>();
		lMignotte = crud.jpaRead("select m from Mignotta m where idCliente IS NULL").getResultList();
		
		return lMignotte;
		
	}

}
