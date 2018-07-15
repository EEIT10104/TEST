package eeit.model;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
@Entity
@Table(name="RegisterForms")
public class RegisterBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer  registerSeasonId;
	
//	@Transient
//	private SeasonBean seasonBean;
//	@Transient
//	private TeamBean teamBean;
	
	private Integer  seasonId;
	private Integer  teamId;
	private boolean  paymentComplete;
	private boolean  playerComplete;
	private boolean  registerSuccess;
	private Date registerSuccessTime;
	private String registerNumber;
	
	
	
	public RegisterBean() {
		super();
		
	}
	public RegisterBean(Integer registerSeasonId, Integer seasonId, Integer teamId, boolean paymentComplete,
			boolean playerComplete, boolean registerSuccess, Date registerSuccessTime ,String registerNumber) {
		super();
		this.registerSeasonId = registerSeasonId;
		this.seasonId = seasonId;
		this.teamId = teamId;
		this.paymentComplete = paymentComplete;
		this.playerComplete = playerComplete;
		this.registerSuccess = registerSuccess;
		this.registerSuccessTime = registerSuccessTime;
		this.registerNumber = registerNumber;
	}  
	public Integer getRegisterSeasonId() {
		return registerSeasonId;
	}
	public void setRegisterSeasonId(Integer registerSeasonId) {
		this.registerSeasonId = registerSeasonId;
	}
	public Integer getSeasonId() {
		return seasonId;
	}
	public void setSeasonId(Integer seasonId) {
		this.seasonId = seasonId;
	}
	public Integer getTeamId() {
		return teamId;
	}
	public void setTeamId(Integer teamId) {
		this.teamId = teamId;
	}
	public boolean isPaymentComplete() {
		return paymentComplete;
	}
	public void setPaymentComplete(boolean paymentComplete) {
		this.paymentComplete = paymentComplete;
	}
	public boolean isPlayerComplete() {
		return playerComplete;
	}
	public void setPlayerComplete(boolean playerComplete) {
		this.playerComplete = playerComplete;
	}
	public boolean isRegisterSuccess() {
		return registerSuccess;
	}
	public void setRegisterSuccess(boolean registerSuccess) {
		this.registerSuccess = registerSuccess;
	}
	public Date getRegisterSuccessTime() {
		return registerSuccessTime;
	}
	public void setRegisterSuccessTime(Date registerSuccessTime) {
		this.registerSuccessTime = registerSuccessTime;
	}
	public String getRegisterNumber() {
		return registerNumber;
	}
	public void setRegisterNumber(String registerNumber) {
		this.registerNumber = registerNumber;
	}
	
	
	
	
}
