package feed.data.post

import feed.models.Post

interface PostDataI {
    fun getPosts(userId: String): List<Post>
    fun addPost(post: Post)
}
