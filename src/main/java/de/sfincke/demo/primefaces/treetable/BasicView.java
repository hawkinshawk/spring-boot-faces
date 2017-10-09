package de.sfincke.demo.primefaces.treetable;

import de.sfincke.demo.primefaces.model.Vertragshistorie;

import org.primefaces.model.TreeNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.io.Serializable;

import javax.annotation.PostConstruct;

@Component(value = "ttBasicView")
@Scope(value = "session")
public class BasicView implements Serializable {

	private TreeNode root;

	private Vertragshistorie selectedVertragshistorie;

	@Autowired
	private VertragshistorieTreeService service;

	@PostConstruct
	public void init() {
		root = service.createVertragshistorie();
	}

	public TreeNode getRoot() {
		return root;
	}

	public void setService(VertragshistorieTreeService service) {
		this.service = service;
	}

	public Vertragshistorie getSelectedVertragshistorie() {
		return selectedVertragshistorie;
	}

	public void setSelectedVertragshistorie(Vertragshistorie selectedVertragshistorie) {
		this.selectedVertragshistorie = selectedVertragshistorie;
	}
}
