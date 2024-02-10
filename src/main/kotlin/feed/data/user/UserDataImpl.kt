package feed.data.user

import feed.models.User

class UserDataImpl : UserDataI {
    private val users: MutableList<User> = mutableListOf()
    override fun getUser(userId: String): User? {
        return users.find { it.userId == userId }
    }
    override fun adduser(user: User) {
        users.add(user)

    }
}
