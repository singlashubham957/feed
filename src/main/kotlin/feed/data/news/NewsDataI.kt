package feed.data.friends

import feed.models.LocationEvent
import feed.models.News
import feed.models.User

interface NewsDataI {
    fun addNews(news: News): String
    fun getNews(locationId: String): List<News>
}