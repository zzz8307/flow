package cn.rc.flow.common.utils;

import java.lang.reflect.Field;

/**
 * @author rc
 */
public class ObjectUtil {
    private ObjectUtil() {
    }

    public static boolean isObjectAllFieldsNull(Object object) {
        if (object == null) {
            return true;
        }

        try {
            for (Field field : object.getClass().getDeclaredFields()) {
                field.setAccessible(true);

                if (field.get(object) != null) {
                    return false;
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return true;
    }
}
