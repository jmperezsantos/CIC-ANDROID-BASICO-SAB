package cic.ipn.mx.universalapp.fragments


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import cic.ipn.mx.universalapp.R
import cic.ipn.mx.universalapp.model.SongModel
import kotlinx.android.synthetic.main.fragment_detail.*


class DetailFragment : Fragment() {

    var song: SongModel? = null

    companion object {

        fun newInstance(song: SongModel?): DetailFragment {

            val arguments = Bundle()

            arguments.putSerializable("SONG", song)

            val fragment = DetailFragment()

            fragment.arguments = arguments;

            return fragment

        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (this.arguments != null) {

            val songArg = this.arguments!!.getSerializable("SONG")

            if (songArg != null) {
                this.song = songArg as SongModel
            } else {
                this.song = null;
            }
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (this.song != null) {
            this.tvTitle.text = this.song!!.title
            this.tvArtist.text = this.song!!.artist
            this.tvRecordCompany.text = this.song!!.recordCompany
            this.tvDuration.text = this.song!!.duration.toString()
        }

    }


}
