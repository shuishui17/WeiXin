package com.shuiyujie.po;

/**
 * 消息的基础类，共有属性
 * @author 弄浪的鱼
 * @date 2017年5月14日
 */
public class BaseMessage {

	//消息来源用户
	private String ToUserName;
	//消息去向用户
	private String FromUserName;
	// 消息创建时间
	private long CreateTime;
	// 消息类型
	private String MsgType;
	public String getToUserName() {
		return ToUserName;
	}
	public void setToUserName(String toUserName) {
		ToUserName = toUserName;
	}
	public String getFromUserName() {
		return FromUserName;
	}
	public void setFromUserName(String fromUserName) {
		FromUserName = fromUserName;
	}
	public long getCreateTime() {
		return CreateTime;
	}
	public void setCreateTime(long createTime) {
		CreateTime = createTime;
	}
	public String getMsgType() {
		return MsgType;
	}
	public void setMsgType(String msgType) {
		MsgType = msgType;
	}
	
}
