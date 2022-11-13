package com.example.practice_1819

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.fragment.app.Fragment;
import android.widget.AdapterView.OnItemClickListener
import com.example.practice_1819.R
import java.lang.ClassCastException

class ListFragment: Fragment(){
    internal interface OnFragmentSendDataListener {
        fun onSendData(data: String?)
    }
    private var fragmentSendDataListener: OnFragmentSendDataListener? = null
    var breeds = arrayOf<String?>("M2", "M3", "M5")
    override fun onAttach(context: Context) {
        super.onAttach(context)
        try {
            fragmentSendDataListener = context as OnFragmentSendDataListener
        } catch (e: ClassCastException) {
            throw ClassCastException(
                context.toString() + " должен реализовывать интерфейс OnFragmentInteractionListener"
            )
        }
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_list, container, false)
        val breedsList = view.findViewById<ListView>(R.id.breedsList)
        val adapter: ArrayAdapter<String?> = ArrayAdapter((context)!!, android.R.layout.simple_list_item_1, breeds)
        breedsList.adapter = adapter
        breedsList.onItemClickListener = OnItemClickListener {
                parent, _, position, _ -> val selectedItem: String = parent.getItemAtPosition(position) as String
            fragmentSendDataListener!!.onSendData(selectedItem)
        }
        return view
    }
}