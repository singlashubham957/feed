package feed.data.post

import feed.models.Post
import feed.models.User

interface PostDataI {
    fun getPosts(userid: String): List<Post>
    fun addPost(post: Post): String?
}