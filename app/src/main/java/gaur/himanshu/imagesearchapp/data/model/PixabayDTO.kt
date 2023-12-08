package gaur.himanshu.imagesearchapp.data.model

data class PixabayDTO(
    val hits: ArrayList<HitDTO>,
    val total: Int,
    val totalHits: Int
)