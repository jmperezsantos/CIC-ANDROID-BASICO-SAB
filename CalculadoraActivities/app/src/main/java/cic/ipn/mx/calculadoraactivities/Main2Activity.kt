package cic.ipn.mx.calculadoraactivities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val num1 = this.intent.getStringExtra("NUM1")
        val num2 = this.intent.getStringExtra("NUM2")

        val op = this.intent.getIntExtra("OP", -1)

        if (op == 1) {
            this.tvOperacion.text = "SUMA"
            val suma = num1.toFloat() + num2.toFloat()
            this.tvResult.text = "$suma"
        } else if (op == 2) {
            this.tvOperacion.text = "RESTA"
            val resta = num1.toFloat() - num2.toFloat()
            this.tvResult.text = "$resta"
        } else if (op == 3) {
            this.tvOperacion.text = "MULTIPLICACIÓN"
            val mult = num1.toFloat() * num2.toFloat()
            this.tvResult.text = "$mult"
        } else if (op == 4) {
            this.tvOperacion.text = "DIVISIÓN"

            if (num2.toFloat() == 0f) {
                Toast.makeText(this,
                        "No puedes dividir entre cero",
                        Toast.LENGTH_LONG)
                        .show()
            } else {
                val div = num1.toFloat() / num2.toFloat()
                this.tvResult.text = "$div"
            }

        }

    }
}
