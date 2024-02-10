package feed.service

import feed.data.user.UserDataI
import feed.models.User

class UserService(
    private val userData: UserDataI
) {
    fun getUser(userId: String): User? {
        return userData.getUser(userId)
    }

    fun adduser(user: User): String {
        return userData.adduser(user)
    }
}
