package de.sfincke.demo.primefaces.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Vertragshistorie implements Serializable, Comparable<Vertragshistorie> {

    private String datenfeld;

	private String alterWert;

	private String neuerWert;

	private String aenderungsgrund;

	private String benutzer;

	private String aenderungsdatum;

	private String fieldsInRevision;

	public int compareTo(Vertragshistorie vertragshistorie) {
		return this.getDatenfeld().compareTo(vertragshistorie.getDatenfeld());
	}
}
