package br.com.artstar10.imcapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.w("lifecycle", "CREATE - deixei a tela visível para você")
        finish()
    }
    override fun onStart() {
        super.onStart()
        Log.w("lifecycle", "RESUME - deixei a tela visível para você")
    }
    override fun onPause() {
        super.onPause()
        Log.w("lifecycle", "PAUSE - a tela perdeu o foco. você não pode mais interagir")
    }
    override fun onStop() {
        Log.w("lifecycle", "STOP - a tela não está mais visível mas ainda existe o foco. você não pode mais interagir")
        super.onStop()
    }
    override fun onRestart() {
        super.onRestart()
        Log.w("lifecycle", "RESTART - a tela está retomando o foco.")
    }

    override fun onDestroy() {
        Log.w("lifecycle", "DESTROY - ah não! a tela foi destruída.")
        super.onDestroy()
    }
}