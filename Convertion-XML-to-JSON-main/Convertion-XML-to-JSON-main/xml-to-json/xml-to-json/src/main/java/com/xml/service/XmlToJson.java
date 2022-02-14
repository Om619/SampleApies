package com.xml.service;


import org.json.JSONObject;
import org.json.XML;

import com.fasterxml.jackson.databind.util.JSONPObject;

public class XmlToJson {
	

	
	public static void main(String[] args) {
		String xmlString ="<Students>\r\n"
				+ "    <First-Name>Rajesh</First-Name>\r\n"
				+ "    <Last-Name>Kumar</Last-Name>\r\n"
				+ "    <Age>24</Age>\r\n"
				+ "    <Roll-Number>101</Roll-Number>\r\n"
				+ "</Students>";
		JSONObject jsonpObject = XML.toJSONObject(xmlString);
		System.out.println(jsonpObject);
	}



}
