package feed.data.user

import feed.models.User

interface UserDataI {
    fun getUser(userId: String): User?
    fun adduser(user: User)
}
