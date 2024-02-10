package feed.data.news

import feed.models.News
import feed.models.NewsTopic

interface NewsDataI {
    fun addNews(news: News)
    fun getNews(topic: NewsTopic): List<News>
}
