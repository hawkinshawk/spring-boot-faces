package de.sfincke.demo.primefaces.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class VertragshistorieField implements Serializable {

	private String datenfeld;

	private String alterWert;

	private String neuerWert;
}
