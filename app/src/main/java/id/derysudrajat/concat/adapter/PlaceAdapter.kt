package id.derysudrajat.concat.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import id.derysudrajat.concat.data.Place
import id.derysudrajat.concat.databinding.ItemPlaceBinding

class PlaceAdapter(
    private val listPlace: List<Place>
) : RecyclerView.Adapter<PlaceAdapter.ViewHolder>() {
    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view)

    private lateinit var binding: ItemPlaceBinding

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        binding = ItemPlaceBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding.root)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val place = listPlace[position]
        with(binding) {
            ivPhoto.load(place.image) { crossfade(true) }
            tvLocationName.text = place.name
            tvLocation.text = place.location
        }
    }

    override fun getItemCount(): Int = listPlace.size
}