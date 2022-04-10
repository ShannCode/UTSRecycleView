package com.example.utsrecycleview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BukuAdapter(private val context: Context, private val buku:List<Buku>, val listener: (Buku) -> Unit)
    : RecyclerView.Adapter<BukuAdapter.BukuViewHolder>(){

    class BukuViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val imgBuku = view.findViewById<ImageView>(R.id.img_item_photo)
        val nameBuku = view.findViewById<TextView>(R.id.tv_item_name)
        val descBuku = view.findViewById<TextView>(R.id.tv_item_description)

        fun bindView(buku: Buku, listener: (Buku) -> Unit){
            imgBuku.setImageResource(buku.imgBuku)
            nameBuku.text = buku.nameBuku
            descBuku.text = buku.descBuku
            itemView.setOnClickListener {
                listener(buku)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BukuViewHolder {
        return BukuViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_buku, parent, false)
        )
    }

    override fun onBindViewHolder(holder: BukuViewHolder, position: Int) {
        holder.bindView(buku[position], listener)
    }

    override fun getItemCount(): Int = buku.size
    }
