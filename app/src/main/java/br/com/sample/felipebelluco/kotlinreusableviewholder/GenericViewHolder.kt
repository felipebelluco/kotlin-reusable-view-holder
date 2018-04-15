package br.com.sample.felipebelluco.kotlinreusableviewholder

import android.databinding.ViewDataBinding
import android.support.v7.widget.RecyclerView

class GenericViewHolder(val binding: ViewDataBinding) : RecyclerView.ViewHolder(binding.root) {

    fun bind(item: Any, presenter: Any) = binding.apply {
        setVariable(BR.item, item)
        setVariable(BR.presenter, presenter)
        executePendingBindings()
    }

}