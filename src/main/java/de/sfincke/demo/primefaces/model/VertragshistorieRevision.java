package de.sfincke.demo.primefaces.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Singular;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class VertragshistorieRevision implements Serializable {

	private String aenderungsgrund;

	private String benutzer;

	private String aenderungsdatum;

	@Singular
	private List<VertragshistorieField> fields;
}
