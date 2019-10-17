package com.currency.currencyedittext

import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import java.text.DecimalFormat

/**
 * This method is called to notify you that,
 * within s, the count characters beginning at start are about to be replaced by new text with length after.
 * It is an error to attempt to make changes to s from this callback.
 * Public methods
 * @abstract void	afterTextChanged(Editable s)
 * This method is called to notify you that, somewhere within s, the text has been changed.
 * @abstract void	beforeTextChanged(CharSequence s, int start, int count, int after)
 * This method is called to notify you that, within s, the count characters beginning at start are about to be replaced by new text with length after.
 * @abstract void	onTextChanged(CharSequence s, int start, int before, int count)
 * This method is called to notify you that, within s, the count characters beginning at start have just replaced old text that had length before.
 */
class CurrencyEditTextWatcher(
    private val editView : EditText,
    private val clearIcon : (Boolean) -> Unit
) : TextWatcher {

    var beforeChar = ""
    override fun afterTextChanged(char: Editable?) {
    }

    override fun beforeTextChanged(char: CharSequence?, start: Int, count: Int, after: Int) {
        beforeChar = char.toString()
    }

    override fun onTextChanged(char: CharSequence?, start: Int, before: Int, count: Int) {
        char?.toString().let {
            if(it != beforeChar && it?.isNotEmpty() == true) {
                it.extractNumber().toDouble().let { value ->
                    editView.setText(DecimalFormat("###,###").format(value))
                    //// TODO: 2019-10-12 선택한 포지션 설정
                    editView.setSelection(editView.length())
                }
            }
        }
        if(editView.hasFocus()) {
            clearIcon.invoke(editView.length() > 0)
//            clearIcon(editView.length() > 0)
        }
    }

}

