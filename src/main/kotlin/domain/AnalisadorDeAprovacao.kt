package domain

import domain.criterios.CriterioDeAprovacao
import domain.Boletim
import domain.BoletimFechado

class AnalisadorDeAprovacao {
	private lateinit var criterioDoAnalisador: CriterioDeAprovacao

	fun defineCriterio(criterio: CriterioDeAprovacao) {
		this.criterioDoAnalisador = criterio
	}

	fun fechaBoletim(boletim: Boletim): BoletimFechado {
		var boletimFechado = BoletimFechado(
			boletim.mediaEPs,
			boletim.mediaMiniEPs,
			this.criterioDoAnalisador.mediaFinal(boletim),
			this.criterioDoAnalisador.estaAprovado(boletim)
		)
		return boletimFechado
	}
}
