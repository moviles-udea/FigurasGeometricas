package com.cubidevs.figurasgeometricas.circulo

class CirculoModel : ICirculoMVP.Model {

    private var presenter: ICirculoMVP.PresenterModel

    constructor(presenter: ICirculoMVP.PresenterModel) {
        this.presenter = presenter
    }

    override fun calcularArea(radio: String) {
        val area: Double
        val radioInt = radio.toDouble()
        area = Math.PI * Math.pow(radioInt, 2.0)
        presenter.areaValor(area)
    }
}