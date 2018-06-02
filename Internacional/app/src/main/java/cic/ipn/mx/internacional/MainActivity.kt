package cic.ipn.mx.internacional

import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.btnSaluda.setOnClickListener {

            this.showAlert()

        }

    }

    private fun showAlert() {

        val dialogBuilder = AlertDialog.Builder(this)

        val message = getString(R.string.alert_message)
        val title = getString(R.string.alert_title)
        val yesButton = getString(R.string.alert_yes_button)
        val noButton = getString(R.string.alert_no_button)

        dialogBuilder.setMessage(message)
                .setTitle(title)
                .setPositiveButton(yesButton, { dialog, which ->
                    dialog.dismiss()
                })
                .setNegativeButton(noButton, { dialog, which ->
                    dialog.dismiss()
                })

        val dialog = dialogBuilder.create()

        dialog.show()

    }
}
