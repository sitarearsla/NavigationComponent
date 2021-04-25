package com.sitare.navigationcomponentapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.sitare.navigationcomponentapp.databinding.FragmentGameStartBinding

class GameStartFragment : Fragment() {
    private var _binding: FragmentGameStartBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentGameStartBinding.inflate(inflater, container, false)
        binding.startButton.setOnClickListener {
            //passing the arguments
            val person = Person(1, "Sitare")
            val action = GameStartFragmentDirections.gameScreenAction("Name", person)

            //fragment navigation
            Navigation.findNavController(it).navigate(action)
        }
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}