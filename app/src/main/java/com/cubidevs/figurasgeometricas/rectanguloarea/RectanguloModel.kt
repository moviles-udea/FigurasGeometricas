package com.cubidevs.figurasgeometricas.rectanguloarea

class RectanguloModel:InterfazRectanguloMVP.model {

    private lateinit var presenter: InterfazRectanguloMVP.presenter

    constructor(presenter: InterfazRectanguloMVP.presenter){
        this.presenter = presenter
    }

    override fun CalcularArea(base: Int, altura: Int) {

        var resultado = base*altura
        presenter.Showresult(resultado)
    }

}