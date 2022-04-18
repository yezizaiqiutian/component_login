package com.gh.module_login.arouterservice

import android.content.Context
import com.alibaba.android.arouter.facade.annotation.Route
import com.gh.lib_router.login.LoginRoute
import com.gh.lib_router.login.LoginService

/**
 * @author: gh
 * @description:
 * @date: 2022/4/14.
 * @from:
 */
@Route(path = LoginRoute.SERVICE)
class LoginServiceImpl : LoginService{

    override fun isLogin(): Boolean {
        return true
    }

    override fun init(context: Context?) {
    }
}