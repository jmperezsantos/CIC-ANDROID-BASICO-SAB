package cic.ipn.mx.activitynavigationexample

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.btnGo.setOnClickListener {

            val intent: Intent =
                    Intent(this,
                            SecondActivity::class.java)

            intent.putExtra("NAME",
                    this.etName.text.toString())

            intent.putExtra("LASTNAME_P",
                    this.etLastnameP.text.toString())

            intent.putExtra("LASTNAME_M",
                    this.etLastnameM.text.toString())

            startActivity(intent)

        }

    }
}
