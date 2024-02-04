package feed.service

import feed.data.post.PostDataI
import feed.models.Post
import feed.models.User

class FriendsPostFeed(
    private val postData: PostDataI
) {

    fun getPosts(userid: String): List<Post> {
        return postData.getPosts(userid)

    }

    fun addPost(post: Post): String? {
        return postData.addPost(post)
    }
}