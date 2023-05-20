package com.example.pertemuanketujuh

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class List_MahasiswaAdapter (private val context: Context, private val dataList: List<list_wisatavariabel>, val listener: (list_wisatavariabel) -> Unit) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view =
            LayoutInflater.from(context).inflate(R.layout.list_item, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val myHolder = holder as MyViewHolder
        myHolder.bindView(dataList[position], listener)
    }
    inner class MyViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {
        val cardView =
            itemView.findViewById<CardView>(R.id.cardView)
        val fotoitm =
            itemView.findViewById<ImageView>(R.id.img_item_photo)
        val namaitm =
            itemView.findViewById<TextView>(R.id.judul_item)
        val kategoriitm =
            itemView.findViewById<TextView>(R.id.kategori_item)
        val merkitm =
            itemView.findViewById<TextView>(R.id.merk_item)
        val hargaitm =
            itemView.findViewById<TextView>(R.id.harga_item)
        fun bindView(mhs: list_wisatavariabel, listener: (list_wisatavariabel) -> Unit) {
            cardView.setOnClickListener {
                listener(mhs)
                val intent = Intent(context, Detail::class.java)
                intent.putExtra("nama_itm", mhs.namaitm)
                intent.putExtra("kategori_itm", mhs.kategoriitm)
                intent.putExtra("merk_itm", mhs.merkitm)
                intent.putExtra("harga_itm",mhs.hargawitm)
                context.startActivity(intent)
            }

            fotoitm.setImageResource(mhs.fotoitm)
            namaitm.text = mhs.namaitm
            kategoriitm.text = mhs.kategoriitm
            merkitm.text = mhs.merkitm
            hargaitm.text = mhs.hargawitm
        }
    }

}