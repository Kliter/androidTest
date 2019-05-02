package com.test.TestApp.CustomDialogTest

import android.app.Dialog
import android.os.Bundle
import android.support.v4.app.DialogFragment
import android.support.v7.app.AlertDialog
import android.view.LayoutInflater
import com.test.TestApp.R

class CustomDialogFragment: DialogFragment() {

    // TODO: Rename parameter arguments,
    //  choose names that match the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    companion object {
        private val ARG_PARAM1 = "param1"
        private val ARG_PARAM2 = "param2"

        fun newInstance(param1: String, param2: String): CustomDialogFragment {
            val fragment = CustomDialogFragment()
            val args = Bundle()
            args.putString(ARG_PARAM1, param1)
            args.putString(ARG_PARAM2, param2)
            fragment.arguments = args
            return fragment
        }
    }

    // TODO: Rename and change types of parameters
    private var mParam1: String? = null
    private var mParam2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (arguments != null) {
            mParam1 = arguments!!.getString(ARG_PARAM1)
            mParam2 = arguments!!.getString(ARG_PARAM2)
        }
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val builder: AlertDialog.Builder = AlertDialog.Builder(context!!)

        // Get layout inflater
        val inflater: LayoutInflater = activity?.layoutInflater!!

        // Inflate and set the layout for the dialog.
        // Pass null as the parent view because it is going in the dialog layout.
        builder.setView(inflater.inflate(R.layout.fragment_custom_dialog, null))
                .setPositiveButton(R.string.SignIn) { _, _ ->
                    // Sign in the user...
                }
                .setNegativeButton(R.string.Cancel) { _, _ ->
                    dismiss()
                }

        return builder.create()
    }
}