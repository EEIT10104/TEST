package allPay.payment.integration.domain;

/**
 * �d�߭q�檫��
 * @author mark.chiu
 *
 */
public class QueryTradeInfoObj {
	
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
	 * TimeStamp
	 * ���Үɶ�
	 */
	private String TimeStamp = "";
	
	/**
	 * PlatformID
	 * �S���X�@���x�ӥN��(��allPay����)
	 */
	private String PlatformID = "";
	
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
	 * ���oTimeStamp ���Үɶ�
	 * @return TimeStamp
	 */
	public String getTimeStamp() {
		return TimeStamp;
	}
	/**
	 * �]�wTimeStamp ���Үɶ�
	 * @param timeStamp
	 */
	public void setTimeStamp(String timeStamp) {
		TimeStamp = timeStamp;
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
	@Override
	public String toString() {
		return "QueryTradeInfoObj [MerchantID=" + MerchantID + ", MerchantTradeNo=" + MerchantTradeNo + ", TimeStamp="
				+ TimeStamp + ", PlatformID=" + PlatformID + "]";
	}
}
