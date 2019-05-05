package com.sideproject.sidus.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.sideproject.sidus.R
import com.sideproject.sidus.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), Listener {
    private lateinit var mPresenter: Presenter
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        mPresenter = Presenter(this)
        binding.presenter = mPresenter
    }

    /**
     *  Presenter 리스너
     */
    override fun onClick() {
        println(">> Activity onClick")
    }
}
