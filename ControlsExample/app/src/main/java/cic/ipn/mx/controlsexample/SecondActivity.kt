package cic.ipn.mx.controlsexample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.SeekBar
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        this.sbSeekBar.setOnSeekBarChangeListener(
                object : SeekBar.OnSeekBarChangeListener {
                    override fun onProgressChanged(seekBar: SeekBar?,
                                                   progress: Int,
                                                   fromUser: Boolean) {
                        Log.d("TAG", "Valor: $progress")
                        tvProgress.text = "Valor: $progress"

                        pbInverseProgress.progress = 100 - progress
                    }

                    override fun onStartTrackingTouch(seekBar: SeekBar?) {
                        Log.d("TAG", "TOCARON EL SEEKBAR")
                    }

                    override fun onStopTrackingTouch(seekBar: SeekBar?) {
                        Log.d("TAG", "SOLTARON EL SEEKBAR")
                        pbInverseProgress.progress = seekBar!!.progress
                    }

                }
        )

        this.swSwith
                .setOnCheckedChangeListener { buttonView, isChecked ->

                    if (isChecked) {
                        Log.d("TAG", "El Switch esta prendido")
                    } else {
                        Log.d("TAG", "El Switch esta apagado")
                    }

                }

        this.rgRadioGroup.setOnCheckedChangeListener { group, checkedId ->

            if (checkedId == R.id.op1) {
                Log.d("TAG", "Presionó la opción 1")
            } else if (checkedId == R.id.op2) {
                Log.d("TAG", "Presionó la opción 2")
            } else if (checkedId == R.id.op3) {
                Log.d("TAG", "Presionó la opción 3")
            }

        }

    }
}
