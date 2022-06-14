package controller;

import model.Candidato;

public class AcrescimoPorEnsinoSup implements IAcrescimo {

	@Override
	public int calculaAcrescimo(Candidato c) {
		int acrescimoTotal = 0;
		if (c.isEnsinoSuperiorCompleto() == true) {
			acrescimoTotal = acrescimoTotal + 10;
		}
		return c.getPontosProva() + acrescimoTotal;
	}

	@Override
	public void proximoAcrescimo(Candidato c) {
		c.setPontosProva(calculaAcrescimo(c));
		
		AcrescimoRegistro aRegistro = new AcrescimoRegistro();
		aRegistro.proximoAcrescimo(c);
		
	}

}
