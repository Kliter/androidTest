package com.test.testapp.setsoftinputmodetest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.WindowManager
import com.test.testapp.R

class SetSoftInputModeTestActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setsoftinputmodetest)

        /**
        SOFT_INPUT_STATE_ALWAYS_HIDDEN
        window がフォーカスを受けたときに常に soft input area を隠す

        SOFT_INPUT_STATE_ALWAYS_VISIBLE
        window がフォーカスを受けたときに常に soft input area を表示する

        SOFT_INPUT_STATE_HIDDEN
        通常、適切なとき（ユーザが window を全面に持ってきたとき）に soft input area を隠す

        SOFT_INPUT_STATE_UNCHANGED
        soft input area の状態を変更しないでください

        SOFT_INPUT_STATE_UNSPECIFIED
        状態は指定されていない

        SOFT_INPUT_STATE_VISIBLE
        通常、適切なとき（ユーザが window を全面に持ってきたとき）に soft input area を表示する
         */
        this.window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN)
    }
}