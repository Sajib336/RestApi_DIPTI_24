package com.example.restapi_dipti_24.ViewModel24

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.restapi_dipti_24.ApiClient24.apiService
import com.example.restapi_dipti_24.Product24
import kotlinx.coroutines.launch

class ProductViewModel24: ViewModel () {
    private val _product = MutableLiveData<List<Product24>>()
    val product:LiveData<List<Product24>> get() = _product

    init {
        viewModelScope.launch {
            fetchProducts()
        }
    }

    private suspend fun fetchProducts() {
        try {
            val response = apiService.getProducts()
            _product.postValue(response)
        } catch (e: Exception) {

        }
    }
}