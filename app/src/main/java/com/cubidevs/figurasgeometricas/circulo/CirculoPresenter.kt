package com.cubidevs.figurasgeometricas.circulo

class CirculoPresenter: ICirculoMVP.PresenterView, ICirculoMVP.PresenterModel{

    var view: ICirculoMVP.View
    var model: ICirculoMVP.Model

    constructor(view:ICirculoMVP.View){
        this.view=view
        model = CirculoModel(this)
    }

    override fun buttonCalcularClicked() {
        var radio=view.getRadio()
        if (radio.equals("")){
            view.ingresarRadio()
        }else {
            model.calcularArea(radio)
        }
    }

    override fun areaValor(area: Double) {
        view.areaValor(area)

    }

}