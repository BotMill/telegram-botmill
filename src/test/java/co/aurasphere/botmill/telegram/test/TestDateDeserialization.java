/**
 * 
 */
package co.aurasphere.botmill.telegram.test;

import java.util.Calendar;

import co.aurasphere.botmill.telegram.internal.util.json.JsonUtils;

/**
 * @author Donato Rimenti
 * @date Feb 14, 2017
 */
public class TestDateDeserialization {
	
	public static void main(String[] args) {
		
		String json = "{\"field\" : 1234561234567890}";
		TestModel result = JsonUtils.fromJson(json, TestModel.class);
		System.out.println(result.field.toString());
	}
	
	private class TestModel {
		
		public Calendar field;
	}

}
