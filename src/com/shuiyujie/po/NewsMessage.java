package com.shuiyujie.po;

import java.util.List;

/**
 * @author 弄浪的鱼
 * @date 2017年5月14日
 */
public class NewsMessage extends BaseMessage{
	
	private int ArticleCount;
	private List<News> Articles;
	
	public int getArticleCount() {
		return ArticleCount;
	}
	public void setArticleCount(int articleCount) {
		ArticleCount = articleCount;
	}
	public List<News> getArticles() {
		return Articles;
	}
	public void setArticles(List<News> articles) {
		Articles = articles;
	}
	
	
}
