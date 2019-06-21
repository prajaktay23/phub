package com.abc.gstcalc

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edamt = findViewById<EditText>(R.id.edamt)

        val edgst = findViewById<EditText>(R.id.edgst)

        val txtans = findViewById<TextView>(R.id.txtans)

        val btcal = findViewById<Button>(R.id.btcal)

        val txtrs = findViewById<TextView>(R.id.txtrs)

        btcal.setOnClickListener {
            if (edamt.text.toString().isEmpty() || edgst.text.toString().isEmpty() || edamt.text.toString() == null || edgst.text.toString() == null) {
                txtans.text = "invalid amt"
                txtrs.text = "invalid gst %"

            }else{
                txtans.text =
                    "" + (Integer.parseInt(edamt.text.toString()) + Integer.parseInt(edamt.text.toString()) * Integer.parseInt(
                        edgst.text.toString()
                    ) / 100)
                txtrs.text = "" + (Integer.parseInt(txtans.text.toString()) - Integer.parseInt(edamt.text.toString()))

            }
        }

    }
}
