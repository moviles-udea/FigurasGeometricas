package com.cubidevs.figurasgeometricas.area_triangulo

class AreaTrianguloModel:IAreaTrianguloMVP.model {


    //---------------------------------------------
    //interfaz
    private lateinit var presenter: IAreaTrianguloMVP.presenter

    constructor(presenter: IAreaTrianguloMVP.presenter) {
        this.presenter = presenter
    }

    override fun calcularDatos(base_triangulo: String, altura_triangulo: String) {

        var base=base_triangulo.toString().toDouble()
        var altura=altura_triangulo.toString().toDouble()

        var area_triangulo:Double=0.0



        area_triangulo=(base*altura)/2

        if(!area_triangulo.equals(0.0)){

            presenter.resultadoDatos(area_triangulo)
            presenter.exito()

        }



    }
}
