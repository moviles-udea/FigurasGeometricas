package com.cubidevs.figurasgeometricas.romboide

import androidx.annotation.IntegerRes

class RomboidePresenter(): IRomboide.presenter {


    private lateinit var view: IRomboide.view
    private lateinit var model: IRomboide.model

    constructor(view: IRomboide.view):this(){
        this.view = view
        model = RomboideModel(this)
    }

    override fun clickedButtonCalculate() {

        var b = view.getB()
        var h = view.getH()


        if( b.equals("") || h.equals("")){
            view.showEmptyParam()
        }else{
            model.calculateArea(b.toFloat(), h.toFloat())
        }

    }

    override fun setCalculate(resultArea: Float) {
        view.setCalculate(resultArea.toString())
    }

}