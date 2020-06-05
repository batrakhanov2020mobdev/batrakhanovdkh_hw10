package com.example.batrakhanovdkh_hw10.ui.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.batrakhanovdkh_hw10.R
import com.example.batrakhanovdkh_hw10.ui.adapter.CategoryAdapter
import com.example.batrakhanovdkh_hw10.ui.presenter.CatalogPresenter
import com.example.batrakhanovdkh_hw10.view.CatalogView
import kotlinx.android.synthetic.main.activity_catalog.*

class CatalogActivity : AppCompatActivity(), CatalogView {

    private val presenter = CatalogPresenter()

    private val adapter = CategoryAdapter { category ->
        presenter.removeItem(category)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_catalog)
        setListeners()

        catalogCategoryRv.layoutManager = LinearLayoutManager(this)
        catalogCategoryRv.adapter = adapter

        presenter.attachView(this)
        presenter.setData()
    }

    private fun setListeners() {
        catalogShowBasketBtn.setOnClickListener {
            startActivity(Intent(this, BasketActivity::class.java))
        }
        catalogShowProductInfoBtn.setOnClickListener {
            startActivity(Intent(this, ProductInfoActivity::class.java))
        }
    }


    override fun setCategoriesList(categories: List<String>) {
        adapter.submitList(categories)
    }

    override fun removeItem(pos: Int) {
        adapter.notifyItemRemoved(pos)
    }

    companion object {
        const val PRODUCT_ID = "PRODUCT_ID"
    }

}