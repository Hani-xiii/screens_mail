package com.firsovam.abiturientscreens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

    override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
        ): View? {

    val root = inflater.inflate(R.layout.fragment_home, container, false)


    return root
}

