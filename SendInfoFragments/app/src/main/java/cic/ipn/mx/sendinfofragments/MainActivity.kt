package cic.ipn.mx.sendinfofragments

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import cic.ipn.mx.sendinfofragments.fragments.FirstFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {

            val firstFragment = FirstFragment.newInstance()

            val transaction =
                    this.supportFragmentManager.beginTransaction()

            transaction.add(R.id.container, firstFragment)

            transaction.commit()

        }

    }
}
