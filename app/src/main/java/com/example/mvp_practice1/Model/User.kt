package com.example.mvp_practice1.Model

class User {
    var mFirstName: String? = null
    var mLastName: String? = null
    var mAddress: String? = null
    var mAge: String? = null
    val details: String
        get() = "Hi " + mFirstName + " " + mLastName + "\n" +
                "You're from " + mAddress + "\n" +
                "You're " + mAge + " year's old,"
}
