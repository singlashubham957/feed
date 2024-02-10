package feed.data.friends

import feed.models.Friendship

interface FriendsDataI {

    fun getFriendship(userId1: String, userId2: String): Friendship?
    fun addFriendship(friendship: Friendship)
}
