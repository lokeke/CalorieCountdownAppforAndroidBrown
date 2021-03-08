package ese.com.caloriecountdownappforandroidbrown

import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.widget.Toast

class JSONWrappingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_j_s_o_n_wrapping)
        setSupportActionBar(findViewById(R.id.toolbar))

        findViewById<FloatingActionButton>(R.id.fab).setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }

        val notFound = intent.getStringExtra("not found")

        Toast.makeText(this,"your app will add Food items not found to the local database now, please search and Credit missing items again after you Click OK",Toast.LENGTH_SHORT)

    }
}