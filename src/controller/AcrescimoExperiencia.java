package controller;

import model.Candidato;

public class AcrescimoExperiencia implements IAcrescimo{

	@Override
	public int calculaAcrescimo(Candidato c) {
		int acrescimoTotal = 0;
		if (c.getAnosExperiencia() > 0) {
		acrescimoTotal = c.getAnosExperiencia() * 2;
		}
		return c.getPontosProva() + acrescimoTotal;
	}

	@Override
	public void proximoAcrescimo(Candidato c) {
		c.setPontosProva(calculaAcrescimo(c));
	}

}
