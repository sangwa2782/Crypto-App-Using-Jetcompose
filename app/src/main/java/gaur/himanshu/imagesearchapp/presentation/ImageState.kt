package gaur.himanshu.imagesearchapp.presentation

import gaur.himanshu.imagesearchapp.domain.model.ImageModel

data class ImageState(
    val isLoading:Boolean=false,
    val data:List<ImageModel>?=null,
    val error:String=""
)
