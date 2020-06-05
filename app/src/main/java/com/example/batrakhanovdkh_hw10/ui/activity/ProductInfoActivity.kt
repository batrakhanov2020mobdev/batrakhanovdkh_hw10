package com.example.batrakhanovdkh_hw10.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.batrakhanovdkh_hw10.R
import kotlinx.android.synthetic.main.activity_product_info.*

class ProductInfoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_info)
        setListeners()
    }

    private fun setListeners() {
        productBackBtn.setOnClickListener {
            finish()
        }
    }
}
