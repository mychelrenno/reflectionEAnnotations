package br.com.mychelrenno.reflectionEAnnotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import br.com.mychelrenno.reflectionEAnnotations.model.Pessoa;

public class Main {

	public static void main(String[] args) {
		Class<Pessoa> p = Pessoa.class;
		
//		System.out.println(p.getName());
//		Method[] m = p.getDeclaredMethods();
//		for (Method _m : m) {
//			System.out.println(_m.getName());
//		}
//		Field[] f = p.getDeclaredFields();
//		for (Field _f : f) {
//			System.out.println(_f.getName());
//		}
		
		Annotation[] a = p.getAnnotations();
		for (Annotation _a : a) {
			System.out.println(_a.annotationType());
		}
	}
}
