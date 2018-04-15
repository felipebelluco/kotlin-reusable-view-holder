package br.com.sample.felipebelluco.kotlinreusableviewholder

import android.content.Context
import android.widget.Toast

fun String.makeToast(context: Context, duration: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(context, this, duration).show()
}