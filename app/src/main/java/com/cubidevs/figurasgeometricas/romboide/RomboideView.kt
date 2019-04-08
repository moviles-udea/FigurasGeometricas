package com.cubidevs.figurasgeometricas.romboide


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast

import com.cubidevs.figurasgeometricas.R
import kotlinx.android.synthetic.main.fragment_romboide_view.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class RomboideView : Fragment(), IRomboide.view {


    private lateinit var presenter: IRomboide.presenter


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_romboide_view, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        presenter = RomboidePresenter(this)

        buttonCalculate.setOnClickListener {
            presenter.clickedButtonCalculate()
        }



    }

    override fun getB(): String = eLadoB.text.toString()
    override fun getH(): String = eAltura.text.toString()

    override fun showEmptyParam() {
        Toast.makeText(context, "Falta base (b) y altura (h)", Toast.LENGTH_LONG).show()
    }

    override fun setCalculate(resultArea: String) {
        Toast.makeText(context, "El área es: "+resultArea+"cm^2", Toast.LENGTH_LONG).show()
        eLadoB.clearComposingText()
        eAltura.clearComposingText()

    }

}
