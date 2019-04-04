package com.cubidevs.figurasgeometricas.rectanguloarea

interface InterfazRectanguloMVP {

    interface view{
        fun getBase():Int
        fun getAltura():Int
        fun ShowErrorBase()
        fun ShowErrorAltura()
        fun ShowResult(resultado: Int)
        fun CleanWidgets()
    }

    interface presenter{
        fun CalcularClicked()
        fun Showresult(resultado: Int)
    }

    interface model {
        fun CalcularArea(base:Int, altura:Int)
    }
}