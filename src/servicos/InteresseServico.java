package servicos;

import java.security.InvalidParameterException;

public interface InteresseServico {
	
	double getdTaxaInteressada();
//	double dPagamento(double dQuantia, int iMeses);
	

	default double dPagamento(double dQuantia, int iMeses) {
		if (iMeses < 1) {
			throw new InvalidParameterException("Meses não pode ser 0");
		}
		return dQuantia * Math.pow(1.0 + getdTaxaInteressada() / 100.0, iMeses);
		
	}
}
