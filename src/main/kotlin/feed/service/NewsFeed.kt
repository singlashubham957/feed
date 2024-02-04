package feed.service

import feed.data.friends.NewsDataI
import feed.models.News

class NewsFeed (
    private val newsData: NewsDataI
) {
    fun addNews(news: News): String {
       return newsData.addNews(news)
    }

    fun getNews(locationId: String): List<News> {
        return newsData.getNews(locationId)
    }
}