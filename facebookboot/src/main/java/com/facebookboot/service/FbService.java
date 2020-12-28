package com.facebookboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.facebookboot.dao.FbDaoInterface;
import com.facebookboot.entity.FbUser;

@Service
public class FbService implements FbServiceInterface{
	@Autowired
	private FbDaoInterface fd;
	
	public FbUser createProfileService(FbUser fu) {
		return fd.save(fu);
	}

	public int deleteProfileService(long id) {
		int i=0;
		if(true) {
			fd.deleteById(id);
			i=1;
		}
		return i;
	}

	
//	public int updateProfileService(String name, String e, String p, String a, long id) {
//		int i=fd.updateProfile(name, e, p, a,id);
//		return i;
//	}
	
}
