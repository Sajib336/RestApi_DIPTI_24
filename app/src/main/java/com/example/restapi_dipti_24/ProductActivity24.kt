package com.example.restapi_dipti_24

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.restapi_dipti_24.Adapter24.ProductAdapter24
import com.example.restapi_dipti_24.ViewModel24.ProductViewModel24
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ProductActivity24 : AppCompatActivity() {
    private lateinit var productViewModel: ProductViewModel24
    private lateinit var productAdapter: ProductAdapter24
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product24)

        productViewModel = ViewModelProvider(this).get(ProductViewModel24::class.java)
        productAdapter = ProductAdapter24(emptyList())

        val refreshbtn: FloatingActionButton = findViewById(R.id.refreshBtn)
        refreshbtn.setOnClickListener{
            startActivity(Intent(this@ProductActivity24,ProductActivity24::class.java))
            finish()
        }
        val recyclerView : RecyclerView = findViewById(R.id.productRV)
        recyclerView.layoutManager = LinearLayoutManager(this)

        productViewModel.product.observe(this, Observer { product ->
            productAdapter = ProductAdapter24(product)
            recyclerView.adapter = productAdapter
        })
    }
}