package allPay.payment.integration.domain;

/**
 * �|���q���h�ڪ���
 * @author mark.chiu
 *
 */
public class AioChargebackObj {
	
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
	 * TradeNo
	 * allPay������s��
	 */
	private String TradeNo = "";
	
	/**
	 * ChargeBackTotalAmount
	 * �h�ڪ��B
	 */
	private String ChargeBackTotalAmount = "";
	
	/**
	 * Remark
	 * �Ƶ����
	 */
	private String Remark = "";
	
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
	 * ���oTradeNo allPay������s��
	 * @return TradeNo
	 */
	public String getTradeNo() {
		return TradeNo;
	}
	/**
	 * �]�wTradeNo allPay������s��
	 * @param tradeNo
	 */
	public void setTradeNo(String tradeNo) {
		TradeNo = tradeNo;
	}
	/**
	 * ���oChargeBackTotalAmount �h�ڪ��B
	 * @return ChargeBackTotalAmount
	 */
	public String getChargeBackTotalAmount() {
		return ChargeBackTotalAmount;
	}
	/**
	 * �]�wChargeBackTotalAmount �h�ڪ��B
	 * @param chargeBackTotalAmount
	 */
	public void setChargeBackTotalAmount(String chargeBackTotalAmount) {
		ChargeBackTotalAmount = chargeBackTotalAmount;
	}
	/**
	 * ���oRemark �Ƶ����
	 * @return Remark
	 */
	public String getRemark() {
		return Remark;
	}
	/**
	 * �]�wRemark �Ƶ����
	 * @param remark
	 */
	public void setRemark(String remark) {
		Remark = remark;
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
		return "AioChargebackObj [MerchantID=" + MerchantID + ", MerchantTradeNo=" + MerchantTradeNo + ", TradeNo="
				+ TradeNo + ", ChargeBackTotalAmount=" + ChargeBackTotalAmount + ", Remark=" + Remark + ", PlatformID="
				+ PlatformID + "]";
	}
}
