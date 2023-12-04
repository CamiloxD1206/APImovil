package com.example.myapi

import android.view.View

import androidx.recyclerview.widget.RecyclerView
import com.example.myapi.databinding.ItemDogBinding

class DogViewHolder(view: View):RecyclerView.ViewHolder(view) {
    private val binding=ItemDogBinding.bind(view)
    fun bind(image:String){
binding.ivDog
    }
}