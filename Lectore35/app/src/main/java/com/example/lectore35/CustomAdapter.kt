package com.example.lectore35

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar

class CustomAdapter(dataSet: ArrayList<DataModel>, context: Context) :
    ArrayAdapter<DataModel>(context, R.layout.row_item, dataSet), View.OnClickListener {
    private var mContext: Context
    // View lookup cache
    private class ViewHolder {
        var txtName: TextView? = null
        var txtType: TextView? = null
        var txtVersion: TextView? = null
        var info: ImageView? = null
    }
    override fun onClick(v: View) {
        val position = v.tag as Int
        val `object`: Any? = getItem(position)
        val dataModel = `object` as DataModel?
        when (v.id) {
            R.id.item_info -> Snackbar.make(
                v,
                "Release date " + dataModel!!.feature,
                Snackbar.LENGTH_LONG
            )
                .setAction("No action", null).show()
        }
    }
    private var lastPosition = -1
    init {
        mContext = context
    }
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var convertView: View? = convertView
        val dataModel = getItem(position)
        val viewHolder: ViewHolder
        val result: View?
        if (convertView == null) {
            viewHolder = ViewHolder()
            val inflater = LayoutInflater.from(context)
            convertView = inflater.inflate(R.layout.row_item, parent, false)
            viewHolder.txtName = convertView.findViewById(R.id.name)
            viewHolder.txtType = convertView.findViewById(R.id.type)
            viewHolder.txtVersion = convertView.findViewById(R.id.version_number)
            viewHolder.info = convertView.findViewById(R.id.item_info) as ImageView
            result = convertView
            convertView.tag = viewHolder
        } else {
            viewHolder = convertView.tag as ViewHolder
            result = convertView
        }
        val animation: Animation = AnimationUtils.loadAnimation(
            mContext,
            if (position > lastPosition) R.anim.up_from_bottom else R.anim.down_from_top
        )
        result?.startAnimation(animation)
        lastPosition = position
        viewHolder.txtName!!.text = dataModel!!.name
        viewHolder.txtType!!.text = dataModel.type
        viewHolder.txtVersion!!.text = dataModel.version_number
        viewHolder.info?.setOnClickListener(this)
        viewHolder.info?.tag = position
        return convertView!!
    }
}
