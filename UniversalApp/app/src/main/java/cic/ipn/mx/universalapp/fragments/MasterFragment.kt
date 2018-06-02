package cic.ipn.mx.universalapp.fragments


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import cic.ipn.mx.universalapp.R
import cic.ipn.mx.universalapp.adapters.MasterListAdapter
import cic.ipn.mx.universalapp.model.SongModel
import kotlinx.android.synthetic.main.fragment_master.*

class MasterFragment : Fragment() {

    companion object {

        fun newInstance(): MasterFragment {

            val arguments = Bundle()

            val fragment = MasterFragment()

            fragment.arguments = arguments

            return fragment

        }

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_master, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val songs = SongModel.defaultSongs(20)

        val adaper = MasterListAdapter(songs)

        this.lvMaster.adapter = adaper

        this.lvMaster.setOnItemClickListener { parent, view, position, id ->

            val isTablet = this.resources.getBoolean(R.bool.isTablet)

            val song = adaper.getItem(position) as SongModel

            val detail = DetailFragment.newInstance(song)

            val transaction = this.fragmentManager!!.beginTransaction()
            if (isTablet) {

                transaction.replace(R.id.detail, detail)

            } else {

                transaction.replace(R.id.container, detail)
                transaction.addToBackStack(null);

            }

            transaction.commit()

        }

    }

}
