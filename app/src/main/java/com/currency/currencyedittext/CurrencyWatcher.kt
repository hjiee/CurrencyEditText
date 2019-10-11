package com.currency.currencyedittext

import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.widget.Toast

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
class CurrencyWatcher : TextWatcher {
    override fun afterTextChanged(char: Editable?) {
        Log.e("CurrencyWatcher", "afterTextChanged \n=> \nchar : $char ")
    }

    override fun beforeTextChanged(char: CharSequence?, start: Int, count: Int, after: Int) {
        Log.e(
            "CurrencyWatcher",
            "beforeTextChanged \n=> \nchar : $char  \nstart : $start  \ncount : $count  \nafter : $after"
        )

    }

    override fun onTextChanged(char: CharSequence?, start: Int, before: Int, count: Int) {
        Log.e(
            "CurrencyWatcher",
            "onTextChanged \n=> \nchar : $char  \nstart : $start  \nbefore : $before  \ncount  : $count"
        )
    }

}
