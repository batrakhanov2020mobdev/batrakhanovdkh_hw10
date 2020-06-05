package com.example.batrakhanovdkh_hw10.ui.presenter

import com.example.batrakhanovdkh_hw10.view.CatalogView
import moxy.MvpPresenter

class CatalogPresenter : MvpPresenter<CatalogView>() {

    private val categories = mutableListOf("Смартфоны", "Ноутбуки", "Телевизоры", "Часы")

    fun setData() {
        viewState.setCategoriesList(categories)
    }

    fun removeItem(category: String) {
        val pos = categories.indexOf(category)
        categories.remove(category)
        viewState.removeItem(pos)
    }

}