package gaur.himanshu.imagesearchapp.domain.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import gaur.himanshu.imagesearchapp.domain.repository.ImageRepository
import gaur.himanshu.imagesearchapp.domain.use_cases.GetSearchImageUseCase

@InstallIn(SingletonComponent::class)
@Module
object DomainModule {

    @Provides
    fun provideGetSearchUseCase(imageRepository: ImageRepository): GetSearchImageUseCase {
        return GetSearchImageUseCase(imageRepository)
    }

}