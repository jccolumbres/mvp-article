package com.example.mvp_practice1.Contract

import android.content.Context
import android.content.Intent
import android.widget.EditText
import android.widget.TextView

interface MainActivityContract {

    interface View {
        fun showInfo(info: String)
        fun showError(error: String)
    }

    interface Presenter {
        fun saveDetails(
                firstName: String?,
                lastName: String?,
                address: String?,
                age: String?)

        fun loadDetails()
    }
}
