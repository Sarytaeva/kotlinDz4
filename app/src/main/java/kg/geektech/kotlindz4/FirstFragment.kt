package kg.geektech.kotlindz4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import by.kirich1409.viewbindingdelegate.viewBinding
import kg.geektech.kotlindz4.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {

    private val binding: FragmentFirstBinding by viewBinding()
    private lateinit var viewModel: ViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(requireActivity()).get(ViewModel::class.java)
        binding.btnPlus.setOnClickListener {
            viewModel.plus()
        }
        binding.btnMinus.setOnClickListener {
            viewModel.minus()
        }
    }

}

