package com.cubidevs.figurasgeometricas.main

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.cubidevs.figurasgeometricas.R
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.app_bar_main.*

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    private lateinit var fragment: Fragment
    private lateinit var fragmentManager: FragmentManager
    private lateinit var fragmentTransaction: FragmentTransaction

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        fragmentManager  = supportFragmentManager
        fragmentTransaction = fragmentManager.beginTransaction()

      /*  fragment = CirculoFragment()
        fragmentTransaction.add(R.id.frameLayout, fragment).commit()*/

        val toggle = ActionBarDrawerToggle(
            this, drawer_layout, toolbar,
            R.string.navigation_drawer_open,
            R.string.navigation_drawer_close
        )
        drawer_layout.addDrawerListener(toggle)
        toggle.syncState()

        nav_view.setNavigationItemSelectedListener(this)
    }

    override fun onBackPressed() {
        if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
            drawer_layout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        // Handle navigation view item clicks here.
        fragmentTransaction = fragmentManager.beginTransaction()
        when (item.itemId) {
            R.id.nav_circulo -> {
         //       fragment = CirculoFragment()
            }
            R.id.nav_cuadro -> {
                // fragment = CuadroFragment()
            }
            R.id.nav_rectangulo -> {
                // fragment = RectanguloFragment()
            }
            R.id.nav_triangulo -> {
                // fragment = TrianguloFragment()
            }
            R.id.nav_rombo -> {
                // fragment = RomboFragment()
            }
            R.id.nav_trapecio -> {
                // fragment = TrapecioFragment()
            }
            R.id.nav_romboide -> {
                // fragment = RomboideFragment()
            }
            R.id.nav_paralelogramo -> {
                // fragment = ParalelogramoFragment()
            }
        //    fragmentTransaction.replace(R.id.frameLayout, fragment).commit()
        }
        drawer_layout.closeDrawer(GravityCompat.START)
        return true
    }
}
