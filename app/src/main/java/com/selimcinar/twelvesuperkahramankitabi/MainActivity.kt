package com.selimcinar.twelvesuperkahramankitabi

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Batman
        //Superman
        //Spiderman
        //Aquaman
        //Ironman

        //Veri Hazırlığı
        var superKahramanIsımleri = ArrayList<String>()
        superKahramanIsımleri.add("Batman")
        superKahramanIsımleri.add("Superman")
        superKahramanIsımleri.add("Iron Man")
        superKahramanIsımleri.add("Aquaman")
        superKahramanIsımleri.add("Spiderman")

        //Resim İşlemleri
        //Verimsiz Tanımlamalar
        /*
        val batmanBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.batman)
        val supermanBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.superman)
        val ıronManBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.ironman)
        val aquaManBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.aquaman)
        val spiderManbitmap=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.spiderman)

        var superKahramanGorselleri = ArrayList<Bitmap>()
        superKahramanGorselleri.add(batmanBitmap)
        superKahramanGorselleri.add(supermanBitmap)
        superKahramanGorselleri.add(ıronManBitmap)
        superKahramanGorselleri.add(aquaManBitmap)
        superKahramanGorselleri.add(spiderManbitmap)*/

        val batmanDrawableId = R.drawable.batman
        val supermanDrawablerId =R.drawable.superman
        val ironmanDrawableId=R.drawable.ironman
        val aquamanDrawableId=R.drawable.aquaman
        val spidermanDrawableId = R.drawable.spiderman

        var superKahramanDrawableListesi = ArrayList<Int> ()
        superKahramanDrawableListesi.add(batmanDrawableId)
        superKahramanDrawableListesi.add(supermanDrawablerId)
        superKahramanDrawableListesi.add(ironmanDrawableId)
        superKahramanDrawableListesi.add(aquamanDrawableId)
        superKahramanDrawableListesi.add(spidermanDrawableId)


        val layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager

        val adapter = RecyclerAdapter(superKahramanIsımleri,superKahramanDrawableListesi)
        recyclerView.adapter=adapter




    }
}