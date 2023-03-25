package fr.maxtam.miniaturecollection.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import fr.maxtam.miniaturecollection.R
import fr.maxtam.miniaturecollection.adapteur.AdapteurMiniature

class HomeFragment : Fragment(){

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view = inflater?.inflate(R.layout.fragment_maison,container,false)

        // recuperer le recycleur de vue
        val recycleurVueHorizontal = view?.findViewById<RecyclerView>(R.id.horizontal_recycler_view)
        recycleurVueHorizontal?.adapter = AdapteurMiniature()

        return view
    }

}