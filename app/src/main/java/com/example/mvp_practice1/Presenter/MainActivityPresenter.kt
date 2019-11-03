package com.example.mvp_practice1.Presenter

import com.example.mvp_practice1.Contract.MainActivityContract
import com.example.mvp_practice1.Model.User

class MainActivityPresenter(private val mView: MainActivityContract.View) : MainActivityContract.Presenter {

    private val user: User = User()

    override fun saveDetails(firstName: String?, lastName: String?, address: String?, age: String?) {
        if (firstName == null || lastName == null || address == null || age == null) {
            mView.showError("Invalid details.")
        } else {
            user.mFirstName = firstName
            user.mLastName = lastName
            user.mAddress = address
            user.mAge = age
            loadDetails()
        }
    }

    override fun loadDetails() {
        val message = user.details
        mView.showInfo(message)
    }


}
