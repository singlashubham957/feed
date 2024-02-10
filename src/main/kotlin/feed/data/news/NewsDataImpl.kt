package feed.data.news

import feed.models.News
import feed.models.NewsTopic

class NewsDataImpl : NewsDataI {
    private val newsData: MutableList<News> = mutableListOf()
    override fun addNews(news: News) {
        newsData.add(news)
    }
    override fun getNews(topic: NewsTopic): List<News> {
        return newsData.filter { it.topic == topic }
    }
}
