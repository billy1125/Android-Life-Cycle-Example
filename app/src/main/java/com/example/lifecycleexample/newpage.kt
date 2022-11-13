package com.example.lifecycleexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.lifecycleexample.databinding.ActivityNewpageBinding

class newpage : AppCompatActivity() {
    private lateinit var binding: ActivityNewpageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNewpageBinding.inflate(layoutInflater)
//        setContentView(R.layout.activity_record)
        setContentView(binding.root)

        Log.d("生命週期", "新頁面的OnCreate()階段") //在Logcat顯示訊息，顯示目標數字
    }

    fun back(view: View){
        val intent = Intent(this, MainActivity::class.java)// 建立 Intent 物件
        startActivity(intent)// 啟動這個 Intent
    }

    fun destoryNewpage(view: View){
        finish()
    }

    override fun onStart() {
        super.onStart()
        Log.d("生命週期", "新頁面的onStart()階段") //在Logcat顯示訊息，顯示目標數字
    }

    override fun onResume() {
        super.onResume()
        Log.d("生命週期", "新頁面的onResume()階段") //在Logcat顯示訊息，顯示目標數字
    }

    override fun onPause() {
        super.onPause()
        Log.d("生命週期", "新頁面的onPause()階段") //在Logcat顯示訊息，顯示目標數字
    }

    override fun onStop() {
        super.onStop()
        Log.d("生命週期", "新頁面的onStop()階段") //在Logcat顯示訊息，顯示目標數字
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("生命週期", "新頁面的onDestroy()階段") //在Logcat顯示訊息，顯示目標數字
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("生命週期", "新頁面的onRestart()階段") //在Logcat顯示訊息，顯示目標數字
    }
}