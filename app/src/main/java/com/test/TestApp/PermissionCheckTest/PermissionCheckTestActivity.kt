package com.test.testapp.permissionchecktest

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.BitmapFactory
import android.net.Uri
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.appcompat.app.AppCompatActivity
import com.test.testapp.R
import kotlinx.android.synthetic.main.activity_permissionchecktest.*
import java.io.FileNotFoundException
import java.io.InputStream

class PermissionCheckTestActivity: AppCompatActivity() {

    companion object {
        private const val REQUEST_CODE_PICKER = 1
        private const val REQUEST_CODE_PERMISSION = 2
    }

    private var selectImageUri: Uri? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_permissionchecktest)

        btnGetStorage.setOnClickListener {
            val photoPickerIntent = Intent(Intent.ACTION_PICK)
            photoPickerIntent.type = "image/*"
            startActivityForResult(photoPickerIntent, REQUEST_CODE_PICKER)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == REQUEST_CODE_PICKER && requestCode == RESULT_OK) {
            selectImageUri = data?.data
            if (ContextCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {
                if (ActivityCompat.shouldShowRequestPermissionRationale(this, Manifest.permission.READ_EXTERNAL_STORAGE)) {
                    Snackbar.make(contentsContainer, "Permission was set to Off.", Snackbar.LENGTH_SHORT)
                }
                else {
                    ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.READ_EXTERNAL_STORAGE), REQUEST_CODE_PERMISSION)
                }
                return
            }
            consoleText.text = "Image Width: ${readPickerImageWidth(selectImageUri!!)}"
        }
    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        if (requestCode == REQUEST_CODE_PERMISSION) {
            if (grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                consoleText.text = "Image Width: ${readPickerImageWidth(selectImageUri!!)}"
            }
            else {
                Snackbar.make(contentsContainer, "Permission was not granted.", Snackbar.LENGTH_SHORT)
            }
            return
        }
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
    }

    private fun readPickerImageWidth(uri: Uri): Int {
        return try {
            val imageStream: InputStream = contentResolver.openInputStream(uri)!!
            val imageOptions: BitmapFactory.Options = BitmapFactory.Options()
            imageOptions.inJustDecodeBounds = true
            BitmapFactory.decodeStream(imageStream, null, imageOptions)
            imageOptions.outWidth
        }
        catch (error: FileNotFoundException) {
            -1
        }
    }
}