package cic.ipn.mx.controlsexample

import android.content.DialogInterface
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnAction =
                this.findViewById<Button>(R.id.btnAction)

        this.tvOutput.text = "Hola Mundo!"
        this.etInput.setText("")


        btnAction.setOnClickListener {

            Toast.makeText(this,
                    this.etInput.text.toString(),
                    Toast.LENGTH_LONG).show()

            if (this.etInput.text.toString().isNotEmpty()) {

                this.tvOutput.text = this.etInput.text.toString()
                this.etInput.text.clear()

                btnAction.text = "Otra cosa"

            } else {

                this.showAlert()

            }

        }

    }

    private fun showAlert() {

        val alertBuilder = AlertDialog.Builder(this)

        alertBuilder.setTitle("Error")
        alertBuilder.setMessage("Debes ingresar algo en el campo de texto")

        alertBuilder.setPositiveButton("Aceptar",
                DialogInterface.OnClickListener { dialog, which ->
                    Log.d("TAG", "Presionó POSITIVE")
                })

        alertBuilder.setNegativeButton("NO QUIERO",
                DialogInterface.OnClickListener { dialog, which ->
                    Log.d("TAG", "Presionó NEGATIVE")
                })

        alertBuilder.setNeutralButton("NEUTRAL",
                DialogInterface.OnClickListener { dialog, which ->
                    Log.d("TAG", "Presionó NEUTRAL")
                })

        alertBuilder.setCancelable(false);

        val alertDialog = alertBuilder.create()
        alertDialog.show()

    }
}
