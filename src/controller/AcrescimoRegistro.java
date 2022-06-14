package controller;

import model.Candidato;

public class AcrescimoRegistro implements IAcrescimo{

	@Override
	public int calculaAcrescimo(Candidato c) {
		int acrescimoTotal = 0;
		if (c.getAnosRegistroEntidadeClasse() > 0) {
		acrescimoTotal = c.getAnosRegistroEntidadeClasse();
		}
		return c.getPontosProva() + acrescimoTotal;
		
	}

	@Override
	public void proximoAcrescimo(Candidato c) {
		c.setPontosProva(calculaAcrescimo(c));
		
		AcrescimoExperiencia aExp = new AcrescimoExperiencia();
		aExp.proximoAcrescimo(c);
		
	}

}
