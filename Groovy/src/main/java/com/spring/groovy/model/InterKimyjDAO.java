package com.spring.groovy.model;

import java.util.List;
import java.util.Map;

public interface InterKimyjDAO {

	// 사내 캘린더의 소분류인 일정 이름 존재 여부 알아오기
	int existComCalendar(String scname);

	// 사내 캘린더에 캘린더 소분류 추가하기
	int addComCalendar(Map<String, String> paraMap) throws Throwable;
	
	// 내 캘린더의 소분류인 일정 이름 존재 여부 알아오기
	int existMyCalendar(Map<String, String> paraMap);

	// 내 캘린더에 캘린더 소분류 추가하기
	int addMyCalendar(Map<String, String> paraMap) throws Throwable;

	// 사내 캘린더에 사내캘린더 소분류  보여주기 
	List<Calendar_small_category_VO> showCompanyCalendar();

	// 내 캘린더에서 내캘린더 소분류  보여주기
	List<Calendar_small_category_VO> showMyCalendar(String fk_empnum);

	// 일정 등록시 내캘린더,사내캘린더 선택에 따른 서브캘린더 종류를 알아오기
	List<Calendar_small_category_VO> selectSmallCategory(Map<String, String> paraMap);

	// 공유자를 찾기 위한 특정글자가 들어간 회원명단 불러오기
	List<EmployeeVO> searchJoinUserList(String joinUserName);

	// 일정 등록하기
	int registerSchedule_end(Calendar_schedule_VO scheduleVO) throws Throwable;

	// 등록된 일정 가져오기
	List<Calendar_schedule_VO> selectSchedule(String fk_empnum);

	// 일정 상세 보기 
	Map<String,String> detailSchedule(String pk_scheduleno);

	// 일정삭제하기
	int deleteSchedule(String pk_scheduleno) throws Throwable;

	// 일정수정하기
	int editSchedule_end(Calendar_schedule_VO svo) throws Throwable;

	// (사내캘린더 또는 내캘린더)속의  소분류 카테고리인 서브캘린더 삭제하기 
	int deleteSubCalendar(String pk_smcatgono) throws Throwable;

	// (사내캘린더 또는 내캘린더)속의 소분류 카테고리인 서브캘린더 수정하기 
	int editCalendar(Map<String, String> paraMap);

	// 수정된 (사내캘린더 또는 내캘린더)속의 소분류 카테고리명이 이미 해당 사용자가 만든 소분류 카테고리명으로 존재하는지 유무 알아오기  
	int existsCalendar(Map<String, String> paraMap);

	// 총 일정 검색 건수(totalCount)
	int getTotalCount(Map<String, String> paraMap);

	// 페이징 처리한 캘린더 가져오기(검색어가 없다라도 날짜범위 검색은 항시 포함된 것임)
	List<Map<String,String>> scheduleListSearchWithPaging(Map<String, String> paraMap);

	int voteNoDelete(Map<String, String> paraMap);

	int voteUndefinedDelete(Map<String, String> paraMap);
	
	int voteYesDelete(Map<String, String> paraMap);

	int voteYesAdd(Map<String, String> paraMap);

	int voteNoAdd(Map<String, String> paraMap);

	int voteUndefinedAdd(Map<String, String> paraMap);

	Map<String, String> voteTotalLoginCnt(Map<String, String> paraMap);

	Map<String, String> voteTotalCnt(Map<String, String> paraMap);

	List<Map<String, String>> voteYesUser(Map<String, String> paraMap);

	List<Map<String, String>> voteNoUser(Map<String, String> paraMap);

	List<Map<String, String>> voteUndefinedUser(Map<String, String> paraMap);

	int commentAdd(Map<String, String> paraMap);

	List<Map<String, String>> commentShow(Map<String, String> paraMap);

	int commentEdit(Map<String, String> paraMap);

	int commentDel(Map<String, String> paraMap);

	int scheduleDel(Map<String, String> paraMap);

	int getCommentTotalPage(Map<String, String> paraMap);

	List<Map<String, String>> selectVacationlist();

	
	

}//end of public interface InterKimyjDAO
