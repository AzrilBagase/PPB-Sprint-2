package com.example.pertemuanketujuh

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.pertemuanketujuh.databinding.ActivityHomeBinding

class Home : AppCompatActivity() {
    lateinit var binding: ActivityHomeBinding

    private lateinit var recyclerView: RecyclerView
    val datawisata = listOf<list_wisatavariabel>(
        list_wisatavariabel(
            R.drawable.ssgambar,
            namaitm = "Sound System PA 10k",
            kategoriitm = "Sound System",
            merkitm = "Custom",
            hargawitm = "Rp. 5.000.000,00"
        ),
        list_wisatavariabel(
            R.drawable.lightning,
            namaitm = "Lightning Panggung",
            kategoriitm = "Pencahayaan",
            merkitm = "Custom",
            hargawitm = "Rp. 5.000.000,00"
        ),
        list_wisatavariabel(
            R.drawable.panggung,
            namaitm = "Panggung Ringging",
            kategoriitm = "Panggung",
            merkitm = "Custom",
            hargawitm = "Rp. 5.000.000,00"
        ),
        list_wisatavariabel(
            R.drawable.alatmusik,
            namaitm = "Alat Musik Band",
            kategoriitm = "Alat Musik",
            merkitm = "Yamaha",
            hargawitm = "Rp. 2.500.000,00"
        ),
    )
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setContentView(R.layout.activity_home)

        binding.rvUser.setOnClickListener{
            startActivity(Intent(this, DetailItem::class.java))
        }
        recyclerView = findViewById<RecyclerView>(R.id.rvUser)
        recyclerView.setHasFixedSize(true)


        ShowCardWisata()
    }
    private fun ShowCardWisata() {
        recyclerView.layoutManager = LinearLayoutManager (this)
        val adapter = List_MahasiswaAdapter(this, datawisata) {}
        recyclerView.adapter = adapter
    }

}