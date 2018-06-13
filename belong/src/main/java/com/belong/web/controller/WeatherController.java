package com.belong.web.controller;


import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.belong.common.annotation.Log;
import com.belong.common.domain.ResponseBo;
import com.belong.common.util.HttpUtils;
import com.belong.common.util.UrlUtils;


@Controller
public class WeatherController  {

	@Log("获取天气信息")
	@RequestMapping("weather")
	public String weather() {
		return "web/weather/weather";
	}

	@RequestMapping("weather/query")
	@ResponseBody
	public ResponseBo queryWeather(String areaId) {
		try {
			String data = HttpUtils.sendPost(UrlUtils.MEIZU_WEATHER_URL, "cityIds=" + areaId);
			return ResponseBo.ok(data);
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseBo.error("查询天气失败，请联系网站管理员！");
		}
	}
	public static void main(String[] args) {
		String data = HttpUtils.sendVGet("http://app.pearvideo.com/clt/jsp/v2/home.jsp?lastLikeIds=1063871%2C1063985%2C1064069%2C1064123%2C1064078%2C1064186%2C1062372%2C1064164%2C1064081%2C1064176%2C1064070%2C1064019");
		System.out.println(data);
	

	}
}
