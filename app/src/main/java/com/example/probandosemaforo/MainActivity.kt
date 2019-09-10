package com.example.probandosemaforo


import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.text.Layout
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.example.probandosemaforo.R.*
import kotlin.concurrent.thread
import kotlin.system.measureTimeMillis

class MainActivity : AppCompatActivity() {
    var sendButton :Button?=null
    var sendButton1 : Button?=null
    var sendButton2 : Button?=null
    var stopButton : Button?=null
    var layoutid : View?=null
    var loadingContainer :View?= null
    var loadingContainer1 :View?= null
    var loadingContainer2 :View?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Para pasar a rojo
        sendButton = findViewById(R.id.sendButton)
        sendButton!!.setOnClickListener { showLoading(true) }
        loadingContainer = findViewById(R.id.loadingContainer)
        loadingContainer!!.setOnClickListener { showLoading(false) }

        //Para Pasar a Amarillo
        sendButton1 = findViewById(R.id.sendButton1)
        loadingContainer1 = findViewById(R.id.loadingContainer1)
        sendButton1!!.setOnClickListener { showLoading1(true) }
        loadingContainer1!!.setOnClickListener( { showLoading1(false) })

        //Para Pasar a Verde
        sendButton2 = findViewById(R.id.sendButton2)
        loadingContainer2 = findViewById(R.id.loadingContainer2)
        sendButton2!!.setOnClickListener { showLoading2(true) }
        loadingContainer2!!.setOnClickListener( { showLoading2(false) })

        stopButton = findViewById(R.id.stopButton)
        stopButton!!.setOnClickListener { showLoading3() }
//        fun showLoading(show: Boolean) {
//            val visibility = if(show) View.VISIBLE else View.GONE
//            loadingContainer!!.visibility = visibility
//        }
//        Handler().postDelayed(Runnable() {
//
//            finish()
//        }, 50000);

    }

    private fun showLoading(show: Boolean) {
        val visibility = if(show) View.VISIBLE else View.GONE
        loadingContainer!!.visibility = visibility
        val visibility1 = if(show) View.GONE else View.VISIBLE
        sendButton!!.visibility = visibility1


        sendButton1!!.visibility = View.VISIBLE
    }
    private fun showLoading1(show: Boolean) {
        val visibility = if(show) View.VISIBLE else View.GONE
        loadingContainer1!!.visibility = visibility
        val visibility1 = if(show) View.GONE else View.VISIBLE
        sendButton1!!.visibility = visibility1
        sendButton2!!.visibility = View.VISIBLE
    }
    private fun showLoading2(show: Boolean) {
        val visibility = if(show) View.VISIBLE else View.GONE
        loadingContainer2!!.visibility = visibility
        val visibility1 = if(show) View.GONE else View.VISIBLE
        sendButton2!!.visibility = visibility1
    }
    private fun showLoading3() {
        val visibility = View.GONE
        loadingContainer!!.visibility = visibility
        loadingContainer1!!.visibility = visibility
        loadingContainer2!!.visibility = visibility
        sendButton1!!.visibility = visibility
        sendButton2!!.visibility = visibility
        val visibility1 = View.VISIBLE
        sendButton!!.visibility = visibility1
    }
}





