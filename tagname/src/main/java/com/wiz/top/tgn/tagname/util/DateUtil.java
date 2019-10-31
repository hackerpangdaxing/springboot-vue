package com.wiz.top.tgn.tagname.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * 时间处理帮助类
 * @author linfengda
 * @create 2019-9-16
 * @since 1.0.0
 */
public class DateUtil {
	private static final  Logger LOGGER = LoggerFactory.getLogger(DateUtil.class);	
	public static Date getDate(String source, String pattern){
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		Date result = null;
		try {
			result = sdf.parse(source);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			LOGGER.error(e.toString(),e);
		}
		return result;
	}
	/**
	 * 计算两个时间的时间差
	 * @param start_time
	 * @param end_time
	 * @return
	 */
	public static long getOutputTime(Long start_time,Long end_time) {
		return end_time-start_time;
	}
	
	
	/**将日期转换成秒级时间戳*/
	public static long getDateTime(String source){
		
		long ts=0;
		SimpleDateFormat s=null;
		if(source.length() == 14){
			s = new SimpleDateFormat("yyyyMMddHHmmss");
		}else if(source.length() == 12){
			s = new SimpleDateFormat("yyyyMMddHHmm");
		}else if(source.length() == 10){
			s = new SimpleDateFormat("yyyyMMddHH");
		}else if(source.length() == 8){
			s = new SimpleDateFormat("yyyyMMdd");
		}else if(source.length() == 6){
			s = new SimpleDateFormat("yyyyMM");
		}else if(source.length() == 4){
			s = new SimpleDateFormat("yyyy");
		}

		try {

			Date date=s.parse(source);
			ts=date.getTime()/1000;
		} catch (Exception e) {
			LOGGER.error(e.toString(),e);
		}
		return ts;
	}
	
	/**
	 * 校验时间类型和时间格式
	 * @param time
	 * @param timeType
	 * @return
	 */
	public static boolean isValidDates(String time,String timeType){
		boolean result = true;
		SimpleDateFormat s=null;
		switch (timeType) {
		case "s":
			s = new SimpleDateFormat("yyyyMMddHHmmss");
			break;
		case "mi":
			s = new SimpleDateFormat("yyyyMMddHHmm");
			break;
		case "h":
			s = new SimpleDateFormat("yyyyMMddHH");
			break;
		case "d":
			s = new SimpleDateFormat("yyyyMMdd");
			break;
		case "mo":
			s = new SimpleDateFormat("yyyyMM");
			break;
		case "y":
			s = new SimpleDateFormat("yyyy");
			break;
		default:
			break;
		}
		Date date = null;
		try {
			date=s.parse(time);
			LOGGER.debug(""+date.toString());
			
		} catch (Exception e1) {
			//不能转换  传入时间参数有误直接抛异常
			result=false;
		}
		return result;
	}
	/**
	 * 
	 * @param src
	 * @param fromFormat
	 * @param toFormat
	 * @return
	 * @throws ParseException
	 */
	public static String format(String src,String fromFormat,String toFormat) throws ParseException{
		SimpleDateFormat fromSdf = new SimpleDateFormat(fromFormat);
		Date fromDate = fromSdf.parse(src);
		SimpleDateFormat targetSdf = new SimpleDateFormat(toFormat);
		return targetSdf.format(fromDate);
		
	}
	
	/**
	 * 
	 * @param format
	 * @return
	 */
	public static String formatNow(String format){
		SimpleDateFormat targetSdf = new SimpleDateFormat(format);
		return targetSdf.format(new Date());
	}
	
	/**
	 * 
	 * @param src
	 * @param format
	 * @return
	 * @throws ParseException
	 */
	public static Date  parse(String src,String format) throws ParseException{
		SimpleDateFormat targetSdf = new SimpleDateFormat(format);
		return targetSdf.parse(src);
	}
	
	/**
	 不带‘-’或‘：’或‘ ’ <br>
	 不能带杠，冒号，空格，而且必须14位：e.g : 20161213164858是合法的；<br>
	 这个是超级精确的校验<br>
	 * @param date  e.g 20200229164859
	 * @return
	 */
	public static boolean isValidDate(String date) {
		String timeRegex = "^((([0-9]{3}[1-9]|[0-9]{2}[1-9][0-9]{1}|[0-9]{1}[1-9][0-9]{2}|[1-9][0-9]{3})(((0[13578]|1[02])(0[1-9]|[12][0-9]|3[01]))|((0[469]|11)(0[1-9]|[12][0-9]|30))|(02(0[1-9]|[1][0-9]|2[0-8]))))|((([0-9]{2})(0[48]|[2468][048]|[13579][26])|((0[48]|[2468][048]|[3579][26])00))0229))([0-1]?[0-9]|2[0-3])([0-5][0-9])([0-5][0-9])$";
		boolean result = Pattern.matches(timeRegex, date);
		return result;
	}
	
	/**
	 * 启停功能，截取Top
	 * @param equip_name_
	 * @return
	 */
	public static String getTop(String equip_name_) {
		String topName="";
		if(equip_name_.subSequence(0, 1).equals("#")) {
			topName=equip_name_.substring(0, 2);
		}else if (Pattern.matches("\\d", equip_name_.subSequence(0, 1))) {
			topName=equip_name_.substring(0, 2);
		}else if (Pattern.matches("[A-Z]", equip_name_.subSequence(0, 1))) {
			topName=equip_name_.substring(0, 1);
		}else {
			topName=equip_name_;
		}
		return topName;
	}
	
	
}

