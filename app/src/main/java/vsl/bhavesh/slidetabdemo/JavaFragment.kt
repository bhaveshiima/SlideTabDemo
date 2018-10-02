package vsl.bhavesh.slidetabdemo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class JavaFragment:Fragment(){

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        var v = inflater.inflate(R.layout.java_frag, container, false)
        return v
        //return super.onCreateView(inflater, container, savedInstanceState)
    }
}