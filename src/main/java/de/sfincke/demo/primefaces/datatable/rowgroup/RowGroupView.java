package de.sfincke.demo.primefaces.datatable.rowgroup;

import de.sfincke.demo.primefaces.model.Vertragshistorie;

import lombok.Getter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;

@Component
@Scope(value = "session")
public class RowGroupView implements Serializable {

	@Getter
	private List<Vertragshistorie> vertragshistories;

	@Autowired
	private VertragshistorieService service;

	@PostConstruct
	public void init() {
		vertragshistories = service.createVertragshistories();
	}
}
