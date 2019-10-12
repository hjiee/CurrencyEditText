package com.currency.currencyedittext.listener

import android.view.View
import android.widget.EditText

class TextFocusListener(
    private val clearIcon : (Boolean) -> Unit
) : View.OnFocusChangeListener {
    override fun onFocusChange(view: View?, hasFocus: Boolean) {
        when(hasFocus) {
            true -> clearIcon((view as EditText).text?.length!! > 0)
            false -> clearIcon(false)
        }
    }
}