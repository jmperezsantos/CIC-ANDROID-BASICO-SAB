package cic.ipn.mx.calculadoraactivities

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.btnSuma.setOnClickListener {

            val intent = Intent(this, Main2Activity::class.java)

            intent.putExtra("NUM1", this.etNum1.text.toString())
            intent.putExtra("NUM2", this.etNum2.text.toString())
            intent.putExtra("OP", 1)

            startActivity(intent)

        }

        this.btnResta.setOnClickListener {

            val intent = Intent(this, Main2Activity::class.java)

            intent.putExtra("NUM1", this.etNum1.text.toString())
            intent.putExtra("NUM2", this.etNum2.text.toString())
            intent.putExtra("OP", 2)

            startActivity(intent)

        }

        this.btnMult.setOnClickListener {

            val intent = Intent(this, Main2Activity::class.java)

            intent.putExtra("NUM1", this.etNum1.text.toString())
            intent.putExtra("NUM2", this.etNum2.text.toString())
            intent.putExtra("OP", 3)

            startActivity(intent)

        }

        this.btnDiv.setOnClickListener {

            val intent = Intent(this, Main2Activity::class.java)

            intent.putExtra("NUM1", this.etNum1.text.toString())
            intent.putExtra("NUM2", this.etNum2.text.toString())
            intent.putExtra("OP", 4)

            startActivity(intent)

        }

    }
}
