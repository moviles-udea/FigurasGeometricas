package com.cubidevs.figurasgeometricas.circulo


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.cubidevs.figurasgeometricas.R
import kotlinx.android.synthetic.main.fragment_circulo.*
import kotlinx.android.synthetic.main.fragment_circulo.view.*


class CirculoFragment : Fragment(), ICirculoMVP.View {

    private lateinit var presenter: ICirculoMVP.PresenterView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_circulo, container, false)
        presenter = CirculoPresenter(this)

        view.btnCalcular.setOnClickListener {
            presenter.buttonCalcularClicked()
        }
        return view
    }

    override fun getRadio(): String {
        return view!!.edtRadio.text.toString()
    }

    override fun ingresarRadio() {
        Toast.makeText(context, R.string.mensajeNoRadio, Toast.LENGTH_SHORT).show()
    }

    override fun areaValor(area: Double) {
        txtArea.visibility = View.VISIBLE
        txtArea.text = area.toString()
    }


}
