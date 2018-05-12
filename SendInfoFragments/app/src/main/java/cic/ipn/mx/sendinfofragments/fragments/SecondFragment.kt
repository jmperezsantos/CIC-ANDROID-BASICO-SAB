package cic.ipn.mx.sendinfofragments.fragments


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import cic.ipn.mx.sendinfofragments.R
import kotlinx.android.synthetic.main.fragment_second.*

class SecondFragment : Fragment() {

    var message: String = ""

    companion object {

        val MESSAGE_ARG = "MESSAGE_ARG"

        fun newInstance(message: String): SecondFragment {

            val arguments = Bundle()

            arguments.putString(MESSAGE_ARG, message)

            val fragment = SecondFragment()

            fragment.arguments = arguments

            return fragment

        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (this.arguments != null) {
            this.message = this.arguments!!.getString(MESSAGE_ARG)
        }

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        this.tvOutput.text = this.message

    }


}
