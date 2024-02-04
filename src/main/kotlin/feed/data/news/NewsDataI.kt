package feed.data.friends

import feed.models.News

interface NewsDataI {
    fun addNews(news: News): String
    fun getNews(locationId: String): List<News>
}
