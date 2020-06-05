package com.example.batrakhanovdkh_hw10.model

/**
 * Модель для создания заказа
 */
data class CreateOrderModel(
    var firstName: String = "",
    var lastName: String = "",
    var middleName: String = "",
    var phoneNumber: String = ""
)