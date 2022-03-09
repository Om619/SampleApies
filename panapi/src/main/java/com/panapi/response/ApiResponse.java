package com.panapi.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import ch.qos.logback.core.status.Status;

public class ApiResponse {
	
	private String Status;
	private String ErrorCode;
	private String MessageType;
	private String tsTransld;
	private String Message;
	private String xml;
    private PanModel msg;
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public String getErrorCode() {
		return ErrorCode;
	}
	public void setErrorCode(String errorCode) {
		ErrorCode = errorCode;
	}
	public String getMessageType() {
		return MessageType;
	}
	public void setMessageType(String messageType) {
		MessageType = messageType;
	}
	public String getTsTransld() {
		return tsTransld;
	}
	public void setTsTransld(String tsTransld) {
		this.tsTransld = tsTransld;
	}
	public String getMessage() {
		return Message;
	}
	public void setMessage(String message) {
		Message = message;
	}
	public String getXml() {
		return xml;
	}
	public void setXml(String xml) {
		this.xml = xml;
	}
	public PanModel getMsg() {
		return msg;
	}
	public void setMsg(PanModel msg) {
		this.msg = msg;
	}
	public ApiResponse(@JsonProperty("Status") String status,@JsonProperty("ErrorCode") String errorCode,@JsonProperty("MessageType") String messageType,@JsonProperty("tsTransId") String tsTransld,@JsonProperty("Message") String message,
			@JsonProperty("xml") String xml,@JsonProperty("msg") PanModel msg) {
		super();
		Status = status;
		ErrorCode = errorCode;
		MessageType = messageType;
		this.tsTransld = tsTransld;
		Message = message;
		this.xml = xml;
		this.msg = msg;
	}
	public ApiResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ApiResponse [Status=" + Status + ", ErrorCode=" + ErrorCode + ", MessageType=" + MessageType
				+ ", tsTransld=" + tsTransld + ", Message=" + Message + ", xml=" + xml + ", msg=" + msg + "]";
	}
    
}
