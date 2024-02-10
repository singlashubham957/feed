package feed.data.friends

import feed.models.Friendship

class FriendsDataImpl : FriendsDataI {
    private val friendships: MutableList<Friendship> = mutableListOf()

    override fun getFriendship(userId1: String, userId2: String): Friendship? {
        return friendships.find {
            (it.userId1 == userId1 || it.userId2 == userId2) ||
                (it.userId2 == userId1 || it.userId1 == userId2)
        }
    }
    override fun addFriendship(friendship: Friendship) {
        friendships.add(friendship)
    }
}
