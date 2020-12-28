package com.facebookboot.dao;

import java.util.List;

import javax.transaction.Transactional;
import javax.websocket.server.PathParam;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.facebookboot.entity.FbUser;

@Repository
public interface FbDaoInterface extends JpaRepository<FbUser, Long>{
//	@Modifying
//	@Transactional
//	@Query("update FbUser c set c.username=:name,c.email=e,c.password=p,c.address=a where c.uId=:id")
//	public int updateProfile(String name,String e,String p,String a,long id);
}
