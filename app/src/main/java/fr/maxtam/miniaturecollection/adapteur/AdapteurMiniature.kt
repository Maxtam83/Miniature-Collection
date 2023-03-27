package fr.maxtam.miniaturecollection.adapteur

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import fr.maxtam.miniaturecollection.R


class AdapteurMiniature(private val layoutId: Int) : RecyclerView.Adapter<AdapteurMiniature.ViewHolder>(){

    // boite pour ranger tout les composants à controler
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val MiniatureImage = view.findViewById<ImageView>(R.id.imageObjet)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater
            .from(parent.context)
            .inflate(layoutId, parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return 8
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) { }

}