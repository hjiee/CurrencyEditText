package com.currency.currencyedittext

import android.content.Context
import android.content.res.TypedArray
import android.graphics.Color
import android.text.InputType
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.EditText
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import androidx.core.graphics.drawable.DrawableCompat
import kotlinx.android.synthetic.main.currency.view.*
import java.util.*


class CurrencyEditText : ConstraintLayout {


    private val editText by lazy {
        findViewById<EditText>(R.id.edt_money).apply {
            setText("0")
        }
    }
    private val parentView by lazy {
        LayoutInflater.from(context).inflate(R.layout.currency, this, false)
    }

    constructor(
        context: Context
    ) : super(context) {
        initView()
    }

    constructor(
        context: Context,
        attributeSet: AttributeSet
    ) : super(context, attributeSet) {
        initView()
        getAttrs(attributeSet)
    }

    constructor(
        context: Context,
        attributeSet: AttributeSet, defStyleAttr: Int
    ) : super(context, attributeSet, defStyleAttr) {
        initView()
        getAttrs(attributeSet, defStyleAttr)
    }

    private fun initView() {
        addView(parentView)
        setVisibleClearIcon(false)
        editText.apply {
            inputType = 8194 // Number Decimal

            // Text 변경 이벤트
            addTextChangedListener(
                CurrencyEditTextWatcher(editText) {
                    setVisibleClearIcon(it)
                })
            // Text 포커스 이벤트
            onFocusChangeListener =
                TextFocusListener { setVisibleClearIcon(it) }
        }




    }

    private fun getAttrs(attributeSet: AttributeSet) {
        var typedArray: TypedArray =
            context.obtainStyledAttributes(
                attributeSet,
                R.styleable.CurrencyEditText
            )
        setTypeArray(typedArray)
    }

    private fun getAttrs(attributeSet: AttributeSet, defStyleAttr: Int) {
        var typedArray: TypedArray = context.obtainStyledAttributes(
            attributeSet,
            R.styleable.CurrencyEditText,
            defStyleAttr,
            0
        )
        setTypeArray(typedArray)
    }

    private fun setTypeArray(typedArray: TypedArray) {
        var preFix = typedArray.getString(R.styleable.CurrencyEditText_preFix)
        var postFix = typedArray.getString(R.styleable.CurrencyEditText_postFix)

        CurrencyEnum.values()
            .map {
                when (it.code) {
                    postFix -> {
                        tv_postfix.text = it.currencyName
                    }
                }
                when (it.code) {
                    preFix -> {
                        tv_prefix.text = it.symbol
                    }
                }
            }
    }

    private fun setVisibleClearIcon(visible: Boolean) {
        iv_clear.apply {
            visibility = if(visible) View.VISIBLE else View.INVISIBLE
            setOnClickListener { editText.setText("0") }
        }
    }
}