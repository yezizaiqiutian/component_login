package com.gh.component_login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.gh.lib_core.utils.LogUtils

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        LogUtils.d("login组件测试组件引用")
    }
}