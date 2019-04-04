package com.cubidevs.figurasgeometricas.rectanguloarea

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.cubidevs.figurasgeometricas.R
import kotlinx.android.synthetic.main.fragment_rectangulo.*

class RectanguloFragment : Fragment(),InterfazRectanguloMVP.view {

    private lateinit var presenter: InterfazRectanguloMVP.presenter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        presenter = RectanguloPresenter(this)

        bCalcular.setOnClickListener(){
            presenter.CalcularClicked()
        }
        return inflater.inflate(R.layout.fragment_rectangulo, container, false)
    }

    override fun getBase(): Int {
        return eBase.text.toString().toInt()
    }

    override fun getAltura(): Int {
        return eAltura.text.toString().toInt()
    }

    override fun ShowErrorBase() {
        eBase.error = "Digite el campo de la base"
    }

    override fun ShowErrorAltura() {
        eAltura.error = "Digite el campo de la altura"
    }

    override fun ShowResult(resultado: Int) {
        tResultado.setText(resultado)
    }

    override fun CleanWidgets() {
        eBase.setText("")
        eAltura.setText("")
        tResultado.setText("")
    }


}

