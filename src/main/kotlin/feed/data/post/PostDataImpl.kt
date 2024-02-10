package feed.data.post

import feed.models.Post

class PostDataImpl : PostDataI {
    private val posts: MutableList<Post> = mutableListOf()
    override fun getPosts(userId: String): List<Post> {
        return posts.filter { it.userId == userId }
    }
    override fun addPost(post: Post) {
        posts.add(post)
    }
}
