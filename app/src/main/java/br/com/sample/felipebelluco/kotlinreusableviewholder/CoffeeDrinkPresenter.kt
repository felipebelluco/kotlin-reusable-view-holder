package br.com.sample.felipebelluco.kotlinreusableviewholder

import android.content.Context

class CoffeeDrinkPresenter(val context: Context) {

    fun onClick(item: CoffeeDrink) {
        item.name.makeToast(context)
    }

}