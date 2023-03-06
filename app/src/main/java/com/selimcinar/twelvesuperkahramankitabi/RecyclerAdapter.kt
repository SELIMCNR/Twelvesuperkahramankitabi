package com.selimcinar.twelvesuperkahramankitabi

import android.content.Intent
import android.graphics.Bitmap
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler
import kotlinx.android.synthetic.main.recycler_row.view.*

class RecyclerAdapter(val kahramanListesi : ArrayList<String>,val kahramanGorselleri : ArrayList<Int>) : RecyclerView.Adapter<RecyclerAdapter.SuperKahramanVH> () {
    class SuperKahramanVH(itemView: View) : RecyclerView.ViewHolder(itemView){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperKahramanVH {
        //Fonksiyon oluştuğu zaman yapılacak işlemler
        //Inflate,LayoutInflater,MenuInflater xml bağlantılarında ınflater kullanılır.
        //itemView recyclerrow ile görünümü birbirine bağlar.
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.recycler_row,parent,false)
        return  SuperKahramanVH(itemView)
    }

    override fun getItemCount(): Int {
       // ReyclerViewda kaç satır ve sıra olacak
        return kahramanListesi.size
    }

    override fun onBindViewHolder(holder: SuperKahramanVH, position: Int) {
        holder.itemView.recyclerViewTextView.text = kahramanListesi.get(position) // listeler ve recycler view birlikte çalışır
        //Tıklayınca farklı aktiviteye git
        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context,TanitimAktiviti::class.java)
            //Seçili verileri yolla
            intent.putExtra("superKahramanIsmi",kahramanListesi.get(position))
            intent.putExtra("superKahramanGorseli",kahramanGorselleri.get(position))
            /*
            val singleton = SingletonClass.SecilenKahraman
            singleton.gorsel=kahramanGorselleri.get(position)
        */
            holder.itemView.context.startActivity(intent)
        }
    }

}