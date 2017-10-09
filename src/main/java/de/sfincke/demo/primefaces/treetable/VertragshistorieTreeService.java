package de.sfincke.demo.primefaces.treetable;

import de.sfincke.demo.primefaces.model.Vertragshistorie;

import org.primefaces.model.DefaultTreeNode;
import org.primefaces.model.TreeNode;
import org.springframework.stereotype.Component;

@Component
public class VertragshistorieTreeService {

	public TreeNode createVertragshistorie() {
		TreeNode root = new DefaultTreeNode(new Vertragshistorie(), null);

		TreeNode rev1 = new DefaultTreeNode(
				new Vertragshistorie("2", "-", "-", "Bestandsaktualisierung", "akruse", "01.10.2017 10:45:20", "2"), root);
		TreeNode field = new DefaultTreeNode(
				new Vertragshistorie("Vertragsstatus", "Antrag", "Vertrag", "Policierung", "hgroenemeyer",
						"25.09.2017 13:43:16","1"), root);

		TreeNode field1rev1 = new DefaultTreeNode(
				new Vertragshistorie("Beitrag brutto", "53,00", "58,00", "Bestandsaktualisierung",
						"akruse", "01.10.2017 10:45:20", "2"), rev1);
		TreeNode field2rev1 = new DefaultTreeNode(
				new Vertragshistorie("Beitrag netto", "46,00", "50,00", "Bestandsaktualisierung", "akruse",
						"01.10.2017 10:45:20","2"), rev1);

		return root;
	}
}
