package id.derysudrajat.concat.utils

import id.derysudrajat.concat.data.Hotel
import id.derysudrajat.concat.data.Place
import java.text.NumberFormat
import java.util.*

object Helpers {
    fun Long.toRupiah(): String {
        val numberFormat = NumberFormat.getCurrencyInstance(Locale("in", "ID"))
        return numberFormat.format(this).toString()
    }

    val dataHotel = listOf(
        Hotel(
            "Hotel Ciputra Jakarta managed by Swiss-Belhotel International",
            "Grogol Petamburan, Jakarta Barat",
            4.2f,
            525000,
            "https://s-light.tiket.photos/t/01E25EBZS3W0FY9GTG6C42E1SE/t_htl-dskt/tix-hotel/images-web/2021/04/30/ce9a22cf-0f6d-4536-b90b-d4ce43ff55b1-1619768712072-64a2fa7c73a8e5c9b17b9ad43d753d92.jpg"
        ),
        Hotel(
            "DoubleTree by Hilton Hotel Jakarta - Diponegoro",
            "Menteng, Jakarta Pusat",
            4.5f, 979020,
            "https://s-light.tiket.photos/t/01E25EBZS3W0FY9GTG6C42E1SE/t_htl-dskt/tix-hotel/images-web/2020/10/31/4817fd36-050c-450c-bffd-69c4a36e9afd-1604145884115-e3a2aefb9ae2fc5740fa1e05ada4992f.jpg"),
        Hotel("Ascott Jakarta",
            "Tanah Abang, Jakarta Pusat", 4.4f, 809873,
            "https://s-light.tiket.photos/t/01E25EBZS3W0FY9GTG6C42E1SE/t_htl-dskt/tix-hotel/images-web/2020/09/19/d4bc18d2-983d-47da-892a-7a78d1c3fa66-1600516512623-216cc003d546c813969056091a96ce78.jpg"),
        Hotel("Shangri-La Jakarta", "Tanah Abang, Jakarta Pusat",
            4.6f, 1203039,
            "https://cf.bstatic.com/xdata/images/hotel/max1024x768/190617704.jpg?k=a6a3f6ec2e46d562abda3ef9b7dbcd1d0994f0afe052166ff431fa7f21543d1e&o=&hp=1"),
        Hotel(
            "The Ritz-Carlton Jakarta, Mega Kuningan",
            "Setiabudi, Jakarta Selatan", 4.5f, 1361250,
            "https://s-light.tiket.photos/t/01E25EBZS3W0FY9GTG6C42E1SE/t_htl-dskt/tix-hotel/images-web/2020/09/22/cd678bbf-0886-46d6-8e66-4d965573fb15-1600785356781-bd9ab01969227d658641c3b4d98d5948.jpg"),
    )

    val listPlace = listOf(
        Place("Dunia Fantasi (Dufan) Anchol", "Jakarata Utara","https://www.minews.id/wp-content/uploads/2020/11/Ancol-bagikan-ribuan-tiket-gratis-masuk-Dufan-bagi-guru.jpg"),
        Place("Pantai Indah Kapuk", "Jakarta Barat","https://cdn.idntimes.com/content-images/post/20210520/pik-8cc4f4b756bdbb067fb1e79021e13732_600x400.jpg"),
        Place("Jakarta Aquarium & Safari", "Jakarta Barat","https://i0.wp.com/advontura.com/wp-content/uploads/2021/01/shutterstock-508380913_1500002884-4.jpg?fit=1000%2C667&ssl=1"),
        Place("Taman Mini Indonesia Indah", "Jakarta Timur","https://ik.imagekit.io/tvlk/xpe-asset/AyJ40ZAo1DOyPyKLZ9c3RGQHTP2oT4ZXW+QmPVVkFQiXFSv42UaHGzSmaSzQ8DO5QIbWPZuF+VkYVRk6gh-Vg4ECbfuQRQ4pHjWJ5Rmbtkk=/9790977050032/Taman%2520Mini%2520Indonesia%2520Indah%2520%2528TMII%2529%2520Entrance%2520Gate%2520Tickets-da217eed-51da-4d6d-8dce-30eba15fb089.jpeg?_src=imagekit&tr=c-at_max,h-512,q-60,w-720"),
        Place("Styworld Indonesia", "Jakarta Timur","https://tools.lakupon.com/storage/images/lg/2020/01/20200122112555tg31xn06152ko88uv4oo0yelsvc1il-9WAlk1.jpeg"),
    )
}
