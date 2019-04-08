package com.cubidevs.figurasgeometricas.romboide

class RomboideModel:IRomboide.model {


    private lateinit var presenter: IRomboide.presenter

    constructor(presenter: IRomboide.presenter){
        this.presenter = presenter
    }

    override fun calculateArea(base: Float, altura: Float) {
        presenter.setCalculate(base*altura)
    }
}