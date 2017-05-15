package com.shuiyujie.po;

/**
 * 消息类
 * @author 弄浪的鱼
 * @date 2017年5月13日
 */
public class TextMessage extends BaseMessage{

	private String Content;
	private String MsgId;

	public String getContent() {
		return Content;
	}
	public void setContent(String content) {
		Content = content;
	}
	public String getMsgId() {
		return MsgId;
	}
	public void setMsgId(String msgId) {
		MsgId = msgId;
	}
}
