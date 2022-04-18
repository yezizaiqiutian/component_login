package com.gh.module_login

import android.content.Context
import android.content.Intent
import com.alibaba.android.arouter.facade.annotation.Route
import com.gh.lib_common.module.UserBean
import com.gh.lib_core.baseui.BaseBindingActivity
import com.gh.lib_core.baseui.BaseViewModel
import com.gh.lib_core.utils.interceptor.InterceptorCheck
import com.gh.lib_router.login.LoginRoute
import com.gh.module_login.databinding.LoginActivityLoginBinding

/**
 * @author: gh
 * @description:
 * @date: 2022/3/23.
 * @from:
 */
@Route(path = LoginRoute.ACTIVITY_LOGIN)
class LoginActivity : BaseBindingActivity<LoginActivityLoginBinding,BaseViewModel>() {

    companion object {
        fun access(context: Context) {
            val intent = Intent(context, LoginActivity::class.java)
            context.startActivity(intent)
        }
    }

    override fun getLayoutId() = R.layout.login_activity_login

    override fun onInit() {
        binding.btnLogin.setOnClickListener {
            UserBean.isLogin = true
            InterceptorCheck.instance.continueCheck()
            finish()
        }
    }

}