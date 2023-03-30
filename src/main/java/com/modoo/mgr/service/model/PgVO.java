package com.modoo.mgr.service.model;

import java.util.Date;


/**
 * 결제내역 VO 
 */
public class PgVO {
	
	/**
	 * 결제 순번
	 */
	private Integer pgSeq;
	
	/**
	 * 결제 번호(고객 노출)
	 */
	private String pgNo;
	
	/**
	 * 결제대행(PG)사 코드
	 */
	private String pgCode;
	
	/**
	 * 결제 방식
	 */
	private String pgMethod;
	
	private String pgStatus;
	
	private Integer amt;
	
	private Double cash;
	
	private String userId;
	
	private String useYn;
	
	private Date regDate;
	
	/**
	 * 실제 결제일시 
	 * - 결제와 동시에 저장되거나
	 * - 선입금(무통장)한 이후 결제 신청을 하거나
	 * - 가상계좌를 사용할 경우 거래내역 생성 일시와 실제 결제가 된 일시가 다를 수 있으므로
	 */
	private Date paymentDate;
	
	/**
	 * PG사 결제코드
	 */
	private String rsltCode;
	
	/**
	 * PG사에서 사용하는 고유식별 코드
	 */
	private String pgIdentifCode;
	
	/**
	 * 가상계좌 계좌번호
	 */
	private String vBankAccNo;
	
	/**
	 * 가상계좌 은행 코드
	 */
	private String vBankCode;
	
	/**
	 * 가상계좌 은행명
	 */
	private String vBankName;
	
	/**
	 * 가상계좌 입금자 명
	 */
	private String vBankDepositorName;
	
	/**
	 * 가상계좌 만료일시
	 */
	private Date vBankAccExpireDate;
	
	/**
	 * 환불 결제 번호
	 */
	private String refPgNo;
	
	/**
	 * 환불 금액
	 */
	private Integer refAmt;
	
	/**
	 * 환불 캐시
	 */
	private Double refCash;
	
	/**
	 * 환불 또는 수동 생성 진행한 관리자ID
	 */
	private String approvalAdminId;
	
	/**
	 * 거래내역 등록 방식
	 * - 고객 - 웹, 모바일
	 * - 관리자 수동
	 */
	private String regMethod;
	
}
