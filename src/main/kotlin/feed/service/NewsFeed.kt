package feed.service

import feed.data.news.NewsDataI
import feed.models.News
import feed.models.NewsTopic

class NewsFeed(
    private val newsData: NewsDataI
) {
    fun addNews(news: News): String {
        return newsData.addNews(news)
    }

    fun getNews(topic: NewsTopic): List<News> {
        return newsData.getNews(topic)
    }
}
