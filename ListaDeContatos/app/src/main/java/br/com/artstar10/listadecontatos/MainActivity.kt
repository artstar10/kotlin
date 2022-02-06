package br.com.artstar10.listadecontatos
import android.Manifest
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import androidx.core.app.ActivityCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {

    val READ_CONTACTS = 1
    val LINEAR_LAYOUT_VERTICAL = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if(ActivityCompat.checkSelfPermission(this, Manifest.permission.READ_CONTACTS)
        != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this,
            arrayOf(Manifest.permission.READ_CONTACTS),
            REQUEST_CONTACT)
        } else {
            setContacts()
        }
    }

    override fun onRequestPermissionsResult(requestCode: Int,
                                             permissions: Array<out String>,
                                             granResults: IntArray) {
    if (requestCode ==  REQUEST_CONTACT) setContacts()
    }

private fun setContacts() {
    val contactList: ArrayList<Contact> = ArrayList()

    val cursor = contentResolver.query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI,
    null,
        null,
        null,
    null)

    if(cursor != null){
            while (cursor.moveToNext()) {
                contactList.add(Contact(
                       cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME)),
                       cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER))
                ))
            }
            cursor.close()
        }

    val adapter = ContactsAdapter(contactList)
    val contactReycleView = findViewById<RecyclerView>(R.id.contacts_recyle_view)

    contactReycleView.layoutManager = LinearLayoutManager(this,
        LINEAR_LAYOUT_VERTICAL,
        false)
    }
}