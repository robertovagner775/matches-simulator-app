package me.dio.simulator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import me.dio.simulator.databinding.ActivityDetailBinding
import me.dio.simulator.databinding.ActivityMainBinding




class detailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        binding = ActivityDetailBinding.inflate(layoutInflater)

        setContentView(binding.root)
        setSupportActionBar(binding.tolbar)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)



    }
}