package cic.ipn.mx.fragmentsexample.fragments


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

import cic.ipn.mx.fragmentsexample.R

class FirstFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        // Inflate the layout for this fragment

        val rootView = inflater.inflate(
                R.layout.fragment_first,
                container,
                false
        )

        val btnNavigate = rootView.findViewById<Button>(R.id.btnNavigate)

        btnNavigate.setOnClickListener {

            val secondFragment = SecondFragment()

            val transaction = this.fragmentManager?.beginTransaction()

            transaction?.replace(R.id.container, secondFragment)

            transaction?.addToBackStack(null)

            transaction?.commit()

        }

        return rootView

    }


}
