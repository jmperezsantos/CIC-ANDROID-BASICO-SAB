package cic.ipn.mx.sendinfofragments.fragments


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import cic.ipn.mx.sendinfofragments.R
import kotlinx.android.synthetic.main.fragment_first.*

class FirstFragment : Fragment() {

    companion object {

        fun newInstance(): FirstFragment {

            val arguments = Bundle()

            val fragment = FirstFragment()

            fragment.arguments = arguments

            return fragment

        }

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        this.btnSend.setOnClickListener {

            val message = this.etInput.text.toString()

            val secondFragment =
                    SecondFragment
                            .newInstance(message)

            val transaction = this.fragmentManager?.beginTransaction()

            transaction?.replace(R.id.container, secondFragment)

            transaction?.addToBackStack(null)

            transaction?.commit()

        }

    }

}
