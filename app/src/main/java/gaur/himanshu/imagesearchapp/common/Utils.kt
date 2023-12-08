package gaur.himanshu.imagesearchapp.common

import gaur.himanshu.imagesearchapp.data.model.HitDTO
import gaur.himanshu.imagesearchapp.data.model.coinDTOItem
import gaur.himanshu.imagesearchapp.domain.model.ImageModel


fun coinDTOItem.toDomainModel(): ImageModel {
    return ImageModel(
        imageUrl = this.image,
        name = this.name,
        symbol = this.symbol,
        current_price = this.current_price
    )
}
