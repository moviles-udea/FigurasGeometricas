package com.cubidevs.figurasgeometricas.Rombo

class RomboPresenter : IRombo.presenter {
    private lateinit var view: IRombo.view

    private lateinit var model: IRombo.model

    constructor(view: IRombo.view): this(){
        this.view = view
        model = RomboModel(this)
    }

    constructor()

    override fun setCalculate(resultArea: Float){
        view.setCalculate(resultArea.toString())
    }
    override fun clickedBCalcularAreaRombo() {
        val lado = view.getLado()

        if(!lado.isEmpty())
            model.calculateArea(lado.toFloat())
        else
            view.showEmptyParam()    }
}
