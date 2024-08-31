package com.universae.webdam.superheroapp

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import com.universae.webdam.databinding.ItemSuperheroBinding

class SuperheroViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private val binding = ItemSuperheroBinding.bind(view)

    fun bind(
        superHeroItemResponse: SuperHeroItemResponse,
        onItemSelected: (String) -> Unit
    ) {
        binding.tvSuperheroName.text = superHeroItemResponse.name
        binding.ivSuperhero
        Picasso.get().load(superHeroItemResponse.superheroImage.url).into(binding.ivSuperhero)
        binding.root.setOnClickListener { onItemSelected(superHeroItemResponse.superheroId) }
    }
}