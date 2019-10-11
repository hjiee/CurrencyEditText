package com.currency.currencyedittext

import android.content.Context
import android.graphics.drawable.Drawable
import android.text.InputType
import android.util.AttributeSet
import android.util.TypedValue
import android.view.LayoutInflater
import android.widget.EditText
import androidx.appcompat.widget.AppCompatEditText
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import androidx.core.widget.addTextChangedListener


class CurrencyEditText : AppCompatEditText {

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
//        setBackgroundResource(TypedValue.TYPE_NULL)
        inputType = InputType.TYPE_CLASS_NUMBER
        addTextChangedListener(CurrencyWatcher())

    }

    private fun getAttrs(attributeSet: AttributeSet) {

    }

    private fun getAttrs(attributeSet: AttributeSet, defStyleAttr: Int) {

    }

}