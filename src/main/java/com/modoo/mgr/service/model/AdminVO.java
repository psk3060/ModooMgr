package com.modoo.mgr.service.model;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
@SuppressWarnings("unused")
/**
 * 관리자 VO 
 */
public class AdminVO implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8186612789283729754L;

	/**
	 * 관리자 순번
	 */
	private Integer adminSeq;
	
	/**
	 * 관리자ID
	 */
	private String adminId;
	
	/**
	 * 관리자 비밀번호
	 */
	private String adminPwd;
	
	/**
	 * 관리자 휴대전화
	 */
	private String adminPhone;
	
	/**
	 * 관리자 권한
	 */
	private String adminRole;
	
	/**
	 * 관리자 등록일시
	 */
	private Date regDate;
	
	/**
	 * 관리자 사용 여부
	 */
	private String useYn;
	
	/**
	 * 마지막 수정일시
	 */
	private Date lastModifyDate;
	
	/**
	 * 마지막 접속 일시
	 */
	private Date lastConnDate;
	
	/**
	 * 마지막 접속 IP
	 */
	private String lastConnIp;
	
	
	/**
	 * 관리자 EMAIL
	 */
	private String adminEmail;
	
	/**
	 * 관리자 메모
	 */
	private String adminMemo;
	
}
