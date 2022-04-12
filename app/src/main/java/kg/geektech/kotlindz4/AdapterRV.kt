package kg.geektech.kotlindz4

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kg.geektech.kotlindz4.AdapterRV.ViewHolder
import kg.geektech.kotlindz4.databinding.ItemBinding

class AdapterRV(private var list: List<String>) : RecyclerView.Adapter<ViewHolder>() {
    class ViewHolder(private val binding: ItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun onBind(item: String) {
            binding.tvItem.text = item.toString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemBinding.inflate(
                LayoutInflater.from(parent.context), parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int = list.size
}