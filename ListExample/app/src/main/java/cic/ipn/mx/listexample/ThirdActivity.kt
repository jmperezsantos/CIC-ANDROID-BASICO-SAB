package cic.ipn.mx.listexample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import cic.ipn.mx.listexample.fragments.GridFragment

class ThirdActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        if (savedInstanceState == null) {

            val fragment = GridFragment()

            val transaction =
                    this.supportFragmentManager
                            .beginTransaction()

            transaction.add(R.id.container, fragment)

            transaction.commit()

        }

    }
}
