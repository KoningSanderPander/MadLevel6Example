package nl.svdoetelaar.madlevel6example.api

import nl.svdoetelaar.madlevel6example.model.Trivia
import retrofit2.http.GET

interface TriviaApiService {

    @GET("/random/trivia?json")
    suspend fun getRandomNumberTrivia(): Trivia
}