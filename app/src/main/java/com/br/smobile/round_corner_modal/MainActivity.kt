package com.br.smobile.round_corner_modal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.br.smobile.round_corner_modal.modal.RoundedCornerModal
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_open_modal.setOnClickListener {
            val modal = RoundedCornerModal()
            modal.show(supportFragmentManager, FRAGMENT_TAG)
        }
    }

    companion object {
        const val FRAGMENT_TAG = "FRAGMENT_TAG"
    }
}