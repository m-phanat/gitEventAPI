package com.bananacoding.android.pin_assistant_android.fragment


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.bananacoding.android.pin_assistant_android.R
import com.bananacoding.android.pin_assistant_android.activity.MainActivity

class SmartHomeFragment : Fragment() {

    private lateinit var mainActivity: MainActivity

    companion object {
        fun fragment(mainActivity: MainActivity): SmartHomeFragment {
            val fragment = SmartHomeFragment()
            fragment.mainActivity = mainActivity
            return fragment
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_smart_home, container, false)
    }


}