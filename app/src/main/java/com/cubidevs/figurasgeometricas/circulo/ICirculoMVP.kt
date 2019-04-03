package com.cubidevs.figurasgeometricas.circulo

interface ICirculoMVP {
    interface View {
        fun getRadio(): String
        fun ingresarRadio()
        fun areaValor(area: Double)
    }

    interface PresenterView {
        fun buttonCalcularClicked()
    }

    interface PresenterModel {
        fun areaValor(area: Double)
    }

    interface Model {
        fun calcularArea(radio: String)
    }
}