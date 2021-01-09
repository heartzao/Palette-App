package th.ac.su.ict.karunpon.palette

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var change = findViewById<TextView>(R.id.change)
        var c1 = findViewById<Button>(R.id.c1)
        var c2 = findViewById<Button>(R.id.c2)
        var c3 = findViewById<Button>(R.id.c3)
        var c4 = findViewById<Button>(R.id.c4)
        var c5 = findViewById<Button>(R.id.c5)
        var c6 = findViewById<Button>(R.id.c6)

        c1.setOnClickListener {
            change.setBackgroundColor(Color.rgb(235,225,221))
            change.text = "235-225-221"

        }
        c2.setOnClickListener {
            change.setBackgroundColor(Color.rgb(236,203,202))
            change.text = "236-203-202"
        }
        c3.setOnClickListener {
            change.setBackgroundColor(Color.rgb(117,131,156))
            change.text = "117-131-156"
        }
        c4.setOnClickListener {
            change.setBackgroundColor(Color.rgb(153,169,191))
            change.text = "153-169-191"
        }
        c5.setOnClickListener {
            change.setBackgroundColor(Color.rgb(195,204,213))
            change.text = "195-204-213"
        }
        c6.setOnClickListener {
            change.setBackgroundColor(Color.rgb(221,226,229))
            change.text = "221-226-229"
        }
    }
}