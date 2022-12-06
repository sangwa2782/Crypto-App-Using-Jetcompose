package gaur.himanshu.imagesearchapp.common

import gaur.himanshu.imagesearchapp.data.model.HitDTO
import gaur.himanshu.imagesearchapp.domain.model.ImageModel


fun HitDTO.toDomainModel(): ImageModel {
    return ImageModel(
        imageUrl = this.largeImageURL
    )
}
