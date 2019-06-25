package com.abc.calc

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.view.View


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etnum1 = findViewById<EditText>(R.id.etnum1)

        val etnum2 = findViewById<EditText>(R.id.etnum2)

        val btadd = findViewById<Button>(R.id.btadd)

        val btsub = findViewById<Button>(R.id.btsub)

        val btmul = findViewById<Button>(R.id.btmul)

        val btdiv = findViewById<Button>(R.id.btdiv)

        val TxSt = findViewById<TextView>(R.id.TxSt)

        btadd.setOnClickListener {
            if (TxSt.text.toString().isEmpty() || TxSt.text.toString() == null) {
                TxSt.text = "enter a number"

            } else {
                TxSt.text = "" + (Integer.parseInt(etnum1.text.toString()) + Integer.parseInt(etnum2.text.toString()))
            }
        }
        btsub.setOnClickListener {
            if (TxSt.text.toString().isEmpty() || TxSt.text.toString() == null) {
                TxSt.text = "enter a number"

            } else {
                TxSt.text =
                    "" + (Integer.parseInt(etnum1.text.toString()) - Integer.parseInt(etnum2.text.toString()))
            }
        }
        btmul.setOnClickListener {
            if (TxSt.text.toString().isEmpty() || TxSt.text.toString() == null) {
                TxSt.text = "enter a number"

            } else {

                TxSt.text =
                    "" + (Integer.parseInt(etnum1.text.toString()) * Integer.parseInt(etnum2.text.toString()))
            }
        }
        btdiv.setOnClickListener {
            if (TxSt.text.toString().isEmpty() || TxSt.text.toString() == null) {
                TxSt.text = "enter a number"

            } else {
                TxSt.text =
                    "" + (Integer.parseInt(etnum1.text.toString()) / Integer.parseInt(etnum2.text.toString()))
            }
        }


    }

}
