package com.cubidevs.figurasgeometricas.romboide

interface IRomboide {

    interface view{
        fun getB(): String
        fun getH(): String
        fun showEmptyParam()
        fun setCalculate(resultArea: String)
    }

    interface presenter{
        fun clickedButtonCalculate()
        fun setCalculate(resultArea: Float)

    }

    interface model{
        fun calculateArea(base: Float, altura: Float)

    }
}