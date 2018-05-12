package cic.ipn.mx.activitynavigationexample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        this.btnBack.setOnClickListener {

            finish()

        }


        val name =
                this.intent.getStringExtra("NAME")

        val lastnameP =
                this.intent.getStringExtra("LASTNAME_P");

        val lastnameM =
                this.intent.getStringExtra("LASTNAME_M")

        this.tvName.text = "$name $lastnameP $lastnameM"

    }
}
