package com.test.TestApp.DialogsTest

import android.content.DialogInterface
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import android.util.Log
import com.test.TestApp.R
import kotlinx.android.synthetic.main.activity_dialogstest.*
import java.nio.channels.Selector

class DialogsTestActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dialogstest)

        setupWidget()
    }

    private fun setupWidget() {
        btnTitleMessageOKDialog.setOnClickListener {
            AlertDialog.Builder(this)
                    .setTitle("Title")
                    .setMessage("Message")
                    .setPositiveButton("OK", null)
                    .show()
        }

        btnTitleMessageOKCancelDialog.setOnClickListener {
            AlertDialog.Builder(this)
                    .setTitle("Title")
                    .setMessage("Message")
                    .setPositiveButton("OK") { _, _ ->
                        // OK button pressed.
                    }
                    .setNegativeButton("Cancel", null)
                    .show()
        }

        btnTitleMessageYesLaterNoDialog.setOnClickListener {
            AlertDialog.Builder(this)
                    .setTitle("Title")
                    .setMessage("Message")
                    .setPositiveButton("YES") { _, _ ->
                        // Yes button pressed.
                    }
                    .setNeutralButton("Later") { _, _ ->
                        // Later button pressed.
                    }
                    .setNegativeButton("No", null)
                    .show()
        }

        btnThreeOptionsDialog.setOnClickListener {
            val items: Array<String> = arrayOf("item_0", "item_1", "item_2")
            AlertDialog.Builder(this)
                    .setTitle("Selector")
                    .setItems(items) { _, _ ->
                        // item witch pressed.
                    }
                    .show()
        }

        btnRadioButtonDialog.setOnClickListener {
            val items: Array<String> = arrayOf("item_0", "item_1", "item_2")
            val defaultItem = 0
            val checkedItems: MutableList<Int> = mutableListOf<Int>()
            checkedItems.add(defaultItem)

            AlertDialog.Builder(this)
                    .setTitle("Selector")
                    .setSingleChoiceItems(items, defaultItem) { _, which ->
                        checkedItems.clear()
                        checkedItems.add(which)
                    }
                    .setPositiveButton("OK") { _, _ ->
                        if (!checkedItems.isEmpty()) {
                            Log.d("DialogsTestActivity", "checkedItem: ${checkedItems[0]}")
                        }
                    }
                    .setNegativeButton("Cancel", null)
                    .show()
        }

        btnCheckBoxDialog.setOnClickListener {
            val items: Array<String> = arrayOf("item_0", "item_1", "item_2")
            val checkedItems: MutableList<Int> = mutableListOf<Int>()

            AlertDialog.Builder(this)
                    .setTitle("Selector")
                    .setMultiChoiceItems(items, null) { _, which, isChecked ->
                        if (isChecked) {
                            checkedItems.add(which)
                        }
                        else {
                            checkedItems.remove(which)
                        }
                    }
                    .setPositiveButton("OK") { _, _ ->
                        for (i: Int in checkedItems) {
                            //item_i checked
                        }
                    }
                    .setNegativeButton("Cancel", null)
                    .show()
        }

        btnCustomLayout.setOnClickListener {

        }
    }
}