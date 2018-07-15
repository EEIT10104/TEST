package allPay.payment.integration.domain;

/**
 * �|���ӽм���/�h�ڪ���
 * @author mark.chiu
 *
 */
public class CaptureObj {
	
	/**
	 * MerchantID
	 * �|���s��(��allPay����)
	 */
	private String MerchantID = "";
	
	/**
	 * MerchantTradeNo
	 * �|������s��
	 */
	private String MerchantTradeNo = "";
	
	/**
	 * CaptureAMT
	 * �|���ӽм��ڪ��B
	 */
	private String CaptureAMT = "";
	
	/**
	 * UserRefundAMT
	 * �n�h�ڵ��R�誺���B
	 */
	private String UserRefundAMT = "";
	
	/**
	 * PlatformID
	 * �S���X�@���x�ӥN��(��allPay����)
	 */
	private String PlatformID = "";
	
	/**
	 * UpdatePlatformChargeFee
	 * �O�_���S���X�@���x�Ӥ���O
	 */
	private String UpdatePlatformChargeFee = "";
	
	/**
	 * PlatformChargeFee
	 * �S���X�@���x�Ӥ���O
	 */
	private String PlatformChargeFee = "";
	
	/**
	 * Remark
	 * �Ƶ�
	 */
	private String Remark = "";
	
	/********************* getters and setters *********************/
	
	/**
	 * ���oMerchantID �|���s��(��allPay����)
	 * @return MerchantID
	 */
	public String getMerchantID() {
		return MerchantID;
	}
	/**
	 * �]�wMerchantID �|���s��(��allPay����)
	 * @param merchantID
	 */
	public void setMerchantID(String merchantID) {
		MerchantID = merchantID;
	}
	/**
	 * ���oMerchantTradeNo �|������s��
	 * @return MerchantTradeNo
	 */
	public String getMerchantTradeNo() {
		return MerchantTradeNo;
	}
	/**
	 * �]�wMerchantTradeNo �|������s��
	 * @param merchantTradeNo
	 */
	public void setMerchantTradeNo(String merchantTradeNo) {
		MerchantTradeNo = merchantTradeNo;
	}
	/**
	 * ���oCaptureAMT �|���ӽм��ڪ��B
	 * @return CaptureAMT
	 */
	public String getCaptureAMT() {
		return CaptureAMT;
	}
	/**
	 * �]�wCaptureAMT �|���ӽм��ڪ��B
	 * @param captureAMT
	 */
	public void setCaptureAMT(String captureAMT) {
		CaptureAMT = captureAMT;
	}
	/**
	 * ���oUserRefundAMT �n�h�ڵ��R�誺���B
	 * @return UserRefundAMT
	 */
	public String getUserRefundAMT() {
		return UserRefundAMT;
	}
	/**
	 * �]�wUserRefundAMT �n�h�ڵ��R�誺���B
	 * @param userRefundAMT
	 */
	public void setUserRefundAMT(String userRefundAMT) {
		UserRefundAMT = userRefundAMT;
	}
	/**
	 * ���oPlatformID �S���X�@���x�ӥN��(��allPay����)
	 * @return PlatformID
	 */
	public String getPlatformID() {
		return PlatformID;
	}
	/**
	 * �]�wPlatformID �S���X�@���x�ӥN��(��allPay����)
	 * @param platformID
	 */
	public void setPlatformID(String platformID) {
		PlatformID = platformID;
	}
	/**
	 * ���oUpdatePlatformChargeFee �O�_���S���X�@���x�Ӥ���O
	 * @return UpdatePlatformChargeFee
	 */
	public String getUpdatePlatformChargeFee() {
		return UpdatePlatformChargeFee;
	}
	/**
	 * �]�wUpdatePlatformChargeFee �O�_���S���X�@���x�Ӥ���O
	 * @param updatePlatformChargeFee
	 */
	public void setUpdatePlatformChargeFee(String updatePlatformChargeFee) {
		UpdatePlatformChargeFee = updatePlatformChargeFee;
	}
	/**
	 * ���oPlatformChargeFee �S���X�@���x�Ӥ���O
	 * @return PlatformChargeFee
	 */
	public String getPlatformChargeFee() {
		return PlatformChargeFee;
	}
	/**
	 * �]�wPlatformChargeFee �S���X�@���x�Ӥ���O
	 * @param platformChargeFee
	 */
	public void setPlatformChargeFee(String platformChargeFee) {
		PlatformChargeFee = platformChargeFee;
	}
	/**
	 * ���oRemark �Ƶ�
	 * @return Remark
	 */
	public String getRemark() {
		return Remark;
	}
	/**
	 * �]�wRemark �Ƶ�
	 * @param remark
	 */
	public void setRemark(String remark) {
		Remark = remark;
	}
	@Override
	public String toString() {
		return "CaptureObj [MerchantID=" + MerchantID + ", MerchantTradeNo=" + MerchantTradeNo + ", CaptureAMT="
				+ CaptureAMT + ", UserRefundAMT=" + UserRefundAMT + ", PlatformID=" + PlatformID
				+ ", UpdatePlatformChargeFee=" + UpdatePlatformChargeFee + ", PlatformChargeFee=" + PlatformChargeFee
				+ ", Remark=" + Remark + "]";
	}
}
