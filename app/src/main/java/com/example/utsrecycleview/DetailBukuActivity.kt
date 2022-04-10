package com.example.utsrecycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailBukuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_buku)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val buku = intent.getParcelableExtra<Buku>(MainActivity.INTENT_PARCELABLE)

        val imgBuku = findViewById<ImageView>(R.id.img_item_photo)
        val nameBuku = findViewById<TextView>(R.id.tv_item_name)
        val descBuku = findViewById<TextView>(R.id.tv_item_description)

        imgBuku.setImageResource(buku?.imgBuku!!)
        nameBuku.text = buku.nameBuku
        descBuku.text = buku.descBuku
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}