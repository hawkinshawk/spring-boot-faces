package de.sfincke.demo.primefaces.datatable.rowExpansion;

import de.sfincke.demo.primefaces.model.VertragshistorieRevision;

import lombok.Getter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;

@Component
@Scope(value = "session")
public class RowExpansionView implements Serializable {

	@Getter
	private List<VertragshistorieRevision> revisions;

	@Autowired
	private VertragshistorieRevisionService service;

	@PostConstruct
	public void init() {
		revisions = service.createRevisions();
	}
}
