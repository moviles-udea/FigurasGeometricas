package com.cubidevs.figurasgeometricas.area_triangulo


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast

import com.cubidevs.figurasgeometricas.R
import kotlinx.android.synthetic.main.fragment_area_triangulo.*
import kotlinx.android.synthetic.main.fragment_area_triangulo.view.*


/**
 * A simple [Fragment] subclass.
 *
 */
class AreaTrianguloFragment : Fragment() ,IAreaTrianguloMVP.view{


    //--------------------------------
    //interfaz
    private lateinit var presenter: IAreaTrianguloMVP.presenter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        val view:View = inflater.inflate(R.layout.fragment_area_triangulo, container, false)

        presenter=AreaTrianguloPresenter(this)


        //Boton
        view.bCalcular.setOnClickListener {

            presenter.CalcularClicked()
        }

        return view
    }

    //----------------------------------------------------------------

    override fun getBase(): String =eBase.text.toString()

    //----------------------------------------------------------------
    override fun getAltura(): String=eAltura.text.toString()

    //----------------------------------------------------------------

    override fun error(error: String) {

        Toast.makeText(context,error,Toast.LENGTH_LONG).show()
    }

    //-----------------------------------------------------------------


    override fun resultadoDatos(area_triangulo: Double) {

            tResultado.text=area_triangulo.toString()

    }

    //------------------------------------------------------------------

    override fun exito() {

        eBase.text.toString().equals("")
        eAltura.text.toString().equals("")
    }

}

