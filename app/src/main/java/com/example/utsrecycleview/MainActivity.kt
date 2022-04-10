package com.example.utsrecycleview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bukuList = listOf<Buku>(
            Buku(
                R.drawable.basisdata,
                "Buku Basis Data",
                "Berisikan materi tentang basis data"
            ),
            Buku(
                R.drawable.datamining,
                "Buku Data Mining",
                "Berisikan materi tentang data mining"
            ),
            Buku(
                R.drawable.jaringan,
                "Buku Jaringan",
                "Berisikan materi tentang jaringan"
            ),
            Buku(
                R.drawable.kalkulus,
                "Buku Kalkulus",
                "Berisikan materi tentang kalkulus"
            ),
            Buku(
                R.drawable.metopel,
                "Buku Metopel",
                "Berisikan materi tentang metopel"
            ),
            Buku(
                R.drawable.pengantar,
                "Buku Pengantar Aplikasi Komputer",
                "Berisikan materi tentang pengantar"
            ),
            Buku(
                R.drawable.sis_operasi,
                "Buku Sistem Operasi",
                "Berisikan materi tentang sistem operasi"
            ),
            Buku(
                R.drawable.machine,
                "Buku Machine Learning",
                "Berisikan materi tentang Machine learning"
            ),
            Buku(
                R.drawable.uiux ,
                "Buku UI/UX Design",
                "Berisikan materi tentang Ui/UX design"
            ),
            Buku(
                R.drawable.webprog,
                "Buku Pemoggraman WEB",
                "Berisikan materi tentang Pemoggraman WEB"
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_buku)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = BukuAdapter(this, bukuList){
            val intent = Intent (this, DetailBukuActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)

        }
    }
}