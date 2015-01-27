package com.suanming.utils.base;


import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;
import java.util.TreeMap;

/**
 * 
 * @ClassName: PropertyUtil
 * @Description: 属性文件操作类
 * @author Kevin
 * @date 2013年9月25日 下午1:24:56
 * 
 */
public class PropertyUtil {

	/**
	 * 
	 * @Title: getMapByPropertyFile
	 * @Description: 读取属性文件 返回Map
	 * @param @param propertyFile
	 * @param @return 设定文件
	 * @return Map<String,String> 返回类型
	 * @throws
	 */
	public static Map<String, String> getMapByPropertyFile(String propertyFile) {

		Properties prop = new Properties();
		Map<String, String> propMap = new TreeMap<String, String>();
		InputStream in = PropertyUtil.class.getResourceAsStream("/" + propertyFile);
		try {
			prop.load(new InputStreamReader(in,"utf-8"));
			Set<Object> keyset = prop.keySet();
			for (Object object : keyset) {
				propMap.put(object.toString(),
						prop.getProperty(object.toString()).toString());
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return propMap;
	}

	/**
	 * 
	 * @Title: getKeyByValue
	 * @Description: 根据Map中的value获取key值
	 * @param @param map
	 * @param @param value
	 * @param @return 设定文件
	 * @return String 返回类型
	 * @throws
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static String getKeyByValue(String value,String propertyFile) {
		Map<String, String> map = getMapByPropertyFile(propertyFile);
		String valueString = "";
		Set<Entry<String, String>> entrySet = map.entrySet();
		for (Iterator iterator = entrySet.iterator(); iterator.hasNext();) {
			Entry<String, String> entry = (Entry<String, String>) iterator
					.next();
			if (value.equals(entry.getValue())) {
				valueString = entry.getKey();
			}
		}
		return valueString;
	}

	/**
	 * 取得属性值
	 * 
	 * @param key
	 *            属性名
	 * @return 属性值
	 */
	public static String getValue(String key, String propertyFile) {

		Properties prop = new Properties();
//		Map<String, String> propMap = new TreeMap<String, String>();
		InputStream in = PropertyUtil.class.getResourceAsStream("/" + propertyFile);
		try {
			prop.load(new InputStreamReader(in,"utf-8"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prop.getProperty(key);
	}
}
