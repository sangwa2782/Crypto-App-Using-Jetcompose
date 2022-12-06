package gaur.himanshu.imagesearchapp.data.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import gaur.himanshu.imagesearchapp.data.network.ApiService
import gaur.himanshu.imagesearchapp.data.network.BASE_URL
import gaur.himanshu.imagesearchapp.data.repository.ImageRepositoryImpl
import gaur.himanshu.imagesearchapp.domain.repository.ImageRepository
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@InstallIn(SingletonComponent::class)
@Module
object DataModule {

    @Provides
    fun provideApiService(): ApiService {
        return Retrofit.Builder().baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create()).build()
            .create(ApiService::class.java)
    }

    @Provides
    fun provideImageRepo(apiService: ApiService): ImageRepository {
        return ImageRepositoryImpl(apiService)
    }

}