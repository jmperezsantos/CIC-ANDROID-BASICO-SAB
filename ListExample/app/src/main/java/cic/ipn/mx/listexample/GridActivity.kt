package cic.ipn.mx.listexample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import cic.ipn.mx.listexample.adapter.UserGridAdapter
import cic.ipn.mx.listexample.model.UserModel
import kotlinx.android.synthetic.main.activity_grid.*

class GridActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grid)


        val users: List<UserModel> = getUsers(51)
        val adapter = UserGridAdapter(users)
        this.gvCuadricula.adapter = adapter

        this.gvCuadricula.setOnItemClickListener {
            parent, view, position, id ->

            Toast.makeText(this,
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
