package com.firsovam.abiturientscreens

import android.R.drawable
import android.app.Application
import com.bettervectordrawable.Convention
import com.bettervectordrawable.VectorDrawableCompat


public class App:Application() {

//https://habr.com/ru/post/265601/

    override fun onCreate() {
        super.onCreate()

        // вызов VectorDrawableCompat.enableResourceInterceptionFor()
        val ids =
            VectorDrawableCompat.findVectorResourceIdsByConvention(
                resources,
                drawable::class.java, Convention.ResourceNameHasVectorSuffix
            )
        VectorDrawableCompat.enableResourceInterceptionFor(
            resources,
            *ids
        )
    }
}