package com.ch.tiger.dao;
import java.util.List;

import com.ch.tiger.model.Member;
public interface MemberDao {
	Member select(String MB_id);
	int getMbTotal(Member member);
	List<Member> list(Member member);	

}
