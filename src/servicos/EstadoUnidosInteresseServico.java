package servicos;

public class EstadoUnidosInteresseServico implements InteresseServico {

	private double dTaxaInteressada;

	public EstadoUnidosInteresseServico(double dTaxaInteressada) {
		super();
		this.dTaxaInteressada = dTaxaInteressada;
	}

	 @Override
	public double getdTaxaInteressada() {
		return dTaxaInteressada;
	}
}
