package ru.geekbrains.lesson1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import ru.geekbrains.test.Test


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val person = Person("noInit", 20, "bio1", "bio2")
        //Log.d("mylogs", person.name)
        person.newProperty = ""
        Log.d("mylogs", person.newProperty)
        //Log.d("mylogs", test)
        //test = "NewTest"
        //Log.d("mylogs", test)
        val test = Test()
    }
}


