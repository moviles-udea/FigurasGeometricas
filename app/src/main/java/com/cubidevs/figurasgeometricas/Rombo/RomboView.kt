package com.cubidevs.figurasgeometricas.Rombo


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast

import com.cubidevs.figurasgeometricas.R
import com.cubidevs.figurasgeometricas.romboide.RomboidePresenter
import kotlinx.android.synthetic.main.fragment_rombo_view.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class RomboView : Fragment(), IRombo.view {
    private lateinit var presenter: IRombo.presenter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_rombo_view, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        presenter = RomboPresenter(this)

        bCalcularAreaRombo.setOnClickListener{
            presenter.clickedBCalcularAreaRombo()
        }


    }

    override fun getLado() : String = eLadoRombo.text.toString()

    override fun showEmptyParam() {
        Toast.makeText(context,"Digite el lado del rombo", Toast.LENGTH_SHORT).show()

    }


    override fun setCalculate(resultArea: String){
        Toast.makeText(context,"El area es: $resultArea cm2",Toast.LENGTH_LONG).show()
        eLadoRombo.clearComposingText()
    }


}
