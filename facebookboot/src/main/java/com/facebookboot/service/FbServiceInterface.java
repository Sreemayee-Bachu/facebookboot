package com.facebookboot.service;

import com.facebookboot.entity.FbUser;

public interface FbServiceInterface {
	public FbUser createProfileService(FbUser fu);

	public int deleteProfileService(long id);
	
	//public int updateProfileService(String name,String e,String p, String a,long id);
}
