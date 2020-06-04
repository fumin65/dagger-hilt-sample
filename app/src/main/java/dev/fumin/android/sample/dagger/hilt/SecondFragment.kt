package dev.fumin.android.sample.dagger.hilt

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import javax.inject.Named

@AndroidEntryPoint
class SecondFragment : Fragment() {

    @Inject
    @Named("app")
    lateinit var appDependence: Dependence

    @Inject
    @Named("activity")
    lateinit var activityDependence: Dependence

    @Inject
    @Named("fragment")
    lateinit var fragmentDependence: Dependence


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        Log.d("second fragment", "app dependence : $appDependence")
        Log.d("second fragment", "activity dependence : $activityDependence")
        Log.d("second fragment", "fragment dependence : $fragmentDependence")

        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.button_second).setOnClickListener {
            findNavController().navigate(R.id.action_SecondFragment_to_FirstFragment)
        }
    }
}
