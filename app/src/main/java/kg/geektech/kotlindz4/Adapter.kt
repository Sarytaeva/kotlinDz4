package kg.geektech.kotlindz4

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class Adapter
    (fragmentActivity: FragmentActivity, var arrayList: ArrayList<Fragment>) :
    FragmentStateAdapter(fragmentActivity) {

    override fun getItemCount(): Int {
        return arrayList.size
    }

    override fun createFragment(position: Int): Fragment = arrayList[position]

    }
