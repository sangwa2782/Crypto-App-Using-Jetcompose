package gaur.himanshu.imagesearchapp.domain.use_cases

import gaur.himanshu.imagesearchapp.common.Resource
import gaur.himanshu.imagesearchapp.domain.model.ImageModel
import gaur.himanshu.imagesearchapp.domain.repository.ImageRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class GetSearchImageUseCase(private val imageRepository: ImageRepository) {

    operator fun invoke(query: String): Flow<Resource<List<ImageModel>>> = flow {
        emit(Resource.Loading())
        try {
            emit(Resource.Success(data = imageRepository.getSearchImage(query = query)))
        } catch (e: java.lang.Exception) {
            emit(Resource.Error(message = e.message.toString()))
        }
    }

}