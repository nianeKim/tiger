package com.ch.tiger.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ch.tiger.service.PagingBean;
import com.ch.tiger.model.Carpool;
import com.ch.tiger.model.Member;
import com.ch.tiger.service.CarpoolService;
import com.ch.tiger.service.MemberService;


@Controller
public class CarpoolController {
	
	@Autowired
	private CarpoolService cps;
	@Autowired
	private MemberService mbs;
	
	// 타세요 리스트
	@RequestMapping("cpList")
	public String list(Carpool carpool, String pageNum, Model model) {
		if (pageNum == null || pageNum.equals(""))
			pageNum = "1";
		int currentPage = Integer.parseInt(pageNum);
		int rowPerPage = 10; // 한 화면에 보여주는 게시글 갯수
		int total = cps.getTotal(carpool);
		int startRow = (currentPage - 1) * rowPerPage + 1;
		int endRow = startRow + rowPerPage - 1;
		carpool.setStartRow(startRow);
		carpool.setEndRow(endRow);
		List<Carpool> carpoolList = cps.carpoolList(carpool);
		int num = total - startRow + 1;
		PagingBean pb = new PagingBean(currentPage, rowPerPage, total);
		model.addAttribute("num", num);
		model.addAttribute("carpool", carpool);
		model.addAttribute("pb", pb);
		model.addAttribute("carpoolList", carpoolList);
		return "/carpool/cpList";
	}
	
	// 타세요 작성폼
	@RequestMapping("cpWriteForm")
	public String cpWriteForm(Member member, String pageNum, Model model){
		model.addAttribute("member", member);
		model.addAttribute("pageNum", pageNum);
		return "/carpool/cpWriteForm";
	}
	
	// 타세요 작성폼 결과 안내
	@RequestMapping("cpWriteResult")
	public String cpWriteResult(Carpool carpool, String pageNum, Model model) throws Exception {
		int number = cps.getMaxNum(); // 게시글 글번호 생성
		carpool.setCP_num(number);
		int result = cps.insert(carpool);
		model.addAttribute("result", result);
		model.addAttribute("pageNum", pageNum);
		return "/carpool/cpWriteResult";
	}
}
