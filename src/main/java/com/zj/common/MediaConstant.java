package com.zj.common;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 常量配置
 * @author ZJ
 *
 */
public class MediaConstant {

	//自定义链式线程池
	public static ThreadPoolExecutor threadpool = new ThreadPoolExecutor(20, 500, 60, TimeUnit.SECONDS, new LinkedBlockingDeque<>(), new ThreadPoolExecutor.CallerRunsPolicy());

	public static String ffmpegPathKey = "EasyMediaFFmpeg";
}
