package cic.ipn.mx.listexample.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import cic.ipn.mx.listexample.R
import cic.ipn.mx.listexample.model.UserModel

class UserGridAdapter : BaseAdapter {

    private val users: List<UserModel>

    constructor(users: List<UserModel>) {

        this.users = users

    }

    override fun getCount(): Int {
        return users.count()
    }

    override fun getItem(position: Int): Any {

        return users[position]

    }

    override fun getItemId(position: Int): Long {

        return getItem(position).hashCode().toLong()

    }

    override fun getView(position: Int,
                         reusableView: View?,
                         parent: ViewGroup?): View {

        var viewToReturn = reusableView

        if (viewToReturn == null) {

            val layoutInflater =
                    LayoutInflater.from(parent?.context)

            viewToReturn =
                    layoutInflater.inflate(
                            R.layout.user_item_grid_layout,
                            parent,
                            false
                    )

        }

        val user: UserModel = getItem(position) as UserModel

        val tvName: TextView =
                viewToReturn!!.findViewById(R.id.tvName)

        val tvEmail: TextView =
                viewToReturn!!.findViewById(R.id.tvEmail)

        tvName.text = user.name
        tvEmail.text = user.email

        return viewToReturn!!

    }


}