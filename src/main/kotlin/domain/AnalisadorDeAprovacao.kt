package domain

import domain.criterios.CriterioDeAprovacao

class AnalisadorDeAprovacao {
	private lateinit var criterioDoAnalisador: CriterioDeAprovacao

	fun defineCriterio(criterio: CriterioDeAprovacao) {
		this.criterioDoAnalisador = criterio
	}
}
