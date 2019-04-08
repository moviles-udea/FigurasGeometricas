package com.cubidevs.figurasgeometricas.Rombo

class RomboModel : IRombo.model {

    private var presenter: IRombo.presenter

    constructor(presenter: IRombo.presenter){
        this.presenter = presenter
    }
    override fun calculateArea(lado: Float){
        presenter.setCalculate(lado)
    }



}