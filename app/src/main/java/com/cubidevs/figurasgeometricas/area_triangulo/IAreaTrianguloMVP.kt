package com.cubidevs.figurasgeometricas.area_triangulo

interface IAreaTrianguloMVP {

    //----------------------------------------------------------

    interface view {

        fun getBase(): String
        fun getAltura(): String
        fun error(error: String)
        fun resultadoDatos(area_triangulo: Double)
        fun exito()


    }

    //---------------------------------------------------------

    interface presenter {

        fun CalcularClicked()
        fun resultadoDatos(area_triangulo: Double)
        fun exito()

    }

    //----------------------------------------------------------

    interface model {

        fun calcularDatos(base_triangulo: String, altura_triangulo: String)

    }

    //----------------------------------------------------------
}
