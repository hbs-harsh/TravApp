package com.example.travapp

import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private var currentImage = 0
     lateinit var image : ImageView
     var places = arrayOf("Nalanda university","Jal Mandir","Ghora Katora")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val next=findViewById<ImageButton>(R.id.btnNxt)
        val prev=findViewById<ImageButton>(R.id.btnPrev)
        val placeName=findViewById<TextView>(R.id.txtPlace)


        next.setOnClickListener {
            //i want to get the next page
            var idCurrentImageString = "pic$currentImage"

            //i want to get the integer address assosciated with each view
            var idCurrentImageInt = this.resources.getIdentifier(idCurrentImageString,"id",packageName)
            image=findViewById(idCurrentImageInt)
            image.alpha= 0f

            currentImage = (3+currentImage+1)%3

            var idImageToShowString = "pic$currentImage"
            var idImageToShowInt =this.resources.getIdentifier(idImageToShowString,"id",packageName)
            image=findViewById(idImageToShowInt)
            image.alpha=1f

            placeName.text=places[currentImage]

        }

        prev.setOnClickListener {
            //i want to get the prev page
            var idCurrentImageString = "pic$currentImage"

            //i want to get the integer address assosciated with each view
            var idCurrentImageInt = this.resources.getIdentifier(idCurrentImageString,"id",packageName)
            image=findViewById(idCurrentImageInt)
            image.alpha= 0f

            currentImage = (3+currentImage-1)%3

            var idImageToShowString = "pic"+currentImage
            var idImageToShowInt =this.resources.getIdentifier(idImageToShowString,"id",packageName)
            image=findViewById(idImageToShowInt)
            image.alpha=1f
            placeName.text=places[currentImage]

        }

        }
    }
