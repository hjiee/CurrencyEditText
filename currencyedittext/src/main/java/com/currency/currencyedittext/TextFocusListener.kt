package com.currency.currencyedittext

import android.view.View
import android.widget.EditText

class TextFocusListener(
    private val clearIcon : (Boolean) -> Unit
) : View.OnFocusChangeListener {
    override fun onFocusChange(view: View?, hasFocus: Boolean) {
        (view as EditText).setSelection(view.length())
        when(hasFocus) {
            // 포커스가 있을 경우
            true -> {
                clearIcon((view).text?.length!! > 0 && (view).text.toString() != "0")
            }
            //
            false -> clearIcon(false)
        }
    }
}