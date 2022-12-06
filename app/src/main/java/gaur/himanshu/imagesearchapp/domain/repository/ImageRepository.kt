package gaur.himanshu.imagesearchapp.domain.repository

import gaur.himanshu.imagesearchapp.domain.model.ImageModel

interface ImageRepository {

    suspend fun getSearchImage(query:String):List<ImageModel>

}