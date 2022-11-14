package com.example.lectore35

import android.os.Bundle
import android.view.View
import android.widget.AdapterView.OnItemClickListener
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
class MainActivity : AppCompatActivity() {
    lateinit var dataModels: ArrayList<DataModel>
    lateinit var listView: ListView
    private lateinit var adapter: CustomAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        listView = findViewById<View>(R.id.list) as ListView
        dataModels = ArrayList()
        dataModels.add(DataModel("Apple Pie", "Android 1.0", "1", "September 23, 2008"))
        dataModels.add(DataModel("Banana Bread", "Android 1.1", "2", "February 9, 2009"))
        dataModels.add(DataModel("Cupcake", "Android 1.5", "3", "April 27, 2009"))
        dataModels.add(DataModel("Donut", "Android 1.6", "4", "September 15, 2009"))
        dataModels.add(DataModel("Eclair", "Android 2.0", "5", "October 26, 2009"))
        dataModels.add(DataModel("Froyo", "Android 2.2", "8", "May 20, 2010"))
        dataModels.add(DataModel("Gingerbread", "Android 2.3", "9", "December 6, 2010"))
        dataModels.add(DataModel("Honeycomb", "Android 3.0", "11", "February 22, 2011"))
        dataModels.add(DataModel("Ice Cream Sandwich", "Android 4.0", "14", "October 18, 2011"))
        dataModels.add(DataModel("Jelly Bean", "Android 4.2", "16", "July 9, 2012"))
        dataModels.add(DataModel("Kitkat", "Android 4.4", "19", "October 31, 2013"))
        dataModels.add(DataModel("Lollipop", "Android 5.0", "21", "November 12, 2014"))
        dataModels.add(DataModel("Marshmallow", "Android 6.0", "23", "October 5, 2015"))
        adapter = CustomAdapter(dataModels!!, applicationContext)
        listView.adapter = adapter
        listView.onItemClickListener = OnItemClickListener { parent, view, position, id ->
            val dataModel = dataModels!![position]
            Snackbar.make(
                view,
                """${dataModel.name} ${dataModel.type}
 API: ${dataModel.version_number}""".trimMargin(),
                Snackbar.LENGTH_LONG)
                .setAction("No action", null)
                .show()
        }
    }
}