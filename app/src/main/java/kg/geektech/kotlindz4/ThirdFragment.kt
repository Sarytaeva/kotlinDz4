package kg.geektech.kotlindz4

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import by.kirich1409.viewbindingdelegate.viewBinding
import kg.geektech.kotlindz4.databinding.FragmentThirdBinding

class ThirdFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private var list = ArrayList<String>()
    private val binding: FragmentThirdBinding by viewBinding()
    private lateinit var viewModel: ViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_third, container, false)
    }

    @SuppressLint("NotifyDataSetChanged")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(requireActivity()).get(ViewModel::class.java)
        recyclerView = binding.rvHistory
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        val adapterRV = AdapterRV(list)
        recyclerView.adapter = adapterRV
        viewModel.string.observe(requireActivity()) {
            list.add(it.toString())
            adapterRV.notifyDataSetChanged()
        }
    }
}