package com.currency.currencyedittext

import android.content.Context
import android.content.res.TypedArray
import android.text.InputType
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.appcompat.widget.AppCompatEditText
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import androidx.core.graphics.drawable.DrawableCompat
import com.currency.currencyedittext.listener.CurrencyWatcherListener
import com.currency.currencyedittext.listener.TextFocusListener
import com.currency.currencyedittext.listener.TouchListener
import kotlinx.android.synthetic.main.currency.view.*


class CurrencyEditText : ConstraintLayout {

    private val clearDrawable by lazy {
        ContextCompat.getDrawable(context, R.drawable.ic_clear_black_24dp)?.let {
            DrawableCompat.wrap(it)?.apply {
                setBounds(0, 0, it.intrinsicWidth, it.intrinsicHeight)
                setOnTouchListener(TouchListener(it))
            }
        }
    }
    private val parentView by lazy {
        LayoutInflater.from(context).inflate(R.layout.currency,this,false)
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
        edt_money.inputType = InputType.TYPE_CLASS_NUMBER

        // Text 변경 이벤트
        edt_money.addTextChangedListener(CurrencyWatcherListener(edt_money) { setVisibleClearIcon(it) })
        // Text 포커스 이벤트
        onFocusChangeListener = TextFocusListener { setVisibleClearIcon(it) }
    }

    private fun getAttrs(attributeSet: AttributeSet) {
        var typedArray: TypedArray =
            context.obtainStyledAttributes(attributeSet, R.styleable.CurrencyEditText)
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
//        var preFix = typedArray.getResourceId(R.styleable.CurrencyEditText_preFix,0)
//        append(preFix.toString())

        var postFix = typedArray.getString(R.styleable.CurrencyEditText_postFix)
        tv_postfix.text = "원"
//        append(postFix.toString())
    }

    private fun setVisibleClearIcon(visible: Boolean) {
        clearDrawable?.setVisible(visible, false)
        tv_postfix.setCompoundDrawables(null, null, if (visible) clearDrawable else null, null)
    }
}