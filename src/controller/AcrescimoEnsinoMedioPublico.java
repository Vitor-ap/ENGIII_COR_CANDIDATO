package controller;

import model.Candidato;

public class AcrescimoEnsinoMedioPublico implements IAcrescimo {

	@Override
	public int calculaAcrescimo(Candidato c) {
		int acrescimoTotal = 0;
		if(c.isEnsinoMedioPublico() == true) {
			acrescimoTotal = acrescimoTotal + 5;
		}
		return c.getPontosProva() + acrescimoTotal;
	}

	@Override
	public void proximoAcrescimo(Candidato c) {
		c.setPontosProva(calculaAcrescimo(c));
		
		AcrescimoPorEnsinoSup aEnsSup = new AcrescimoPorEnsinoSup();
		aEnsSup.proximoAcrescimo(c);
		
	}

}
