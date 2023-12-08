package gaur.himanshu.imagesearchapp.data.repository

import gaur.himanshu.imagesearchapp.common.toDomainModel
import gaur.himanshu.imagesearchapp.data.network.ApiService
import gaur.himanshu.imagesearchapp.domain.model.ImageModel
import gaur.himanshu.imagesearchapp.domain.repository.ImageRepository

class ImageRepositoryImpl(private val apiService: ApiService) : ImageRepository {

    override suspend fun getSearchImage(query: String): List<ImageModel> {
        try {
            return apiService.getSearchImage(
            ).map { it.toDomainModel() }
        } catch (e: java.lang.Exception) {
            throw Exception(e)
        }
    }
}