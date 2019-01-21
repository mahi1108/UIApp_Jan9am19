package cubex.mahesh.uiapp_jan9am19

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun getText(v:View){
        var e =     findViewById<EditText>(R.id.et1)
        var t =    findViewById<TextView>(R.id.tv1)
        t.setText(e.getText())
    }
}
