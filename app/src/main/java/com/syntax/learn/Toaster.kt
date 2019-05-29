package com.syntax.learn

import android.content.Context
import android.support.annotation.StringRes
import android.widget.Toast

object Toaster {

  fun show(context: Context, @StringRes message: Int) {
    Toast.makeText(context, message, Toast.LENGTH_LONG).show()
  }
}
