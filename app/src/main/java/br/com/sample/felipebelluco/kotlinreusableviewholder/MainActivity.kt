package br.com.sample.felipebelluco.kotlinreusableviewholder

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        coffee_milk_drinks.layoutManager = LinearLayoutManager(this)
        coffee_milk_drinks.adapter = CoffeeDrinkAdapter(R.layout.drink_item, getDrinks(), CoffeeDrinkPresenter(this))
    }

    private fun getDrinks() = arrayListOf(
            CoffeeDrink("Antoccino"),
            CoffeeDrink("Breve"),
            CoffeeDrink("Café au Lait", "French"),
            CoffeeDrink("Ca Phe Sua Da", "Vietnamese"),
            CoffeeDrink("Café Bombón", "Spanish"),
            CoffeeDrink("Cappuccino", "Italian"),
            CoffeeDrink("Cortado", "Spanish"),
            CoffeeDrink("Egg Coffee", "Vietnamese"),
            CoffeeDrink("Eiskaffee", "German"),
            CoffeeDrink("Flat white", "Australian")
    )
}
