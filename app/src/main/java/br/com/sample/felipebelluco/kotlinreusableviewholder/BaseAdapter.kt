package br.com.sample.felipebelluco.kotlinreusableviewholder

import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup

abstract class BaseAdapter : RecyclerView.Adapter<GenericViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GenericViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding: ViewDataBinding = DataBindingUtil.inflate(layoutInflater, viewType, parent, false)
        return GenericViewHolder(binding)
    }

    override fun onBindViewHolder(holder: GenericViewHolder, position: Int) {
        holder.bind(getItemForPosition(position), getPresenter())
    }

    override fun getItemViewType(position: Int): Int = getLayoutIdForPosition(position)

    protected abstract fun getItemForPosition(position: Int): Any

    protected abstract fun getLayoutIdForPosition(position: Int): Int

    protected abstract fun getPresenter(): Any
}