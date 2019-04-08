package com.cubidevs.figurasgeometricas.Rombo

import android.widget.Toast

interface IRombo {

    interface view{

        fun getLado(): String
        fun showEmptyParam()
        fun setCalculate(resultArea: String)
    }
    interface presenter{
        fun clickedBCalcularAreaRombo()
        fun setCalculate(resultArea: Float)
    }

    interface model{
        fun calculateArea(lado: Float) {

        }

    }
}