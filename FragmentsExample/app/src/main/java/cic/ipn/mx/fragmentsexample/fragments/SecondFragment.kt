package cic.ipn.mx.fragmentsexample.fragments


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import cic.ipn.mx.fragmentsexample.R
import kotlinx.android.synthetic.main.fragment_second.*

class SecondFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second,
                container,
                false)
    }

    override fun onViewCreated(view: View,
                               savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        this.btnGoBack.setOnClickListener {

            this.fragmentManager?.popBackStack();

        }

        this.btnGoTo3rd.setOnClickListener {

            val thirdFragment = ThirdFragment()

            val transaction =
                    this.fragmentManager?.beginTransaction()

            transaction?.replace(R.id.container, thirdFragment)

            //transaction?.addToBackStack(null)

            transaction?.commit()

        }

    }


}
