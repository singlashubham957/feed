package feed.models

import java.time.LocalDateTime


data class Friendship(
    val rowId: String,
    val userId1: String,
    val userId2: String,
    val createdAt: LocalDateTime
)
