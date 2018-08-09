package servicos;

public class BrasilInteresseServico implements InteresseServico {

	private double dTaxaInteressada;

	public BrasilInteresseServico(double dTaxaInteressada) {
		this.dTaxaInteressada = dTaxaInteressada;
	}

	@Override
	public double getdTaxaInteressada() {
		return dTaxaInteressada;

	}
}
