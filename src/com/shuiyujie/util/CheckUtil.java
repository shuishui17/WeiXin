package com.shuiyujie.util;

import java.security.MessageDigest;
import java.util.Arrays;

public class CheckUtil {

	private static final String token = "nonglang"; //微信上填写的 token
	//接收三个参数 除了随机字符串
	public static boolean checkSignature(String signature,String timestamp,String nonce){
		//排序
		String[] arr = new String[]{token,timestamp,nonce};
		Arrays.sort(arr);
		
		//生成字符串
		StringBuffer content = new StringBuffer();
		for(int i = 0; i < arr.length; i++){
			content.append(arr[i]);
		}
		
		//sha1 加密 java实现消息摘要加密
		String temp = getSha1(content.toString());
		
		//和微信传递过来的参数进行校验
		return temp.equals(signature);
	}
	
	/**
	 * Sha1加密
	 * @param str
	 * @return
	 */
	public static String getSha1(String str) {
		if (str == null || str.length() == 0) {
			return null;
		}
		char hexDigits[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
				'a', 'b', 'c', 'd', 'e', 'f' };

		try {
			MessageDigest mdTemp = MessageDigest.getInstance("SHA1");
			mdTemp.update(str.getBytes("UTF-8"));

			byte[] md = mdTemp.digest();
			int j = md.length;
			char buf[] = new char[j * 2];
			int k = 0;
			for (int i = 0; i < j; i++) {
				byte byte0 = md[i];
				buf[k++] = hexDigits[byte0 >>> 4 & 0xf];
				buf[k++] = hexDigits[byte0 & 0xf];
			}
			return new String(buf);
		} catch (Exception e) {
			return null;
		}
	}
}