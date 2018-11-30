package ExampleofStream;

public class NewsPaper {
	int newsId;
	String postedByUser,commentByUser,comment;
	public NewsPaper(int newsId, String postedByUser, String commentByUser,
			String comment) {
		super();
		this.newsId = newsId;
		this.postedByUser = postedByUser;
		this.commentByUser = commentByUser;
		this.comment = comment;
	}
	public int getNewsId() {
		return newsId;
	}
	public String getPostedByUser() {
		return postedByUser;
	}
	public String getCommentByUser() {
		return commentByUser;
	}
	public String getComment() {
		return comment;
	}
	@Override
	public String toString() {
		return "NewsPaper [newsId=" + newsId + ", postedByUser=" + postedByUser
				+ ", commentByUser=" + commentByUser + ", comment=" + comment
				+ "]";
	}
	
	

}
