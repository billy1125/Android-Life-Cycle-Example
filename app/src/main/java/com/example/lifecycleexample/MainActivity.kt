package com.example.lifecycleexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.lifecycleexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater) //增加這一段
        // setContentView(R.layout.activity_main)
        setContentView(binding.root) //將setContentView修改

        Log.d("生命週期", "OnCreate()階段") //在Logcat顯示訊息，顯示目標數字
    }

    fun destoryMe(view: View){
        finish()
    }

    fun openNewpage(view: View){
        val intent = Intent(this, newpage::class.java)// 建立 Intent 物件
        startActivity(intent)// 啟動這個 Intent
    }

    override fun onStart() {
        super.onStart()
        Log.d("生命週期", "onStart()階段") //在Logcat顯示訊息，顯示目標數字
    }

    override fun onResume() {
        super.onResume()
        Log.d("生命週期", "onResume()階段") //在Logcat顯示訊息，顯示目標數字
    }

    override fun onPause() {
        super.onPause()
        Log.d("生命週期", "onPause()階段") //在Logcat顯示訊息，顯示目標數字
    }

    override fun onStop() {
        super.onStop()
        Log.d("生命週期", "onStop()階段") //在Logcat顯示訊息，顯示目標數字
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("生命週期", "onDestroy()階段") //在Logcat顯示訊息，顯示目標數字
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("生命週期", "onRestart()階段") //在Logcat顯示訊息，顯示目標數字
    }
}