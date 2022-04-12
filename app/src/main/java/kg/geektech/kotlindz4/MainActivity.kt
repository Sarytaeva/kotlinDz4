package kg.geektech.kotlindz4

import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.widget.ViewPager2

class MainActivity : FragmentActivity() {

    private lateinit var adapter: Adapter
    private lateinit var viewPager2: ViewPager2

    private val list = arrayListOf(FirstFragment(), SecondFragment(), ThirdFragment())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        inits()
    }

    private fun inits() {
        adapter = Adapter(this, list)
        viewPager2 = findViewById(R.id.vP)
        viewPager2.adapter = adapter
    }

}