package de.sfincke.demo.primefaces.datatable.rowExpansion;

import de.sfincke.demo.primefaces.model.VertragshistorieField;
import de.sfincke.demo.primefaces.model.VertragshistorieRevision;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class VertragshistorieRevisionService {

	public List<VertragshistorieRevision> createRevisions() {
		List<VertragshistorieRevision> vertragshistories =
				new ArrayList<VertragshistorieRevision>();
		vertragshistories
				.add(VertragshistorieRevision.builder()
						.aenderungsdatum("25.09.2017 13:43:16")
						.aenderungsgrund("Policierung")
						.benutzer("hgroenemeyer")
						.field(VertragshistorieField.builder()
								.datenfeld("Vertragsstatus")
								.alterWert("Antrag")
								.neuerWert("Vertrag")
								.build())
						.build());

		vertragshistories
				.add(VertragshistorieRevision.builder()
						.aenderungsdatum("01.10.2017 10:45:20")
						.aenderungsgrund("Bestandsaktualisierung")
						.benutzer("akruse")
						.field(VertragshistorieField.builder()
								.datenfeld("Beitrag brutto")
								.alterWert("53,00")
								.neuerWert("58,00")
								.build())
						.field(VertragshistorieField.builder()
								.datenfeld("Beitrag netto")
								.alterWert("46,00")
								.neuerWert("50,00")
								.build())
						.build());

		return vertragshistories;
	}
}
