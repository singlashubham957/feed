package feed.data.user

import feed.models.User

interface UserDataI {
    fun getUser(userId: String): List<String>
    fun adduser(user: User): String
}