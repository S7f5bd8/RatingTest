package kr.ac.kopo.ratingtest

import android.os.Bundle
import android.widget.Button
import android.widget.RatingBar
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var r1 : RatingBar
    lateinit var r2 : RatingBar
    lateinit var r3 : RatingBar
    lateinit var btnInc : Button
    lateinit var btnDec : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        r1 = findViewById<RatingBar>(R.id.r1)
        r2 = findViewById<RatingBar>(R.id.r2)
        r3 = findViewById<RatingBar>(R.id.r3)

        btnInc = findViewById<Button>(R.id.btnInc)
        btnDec = findViewById<Button>(R.id.btnDec)

        btnInc.setOnClickListener {
            r1.rating += r1.stepSize
            r2.rating += r2.stepSize
            r3.rating += r3.stepSize
        }

        btnDec.setOnClickListener {
            r1.rating -= r1.stepSize
            r2.rating -= r2.stepSize
            r3.rating -= r3.stepSize
        }
    }
}