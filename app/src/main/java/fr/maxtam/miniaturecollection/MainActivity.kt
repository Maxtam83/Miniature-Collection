package fr.maxtam.miniaturecollection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import fr.maxtam.miniaturecollection.fragments.HomeFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // injecter le fragment dans la zone contenuePage
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.ContenuePage,HomeFragment())
        transaction.addToBackStack(null)
        transaction.commit()
    }
}