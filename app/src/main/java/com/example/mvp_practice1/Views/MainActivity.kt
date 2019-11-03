package com.example.mvp_practice1.Views

import androidx.appcompat.app.AppCompatActivity

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

import com.example.mvp_practice1.Contract.MainActivityContract
import com.example.mvp_practice1.Presenter.MainActivityPresenter
import com.example.mvp_practice1.R

class MainActivity : AppCompatActivity(), MainActivityContract.View, View.OnClickListener {

    private var mPresenter: MainActivityContract.Presenter? = null

    private var mDetailsDisplay: TextView? = null
    private var mFirstName: EditText? = null
    private var mLastName: EditText? = null
    private var mAddress: EditText? = null
    private var mAge: EditText? = null
    private var mSaveBtn: Button? = null
    private var mResetBtn: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()

        mPresenter = MainActivityPresenter(this)
    }

    private fun initView() {
        mDetailsDisplay = findViewById(R.id.tvDetails)
        mFirstName = findViewById(R.id.etFirstName)
        mLastName = findViewById(R.id.etLastName)
        mAddress = findViewById(R.id.etAddress)
        mAge = findViewById(R.id.etAge)
        mSaveBtn = findViewById(R.id.btnSaveDetails)

        mSaveBtn!!.setOnClickListener(this)
        mResetBtn!!.setOnClickListener(this)
    }

    override fun showInfo(info: String) {
        mDetailsDisplay!!.text = info
    }

    override fun showError(error: String) {
        mDetailsDisplay!!.text = error
    }


    override fun onClick(v: View) {
        when (v.id) {
            R.id.btnSaveDetails -> mPresenter!!.saveDetails(
                    mFirstName!!.text.toString(),
                    mLastName!!.text.toString(),
                    mAddress!!.text.toString(),
                    mAge!!.text.toString())
        }
    }
}
