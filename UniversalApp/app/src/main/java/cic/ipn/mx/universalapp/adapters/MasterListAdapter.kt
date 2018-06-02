package cic.ipn.mx.universalapp.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import cic.ipn.mx.universalapp.R
import cic.ipn.mx.universalapp.model.SongModel

class MasterListAdapter : BaseAdapter {

    private var songs: List<SongModel>

    constructor(songs: List<SongModel>) {
        this.songs = songs
    }

    override fun getCount(): Int {
        return this.songs.count()
    }

    override fun getItem(position: Int): Any {
        return this.songs[position]
    }

    override fun getItemId(position: Int): Long {
        return this.getItem(position).hashCode().toLong()
    }

    override fun getView(position: Int,
                         convertView: View?,
                         parent: ViewGroup?): View {

        var reusableView = convertView

        if (reusableView == null) {

            val inflater = LayoutInflater.from(parent!!.context)

            reusableView =
                    inflater.inflate(
                            R.layout.master_list_item,
                            parent,
                            false
                    )

        }

        val song = this.getItem(position) as SongModel

        val tvTitle =
                reusableView!!.findViewById<TextView>(R.id.tvTitle)

        val tvDuration =
                reusableView!!.findViewById<TextView>(R.id.tvDuration)

        tvTitle.text = song.title
        tvDuration.text = song.duration.toString()

        return reusableView!!

    }

}