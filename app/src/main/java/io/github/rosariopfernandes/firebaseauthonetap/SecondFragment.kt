package io.github.rosariopfernandes.firebaseauthonetap

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class SecondFragment : Fragment() {

    private lateinit var auth: FirebaseAuth

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        auth = Firebase.auth

        // Display user information on the UI
        auth.currentUser?.let {
            view.findViewById<TextView>(R.id.tvUserInfo)
                .text = "Logged in as ${it.displayName}(${it.email})"
        }

        // Sign Out button
        view.findViewById<Button>(R.id.btnSignOut).setOnClickListener {
            auth.signOut()
            findNavController().navigate(R.id.action_SecondFragment_to_FirstFragment)
        }
    }
}
