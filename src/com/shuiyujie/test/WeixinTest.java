package com.shuiyujie.test;

import java.io.IOException;
import java.text.ParseException;

import net.sf.json.JSONObject;

import com.shuiyujie.po.AccessToken;
import com.shuiyujie.util.WeiXinUtil;

/**
 * @author 弄浪的鱼
 * @date 2017年5月15日
 */
public class WeixinTest {
	public static void main(String[] args) {
		
//		try {
//			AccessToken token = WeiXinUtil.getAccessToken();
//			System.out.println("票据"+token.getToken());
//			System.out.println("有效时间"+token.getExpiresIn());
//			
//			String path = "D:/2017-05-15_093734.jpg";
//			String mediaId = WeiXinUtil.upload(path, token.getToken(), "image");
//			System.out.println(mediaId);
//			
//			//String result = WeixinUtil.translate("my name is laobi");
//			//String result = WeixinUtil.translateFull("");
//			//System.out.println(result);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		String menu = JSONObject.fromObject(WeiXinUtil.initMenu()).toString();
		try {
			AccessToken token = WeiXinUtil.getAccessToken();
			System.out.println("票据"+token.getToken());
			System.out.println("有效时间"+token.getExpiresIn());
			
			int result = WeiXinUtil.createMenu(token.getToken(), menu);
			if(result == 0){
				System.out.println("创建菜单成功");
			}else{
				System.out.println("错误码：" + result);
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
