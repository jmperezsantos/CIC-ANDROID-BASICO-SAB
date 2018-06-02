package cic.ipn.mx.universalapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import cic.ipn.mx.universalapp.fragments.DetailFragment
import cic.ipn.mx.universalapp.fragments.MasterFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {

            val isTablet = this.resources.getBoolean(R.bool.isTablet)

            val master = MasterFragment.newInstance()

            val transaction =
                    this.supportFragmentManager.beginTransaction()

            if (isTablet) {

                val detail = DetailFragment.newInstance(null)

                transaction.add(R.id.master, master)
                transaction.add(R.id.detail, detail)

            } else {
                transaction.add(R.id.container, master)
            }

            transaction.commit()

        }

    }
}
