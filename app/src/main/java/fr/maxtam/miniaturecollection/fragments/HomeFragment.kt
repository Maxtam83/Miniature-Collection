package fr.maxtam.miniaturecollection.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import fr.maxtam.miniaturecollection.R
import fr.maxtam.miniaturecollection.adapteur.AdapteurMiniature
import fr.maxtam.miniaturecollection.adapteur.MiniatureObjetDecoration

class HomeFragment : Fragment(){

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view = inflater?.inflate(R.layout.fragment_maison,container,false)

        // recuperer le recycleur de vue
        val recycleurVueHorizontal = view?.findViewById<RecyclerView>(R.id.horizontal_recycler_view)
        recycleurVueHorizontal?.adapter = AdapteurMiniature(R.layout.objet_horizontale_miniature)

        // recuperer le second recycleur de vue
        val recycleurVueVertical = view?.findViewById<RecyclerView>(R.id.vertical_recycler_view)
        recycleurVueVertical?.adapter = AdapteurMiniature(R.layout.objet_vertical_miniature)
        recycleurVueVertical?.addItemDecoration(MiniatureObjetDecoration())

        return view
    }

}