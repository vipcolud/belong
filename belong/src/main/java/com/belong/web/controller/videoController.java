package com.belong.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.belong.common.annotation.Log;
import com.belong.common.domain.ResponseBo;
import com.belong.common.util.HttpUtils;
import com.belong.common.util.UrlUtils;

@Controller 
public class videoController {
	
	
	@Log("获取视频信息")
	@RequestMapping("/video")
	public String weather() {
		return "web/video/video";
	}
    /*
     * 获取头条视频
     */
	@RequestMapping("video/query")
	@ResponseBody
	public ResponseBo queryWeather(String areaId) {
		try {
			String data = HttpUtils.sendVGet(UrlUtils.Li_Video_URL);
			return ResponseBo.ok(data);
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseBo.error("查询天气失败，请联系网站管理员！");
		}
	}
	
	

}
