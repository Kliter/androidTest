package com.test.testapp.firebasetest

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.android.gms.common.api.ApiException
import com.google.android.gms.tasks.Task
import com.test.testapp.R
import kotlinx.android.synthetic.main.activity_logintest.*

class LoginTestActivity: AppCompatActivity(), View.OnClickListener {

    companion object {
        private const val TAG = "LoginTestActivity"
        private const val REQUEST_CODE_SIGN_IN = 10001
    }

    // GoogleSignIn
    private var mGoogleSignInClient: GoogleSignInClient? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_logintest)

        btnGoogleSignIn.setOnClickListener(this)
        setupFirebaseAuth()
    }

    private fun setupFirebaseAuth() {
        val googleSignInOption = GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestEmail()// Call if you want to request user's email address.
                .build()
        mGoogleSignInClient = GoogleSignIn.getClient(this, googleSignInOption)
    }

    override fun onStart() {
        super.onStart()

        // Check for existing Google Sign In account.
        // If the user is already signed in, the GoogleSignInAccount will be non-null.
        val account: GoogleSignInAccount? = GoogleSignIn.getLastSignedInAccount(this)
        if (account == null) {
            Log.d(TAG, "User is not login.")
        }
        else {
            Log.d(TAG, "User is already login.")
        }
    }

    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.btnGoogleSignIn -> {
                signIn()
            }
        }
    }

    private fun signIn() {
        val signInIntent: Intent = mGoogleSignInClient?.signInIntent!!
        startActivityForResult(signInIntent, REQUEST_CODE_SIGN_IN)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        // Result returned from launching the Intent from GoogleSignInClient.signInIntent
        if (requestCode == REQUEST_CODE_SIGN_IN) {
            // The Task returned from this call is always completed, no need to touch a listener.
            val task = GoogleSignIn.getSignedInAccountFromIntent(data)
            handleSignInResult(task)
        }
    }

    private fun handleSignInResult(completedTask: Task<GoogleSignInAccount>?) {
        try {
            val account: GoogleSignInAccount = completedTask?.getResult(ApiException::class.java)!!
            Log.d(TAG, "signInResult: succeed. \n UserName=${account.displayName}")
        }
        catch (exception: ApiException) {
            // The ApiException status code indicates the detailed failure reason.
            // Please refer to the GoogleSignInStatusCodes class reference for more information.
            Log.w(TAG, "signInResult: failed code=${exception.statusCode}")
        }
    }
}