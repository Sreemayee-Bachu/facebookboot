package com.facebookboot.controller;

import java.sql.SQLException; 
import java.util.ArrayList; 
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.websocket.server.PathParam;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.facebookboot.dao.FbDaoInterface;
import com.facebookboot.entity.FbUser;
import com.facebookboot.service.FbServiceInterface;

@RestController
public class FbController {
	@Autowired
	private FbServiceInterface fd;
	
	@PostMapping("createFbProfile")
	public String createProfile(@RequestBody FbUser fu) {
		String str="Registration Failed!!!";
		FbUser i=fd.createProfileService(fu);
		if(i!=null) {
			str="Registration Success";
		}
		return str;
	}
	@DeleteMapping("deleteFbProfile")
	public String deleteProfile(@PathParam("id") int id) {
		String str="Profile deletion failed";
	
		int resultDao=fd.deleteProfileService(id);
		if(resultDao>0) {
			str="Profile deleted";
			return str;
		}
		return str;
	}
//	@PutMapping("editprofilefacebook/{name}/{em}/{pass}")
//	public String editProfile(@PathVariable("name") String name,@PathVariable("em") String e,@PathVariable("pass") String p,@PathVariable("add") String a,@PathParam("id") long id) {
//		int i=fd.updateProfileService(name, e, p,a, id);
//		if(i>0)
//			return "Profile edited";
//		else
//			return "Failed!!";
//	}
//	@ResponseStatus(value=HttpStatus.NOT_FOUND, reason="Profile with this id not present")
//    @ExceptionHandler({Exception.class})
//    public void handleException() {
//       
//    }
//	@ExceptionHandler({SQLException.class,DataAccessException.class})
//	  public String databaseError() {
//	    return "Profile with this id not present in your database";
//	  }

//	@GetMapping("viewAllFbProfile")
//	public List<FbUser> viewAllProfile() {
//		List<FbUser> ll=fd.viewAllProfile();
//		return ll;
//	}
//	@GetMapping("viewFbProfile")
//	public List viewProfile(@PathParam("id") String id) {
//		List<FbUser> fs=fd.viewProfileDao(id);
//		return fs;
//	}
//	@GetMapping("searchFbProfile")
//	public List searchProfile(@PathParam("name") String name) {
//		List<FbUser> fs=fd.searchProfileDao(name);
//		return fs;
//	}
}
