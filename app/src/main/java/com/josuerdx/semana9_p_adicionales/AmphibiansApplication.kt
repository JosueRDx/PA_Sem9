package com.josuerdx.semana9_p_adicionales

import android.app.Application
import com.josuerdx.semana9_p_adicionales.data.AppContainer
import com.josuerdx.semana9_p_adicionales.data.DefaultAppContainer


class   AmphibiansApplication : Application() {
    /** AppContainer instance used by the rest of classes to obtain dependencies */
    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = DefaultAppContainer()
    }
}
