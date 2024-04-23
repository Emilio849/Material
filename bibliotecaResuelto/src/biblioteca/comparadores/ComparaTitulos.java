package biblioteca.comparadores;

import java.util.Comparator;

import biblioteca.material.MaterialBibliografico;

public class ComparaTitulos implements Comparator<MaterialBibliografico> {

	@Override
	public int compare(MaterialBibliografico o1, MaterialBibliografico o2) {
		return o1.getTitulo().compareTo(o2.getTitulo());
	}

}
