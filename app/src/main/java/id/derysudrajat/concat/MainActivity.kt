package id.derysudrajat.concat

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.ConcatAdapter
import androidx.recyclerview.widget.DefaultItemAnimator
import id.derysudrajat.concat.adapter.HotelAdapter
import id.derysudrajat.concat.adapter.PlaceAdapter
import id.derysudrajat.concat.adapter.TitleAdapter
import id.derysudrajat.concat.databinding.ActivityMainBinding
import id.derysudrajat.concat.utils.Helpers

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val headerPlace = TitleAdapter("Tempat Hiburan")
        val headerHotel = TitleAdapter("Hotel di Jakarta")
        val hotelAdapter = HotelAdapter(Helpers.dataHotel)
        val placeAdapter = PlaceAdapter(Helpers.listPlace)
        val concatAdapter = ConcatAdapter(headerPlace, placeAdapter, headerHotel, hotelAdapter)
        binding.rvMain.apply {
            itemAnimator = DefaultItemAnimator()
            adapter = concatAdapter
        }
    }
}