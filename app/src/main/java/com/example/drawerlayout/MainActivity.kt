package com.example.drawerlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.view.GravityCompat
import com.example.drawerlayout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var bindingClass: ActivityMainBinding
    override fun onCreate(s: Bundle?) {
        super.onCreate(s)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)
        bindingClass.apply {
            navigationMenu.setNavigationItemSelectedListener {
                when (it.itemId) {
                    R.id.item1 -> Toast.makeText(this@MainActivity, "item1", Toast.LENGTH_SHORT).show()
                    R.id.item2 -> Toast.makeText(this@MainActivity, "item2", Toast.LENGTH_SHORT).show()
                    R.id.item3 -> Toast.makeText(this@MainActivity, "item3", Toast.LENGTH_SHORT).show()
                    R.id.item4 -> Toast.makeText(this@MainActivity, "item4", Toast.LENGTH_SHORT).show()
                    R.id.item11 -> Toast.makeText(this@MainActivity, "item11", Toast.LENGTH_SHORT).show()
                    R.id.item22 -> Toast.makeText(this@MainActivity, "item22", Toast.LENGTH_SHORT).show()
                    R.id.item33 -> Toast.makeText(this@MainActivity, "item33", Toast.LENGTH_SHORT).show()
                    R.id.item44 -> Toast.makeText(this@MainActivity, "item44", Toast.LENGTH_SHORT).show()
                }
                true
            }
            open.setOnClickListener {
                drawer.openDrawer(GravityCompat.START)
            }
        }
    }
}