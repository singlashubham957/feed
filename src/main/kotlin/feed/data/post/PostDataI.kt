package feed.data.post

import feed.models.Post

interface PostDataI {
    fun getPosts(userid: String): List<Post>
    fun addPost(post: Post): String?
}
