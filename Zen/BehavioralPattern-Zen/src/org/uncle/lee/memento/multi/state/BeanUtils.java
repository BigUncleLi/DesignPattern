package org.uncle.lee.memento.multi.state;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class BeanUtils {
	public static Map<String, Object> getProp(Object bean) {
		Map<String, Object> prop = null;
		try {
			prop = doGetProp(bean);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return prop;
	}

	private static Map<String, Object> doGetProp(Object bean) throws Exception {
		Map<String, Object> prop = new HashMap<>();
		BeanInfo beanInfo = Introspector.getBeanInfo(bean.getClass());
		PropertyDescriptor[] propertyDescriptors = beanInfo
				.getPropertyDescriptors();

		for (PropertyDescriptor propertyDescriptor : propertyDescriptors) {
			addPropIntoMap(bean, propertyDescriptor, prop);
		}
		return prop;
	}

	private static void addPropIntoMap(Object bean,
			PropertyDescriptor propertyDescriptor, Map<String, Object> prop)
			throws Exception {
		String key = propertyDescriptor.getName();
		
		//there will be a class property and exsit one method named getClass() - -o
		if(!key.equalsIgnoreCase("class")){
			Method getter = propertyDescriptor.getReadMethod();
			Object value = getter.invoke(bean, new Object[]{});
			prop.put(key, value);
		}
	}

	public static void resetProp(Object bean, Map<String, Object> prop) {
		try {
			BeanInfo beanInfo = Introspector.getBeanInfo(bean.getClass());
			PropertyDescriptor[] propertyDescriptors = beanInfo
					.getPropertyDescriptors();

			for (PropertyDescriptor propertyDescriptor : propertyDescriptors) {
				resetPropIntoBean(bean, propertyDescriptor, prop);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void resetPropIntoBean(Object bean,
			PropertyDescriptor propertyDescriptor, Map<String, Object> prop)
			throws Exception {
		String key = propertyDescriptor.getName();
		Object value = prop.get(key);

		// this judge must add 
		if(prop.containsKey(key)){
			Method setter = propertyDescriptor.getWriteMethod();
			setter.invoke(bean, value);
		}
	}

}
