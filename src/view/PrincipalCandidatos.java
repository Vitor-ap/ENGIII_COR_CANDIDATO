package view;

import controller.AcrescimoEnsinoMedioPublico;
import model.Candidato;

public class PrincipalCandidatos {

	
	public static void main(String[] args) {
		Candidato c = new Candidato();
		c.setId(1);
		c.setNome("Vitor Alves");
		c.setEnsinoMedioPublico(true);
		c.setEnsinoSuperiorCompleto(false);
		c.setAnosRegistroEntidadeClasse(5);
		c.setAnosExperiencia(2);
		c.setPontosProva(70);

		
		AcrescimoEnsinoMedioPublico aEM = new AcrescimoEnsinoMedioPublico();
		aEM.proximoAcrescimo(c);
		
		System.out.println(c);
}
}
