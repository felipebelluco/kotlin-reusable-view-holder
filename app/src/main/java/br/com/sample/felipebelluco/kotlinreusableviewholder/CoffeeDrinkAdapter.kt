package br.com.sample.felipebelluco.kotlinreusableviewholder

class CoffeeDrinkAdapter(
        val layoutId: Int,
        val items: List<CoffeeDrink>,
        val presenter: CoffeeDrinkPresenter) : BaseAdapter() {

    override fun getItemForPosition(position: Int): Any = items[position]

    override fun getLayoutIdForPosition(position: Int): Int = layoutId

    override fun getItemCount(): Int = items.size

    override fun getPresenter(): Any = presenter
}