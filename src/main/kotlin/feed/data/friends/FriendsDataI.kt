package feed.data.friends

import feed.models.Friendship
import feed.models.User

interface FriendsDataI {
    fun getFriendship(userId1: String, userId2: String): Friendship
    fun addFriendship(userId1: String, userId2: String): User?
}
