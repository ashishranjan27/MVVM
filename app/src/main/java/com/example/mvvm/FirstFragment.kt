package com.example.mvvm

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.mvvm.databinding.FragmentFirstBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

  //  lateinit var listener: communictaion

    private var _binding: FragmentFirstBinding? = null

    private val binding get() = _binding!!

    private val viewModel by lazy {
        ViewModelProvider(requireActivity()).get(FourthViewModel::class.java)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d("Ashish","fragment = onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("Ashish","fragment = onCreate")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("Ashish","fragment = onViewCreated")
    }

    override fun onStart() {
        super.onStart()
        Log.d("Ashish","fragment = onstart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Ashish","fragment = onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Ashish","fragment = onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Ashish","fragment = onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Ashish","fragment = onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d("Ashish","fragment = onDetach")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("Ashish","fragment = onCreateView")
        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        binding.lifecycleOwner = viewLifecycleOwner
        binding.viewModel = viewModel
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
        Log.d("Ashish","fragment = onDestroyView")
    }
}


interface communictaion{
    fun dataPass(data:String)
}