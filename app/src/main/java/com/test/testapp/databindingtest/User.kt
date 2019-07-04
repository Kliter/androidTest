package com.test.testapp.databindingtest

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import com.test.testapp.BR


// BaseObservableを使用するパターン
class User() : BaseObservable() {

    //@Bindableをつけると、監視用の定数BR.nameが生成される
//    @Bindable
//    fun getName() = name
//
//    fun setName(name: String) {
//        this.name = name
//        notifyPropertyChanged(BR.name)
//    }

    constructor(name: String?): this() {
        this.name = name
    }

    @get:Bindable
    var name: String? = ""
        set(value) {
            field = value
            notifyPropertyChanged(BR.name)
        }

}

// ObservableFieldを使用するパターン
// パラメータが少ない場合はこちらの方が良い
//class User(name: String) {
//
//    var name = ObservableField<String>()
//
//    init {
//        this.name.set(name)
//    }
//
//    // Setter
//    fun setName(name: String) {
//        this.name.set(name)
//    }
//
//}