package cic.ipn.mx.fragmentsexample

import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import android.util.Log
import cic.ipn.mx.fragmentsexample.fragments.FirstFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Evalúa si es la primera vez que se
        //      ejecuta la app
        if (savedInstanceState == null) {

            val firstFragment = FirstFragment()

            val transaction =
                    this.supportFragmentManager.beginTransaction()

            transaction.add(R.id.container, firstFragment)

            transaction.commit()

        }

    }

    override fun onBackPressed() {


        if (this.supportFragmentManager.backStackEntryCount > 0) {

            super.onBackPressed()

        } else {

            this.showExitMessage()

        }


        Log.d("TAG!", "Pesionó Back")
    }

    private fun showExitMessage() {

        val alertBuilder = AlertDialog.Builder(this)

        alertBuilder.setTitle("Atención!")
        alertBuilder.setMessage("¿Estás seguro de querer salir?")
        alertBuilder.setPositiveButton("Sí", { dialog, _ ->

            dialog.cancel()

            this.finish()
        })

        alertBuilder.setNegativeButton("No", { dialog, _ ->

            dialog.cancel()

        })

        alertBuilder.setCancelable(false)

        alertBuilder.create().show()


    }
}






