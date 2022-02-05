package br.com.artstar10.listadecontatos

import android.Manifest
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.core.app.ActivityCompat


class MainActivity : AppCompatActivity() {

    val READ_CONTACTS = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if(ActivityCompat.checkSelfPermission(this, Manifest.permissions.READ_CONTACTS)
        != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(tthis,
            arrayOf(Manifest.permissions.READ_CONTACTS),
            READ_CONTACTS)
        } else {
            setContacts()
        }
    }

    onRequest fun onRequestPermissionsResult(requestCode: Int,
                                             permission: Array<out String>,
                                             grantResult: IntArray) {
    if (requestCode ==  READ_CONTACTS) setContacts()
    }

private fun setContacts() {
// todo: no yet implements
}