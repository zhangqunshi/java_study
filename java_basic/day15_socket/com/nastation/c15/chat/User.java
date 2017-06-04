package com.nastation.c15.chat;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

/**
 * 用户
 * 
 * @version v0.1 2007-11-28
 * @author Kris
 */
public class User {
	
	/** 用户名 */
	private String name;
	
	/** 用户聊天记录 */
	private List chatMsg;
	
	
	public User(String name) {
		this.name = name;
		chatMsg = Collections.synchronizedList(new ArrayList());
	}
	
	public String getName() {
		return name;
	}
	
	public String[] getAllChatMessages() {
		return (String[])chatMsg.toArray(new String[0]);
	}
	
	public String getLastChatMessage() {
		return (String)chatMsg.get(chatMsg.size()-1);
	}
	
	public int getMessageCount() {
		return chatMsg.size();
	}
	
	public void addChatMessage(String newMessage) {
		chatMsg.add(newMessage);
	}
	
	public void clearChatMessage() {
		chatMsg.clear();
	}
	
	public String toString() {
		return this.name;
	}

}
