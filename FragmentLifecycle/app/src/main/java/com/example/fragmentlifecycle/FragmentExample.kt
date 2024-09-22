package com.example.fragmentlifecycle

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class FragmentExample : Fragment() {

    override fun onAttach(context: Context) {
        super.onAttach(context)

        Log.i("fragment", "onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.i("fragment", "onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        Log.i("fragment", "onCreateView")

        return inflater.inflate(R.layout.fragment_new, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        Log.i("fragment", "onViewCreated")
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onStart() {

        Log.i("fragment", "onStart")
        super.onStart()
    }

    override fun onResume() {   //After that fragment will run

        Log.i("fragment", "onResume")
        super.onResume()
    }

    override fun onPause() {

        Log.i("fragment", "onPause")
        super.onPause()
    }

    override fun onStop() {

        Log.i("fragment", "onStop")
        super.onStop()
    }

    override fun onDestroyView() {

        Log.i("fragment", "onDestroyView")
        super.onDestroyView()
    }

    override fun onDestroy() {

        Log.i("fragment", "onDestroy")
        super.onDestroy()
    }

    override fun onDetach() {

        Log.i("fragment", "onDetach")
        super.onDetach()
    }
}