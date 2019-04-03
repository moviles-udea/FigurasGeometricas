package com.cubidevs.figurasgeometricas.area_triangulo

class AreaTrianguloPresenter:IAreaTrianguloMVP.presenter {


    //-------------------------------------------------------------------
    //interfaz
    private lateinit var view: IAreaTrianguloMVP.view
    private lateinit var model: IAreaTrianguloMVP.model


    constructor(view: IAreaTrianguloMVP.view) {

        this.view = view
        model=AreaTrianguloModel(this)
    }

    //-------------------------------------------------------------------

    override fun CalcularClicked() {


        var base_triangulo=view.getBase()
        var altura_triangulo=view.getAltura()

        if(base_triangulo.isEmpty() && altura_triangulo.isEmpty()){

            var error="Digite todos los campos"
            view.error(error)

        }else if(altura_triangulo.isEmpty()){

            var error="Digite la base"
            view.error(error)

        }else if(base_triangulo.isEmpty()) {

            var error="Digite la altura"
            view.error(error)

        }else    {

            model.calcularDatos(base_triangulo,altura_triangulo)

        }

    }

    //-----------------------------------------------------------------------------------

    override fun resultadoDatos(area_triangulo: Double) {

    view.resultadoDatos(area_triangulo)

    }

    //---------------------------------------------------------------------------------
    override fun exito() {

        view.exito()

    }



}
