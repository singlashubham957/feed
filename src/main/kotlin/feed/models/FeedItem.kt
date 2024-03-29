package feed.models

import java.time.LocalDateTime
import java.util.UUID

open class FeedItem(
    open val id: String= UUID.randomUUID().toString(),
    open val text: String,
    open val createdAt: LocalDateTime
)

class Post(
    override val id: String = UUID.randomUUID().toString(),
    override val text: String,
    val userId: String,
    override val createdAt: LocalDateTime
) : FeedItem(id, text, createdAt)

class News(
    override val id: String= UUID.randomUUID().toString(),
    override val text: String,
    val topic: NewsTopic,
    override val createdAt: LocalDateTime
) : FeedItem(id, text, createdAt)

data class LocationEvent(
    override val id: String= UUID.randomUUID().toString(),
    override val text: String,
    val locationId: String,
    val eventName: String,
    override val createdAt: LocalDateTime
) : FeedItem(id, text, createdAt)

enum class NewsTopic {
    SPORTS,
    POLITICS,
    TECHNOLOGY
}
