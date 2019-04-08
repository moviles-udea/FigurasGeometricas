package com.cubidevs.figurasgeometricas.rectanguloarea

class RectanguloPresenter: InterfazRectanguloMVP.presenter {

    private lateinit var view: InterfazRectanguloMVP.view
    private lateinit var model: InterfazRectanguloMVP.model

    constructor(view: InterfazRectanguloMVP.view){
        this.view = view
        model = RectanguloModel(this)
    }

    override fun CalcularClicked() {

        var base = view.getBase()
        var altura = view.getAltura()

        if (base.equals("")){
            view.ShowErrorBase()

        }else if (altura.equals("")){
            view.ShowErrorAltura()

        }else
            model.CalcularArea(base,altura)

    }

    override fun Showresult(resultado: Int) {
        view.ShowResult(resultado)
    }

}