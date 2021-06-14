package id.derysudrajat.concat.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import coil.transform.RoundedCornersTransformation
import id.derysudrajat.concat.data.Hotel
import id.derysudrajat.concat.databinding.ItemHotelBinding
import id.derysudrajat.concat.utils.Helpers.toRupiah

class HotelAdapter(
    private val listHotel: List<Hotel>
): RecyclerView.Adapter<HotelAdapter.ViewHolder>() {
    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view)

    private lateinit var binding: ItemHotelBinding

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        binding = ItemHotelBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding.root)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val hotel = listHotel[position]
        with(binding) {
            ivPhoto.load(hotel.image) {
                crossfade(true)
                transformations(RoundedCornersTransformation(8f))
            }
            tvHotelName.text = hotel.name
            tvRating.text = hotel.rating.toString()
            tvPrice.text = hotel.price.toRupiah()
        }
    }

    override fun getItemCount(): Int = listHotel.size
}