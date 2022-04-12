package com.gh.module_login

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.gh.lib_common.module.UserBean
import com.gh.lib_core.utils.interceptor.InterceptorCheck

/**
 * @author: gh
 * @description:
 * @date: 2022/3/23.
 * @from:
 */
class LoginActivity : AppCompatActivity() {

    companion object {
        fun access(context: Context) {
            val intent = Intent(context, LoginActivity::class.java)
            context.startActivity(intent)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_activity_login)

        findViewById<Button>(R.id.btn_login).setOnClickListener {
            UserBean.isLogin = true
            InterceptorCheck.instance.continueCheck()
            finish()
        }

    }

}