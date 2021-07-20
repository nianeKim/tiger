package com.ch.tiger.service;

import java.util.List;

import com.ch.tiger.model.Reservation;

public interface ReservationService {
	List<Reservation> selectList(Reservation reservation); // 드라이버 예약 내역에서 리뷰 작성을 위해 본인의 글을 이용한 사람을 찾아내기 위함

	Reservation selectCp(int RSV_num); // 리뷰 작성 이후 다시 드라이버 예약내역 리스트를 불러오기 위해

	int getTotalMyRvs(Reservation reservation); // 탑승자 예약내역에서 내가 신청한 글 리스트를 불러오기
	
}
