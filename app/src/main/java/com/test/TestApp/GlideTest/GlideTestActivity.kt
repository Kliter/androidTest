package com.test.TestApp.GlideTest

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.test.TestApp.R
import kotlinx.android.synthetic.main.activity_glidetest.*
import java.net.URI

class GlideTestActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_glidetest)

//        val gifMovie: Int = R.raw.test
//        Glide.with(this)
//                .load(gifMovie)
//                .into(ivGlide)

        // Refer other options when use Glide.
        val requestOptions = RequestOptions()
                .placeholder(R.drawable.charizard)
                .error(R.drawable.blastoise)
        Glide.with(this)
                .load("http://imgcc.naver.jp/kaze/mission_anm/USER/20170219/78/7396468/31/464x215x43e4ed3c7f49250a6e558254.gif")
                .apply(requestOptions)
                .into(ivGlide)

    }
}