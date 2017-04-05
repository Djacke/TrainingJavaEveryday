package com.rescde.annotation.test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.rescde.annotation.FieldAnnotation;
import com.rescde.annotation.MethodAnnotation;
import com.rescde.annotation.ParameterAnnotation;
import com.rescde.annotation.TypeAnnotation;

@TypeAnnotation("testAnnotationClass")
public class TestDefinedAnnotation {

	@FieldAnnotation(value="chenjq5",defaultValue=2,name="jinhua feng")
	public String name;
	
	@MethodAnnotation("mymethod")
	public void getMethodName(@ParameterAnnotation String name){
		System.out.println(name);
	}
	private void print(){
		System.out.println("this is a test print method....");
	}
	
	private void invokeMethod(TestDefinedAnnotation testAnn){
		try {
			Class cls = testAnn.getClass();
			Method m = cls.getDeclaredMethod("getMethodName",String.class);
			Method m2 = cls.getDeclaredMethod("print");
			m.invoke(testAnn,"111");
			m2.invoke(testAnn);
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		
		TestDefinedAnnotation testAnn = new TestDefinedAnnotation();
		testAnn.invokeMethod(testAnn);
		/*TestDefinedAnnotation testAnn = new TestDefinedAnnotation();
		testAnn.getMethodName("1");
		TypeAnnotation typeAnn = TestDefinedAnnotation.class.getAnnotation(TypeAnnotation.class);
		System.out.println("the class annotation is:" + typeAnn.value());
		
		Field[] fields = TestDefinedAnnotation.class.getDeclaredFields();
		Method[] methods = TestDefinedAnnotation.class.getDeclaredMethods();
		for(Field f : fields){
			if(f.isAnnotationPresent(FieldAnnotation.class)){
				FieldAnnotation fieldAnn = (FieldAnnotation)f.getAnnotation(FieldAnnotation.class);
				System.out.println("field annotation is:" + fieldAnn.name());
				System.out.println("field annotation is:" + fieldAnn.value());
				System.out.println("field annotation is:" + fieldAnn.defaultValue()[0]);
			}
		}
		for(Method m : methods){
			System.out.println("parameter type:" + m.getName());
			Annotation[][] ann_p = m.getParameterAnnotations();
			for(Annotation[] ann_p_arr : ann_p){
				for(Annotation arr_ann : ann_p_arr){
					ParameterAnnotation param = (ParameterAnnotation)arr_ann;
					System.out.println(param.value());
				}
			}
			if(m.isAnnotationPresent(MethodAnnotation.class)){
				MethodAnnotation methodAnn = (MethodAnnotation)m.getAnnotation(MethodAnnotation.class);
				System.out.println("method annotation is:" + methodAnn.value());
			}
			
		}*/
	}

}
