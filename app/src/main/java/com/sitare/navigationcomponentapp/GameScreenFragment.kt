package com.sitare.navigationcomponentapp

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import com.sitare.navigationcomponentapp.databinding.FragmentGameScreenBinding
import com.sitare.navigationcomponentapp.databinding.FragmentGameStartBinding

class GameScreenFragment : Fragment() {
    private var _binding : FragmentGameScreenBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentGameScreenBinding.inflate(inflater, container, false)
        val bundle : GameScreenFragmentArgs by navArgs()
        val incomingName = bundle.name
        val incomingPerson = bundle.person
        Log.e("Incoming person id:", incomingPerson.id.toString())
        Log.e("Incoming person name:", incomingPerson.name)
        Log.e("Incoming argument", incomingName)
        binding.gameButton.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.gameOverAction)
        }
        return binding.root
    }
}