package cn.rc.flow.common.utils;

import java.util.UUID;

public class UUIDUtil {
	private UUIDUtil() {}

	public static String getUUID(){
		return UUID.randomUUID().toString().replace("-","");
	}
	
}
