package cic.ipn.mx.listexample.fragments


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast

import cic.ipn.mx.listexample.R
import cic.ipn.mx.listexample.adapter.UserGridAdapter
import cic.ipn.mx.listexample.model.UserModel
import kotlinx.android.synthetic.main.fragment_grid.*

class GridFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_grid, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val users: List<UserModel> = getUsers(51)
        val adapter = UserGridAdapter(users)
        this.gvCuadricula.adapter = adapter

        this.gvCuadricula.setOnItemClickListener { parent, view, position, id ->

            Toast.makeText(this.context,
                    "presionó ${position}",
                    Toast.LENGTH_LONG
            ).show()

        }
    }

    private fun getUsers(size: Int): List<UserModel> {

        val users = mutableListOf<UserModel>()
        for (i in 1..size) {

            val user = UserModel()
            user.name = "user $i"
            user.phone = "555555$i"
            user.email = "user$i@gmail.com"

            users.add(user)

        }

        return users
    }

}
