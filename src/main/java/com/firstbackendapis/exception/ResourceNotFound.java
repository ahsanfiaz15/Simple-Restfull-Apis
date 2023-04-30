package com.firstbackendapis.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class ResourceNotFound extends RuntimeException {
 
  public static final long serialVersionID=1L;	
  private String fieldName;
  private String  resourceName;
  private Object  fieldValue;
public ResourceNotFound(String fieldName, String resourceName, Object fieldValue) {
	super(String.format("%s not found with %s: '%s' ",resourceName,fieldName,fieldValue));
	
	this.fieldName = fieldName;
	this.resourceName = resourceName;
	this.fieldValue = fieldValue;
}
public String getFieldName() {
	return fieldName;
}
public void setFieldName(String fieldName) {
	this.fieldName = fieldName;
}
public String getResourceName() {
	return resourceName;
}
public void setResourceName(String resourceName) {
	this.resourceName = resourceName;
}
public Object getFieldValue() {
	return fieldValue;
}
public void setFieldValue(Object fieldValue) {
	this.fieldValue = fieldValue;
}
  
}