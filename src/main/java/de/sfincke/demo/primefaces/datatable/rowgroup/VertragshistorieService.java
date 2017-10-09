package de.sfincke.demo.primefaces.datatable.rowgroup;

import de.sfincke.demo.primefaces.model.Vertragshistorie;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class VertragshistorieService {

	public List<Vertragshistorie> createVertragshistories() {
		List<Vertragshistorie> vertragshistories = new ArrayList<Vertragshistorie>();
		vertragshistories.add(
				new Vertragshistorie("Vertragsstatus", "Antrag", "Vertrag", "Policierung",
						"hgroenemeyer", "25.09.2017 13:43:16","1"));
		vertragshistories.add(
				new Vertragshistorie("Beitrag brutto", "53,00", "58,00", "Bestandsaktualisierung",
						"akruse", "01.10.2017 10:45:20","2"));
		vertragshistories.add(
				new Vertragshistorie("Beitrag netto", "46,00", "50,00", "Bestandsaktualisierung",
						"akruse",
						"01.10.2017 10:45:20","2"));
		return vertragshistories;
	}
}
