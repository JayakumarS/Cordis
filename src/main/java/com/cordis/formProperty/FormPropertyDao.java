package com.cordis.formProperty;

import com.cordis.core.util.CustomException;

public interface FormPropertyDao {
	public FormPropertyResultBean getFormProperty(String userId) throws CustomException;
	
}
