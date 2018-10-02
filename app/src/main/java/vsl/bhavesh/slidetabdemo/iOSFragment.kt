package vsl.bhavesh.slidetabdemo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class iOSFragment:Fragment(){

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        var v = inflater.inflate(R.layout.ios_frag, container, false)
        return v
        //return super.onCreateView(inflater, container, savedInstanceState)
    }
}