package eeit.model;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

@XmlRootElement
@Entity
@Table(name="Seasons")
public class SeasonBean implements Serializable {
	private static final long serialVersionUID = 1L;
		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Basic(optional = false)
	    @Column(name = "SeasonId", nullable = false)
	private Integer seasonId;
	private String seasonName;
	private String location;
	private Integer locationSum;
	private Date seasonStartDate;
	private Date seasonEndDate;
	private Date seasonRegisterStart;
	private Date seasonRegisterEnd;
	private String competitionSystem;
	private String seasonGroup;
	private Integer teamMax;
	private Integer teamMin;
	private Integer playerMax;
	private Integer playerMin;
	private Integer payment;
	private Date  paymentDeadline;
	private Integer teamSum;
	
	
	
	public static void main(String[] args) {
		StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().configure().build();
		SessionFactory factory = new MetadataSources(serviceRegistry).buildMetadata().buildSessionFactory();
		
		
		Session session = factory.openSession();
		Transaction trx = session.beginTransaction();
		
		SeasonBean bean = new SeasonBean();
		bean.setLocation("xxx");
		bean.setLocationSum(4);
		
		System.out.println(bean);
		session.save(bean);
		
		
		trx.commit();
		session.close();
		factory.close();
		
		
	}


	@Override
	public String toString() {
		return "SeasonBean [seasonId=" + seasonId + ", seasonName=" + seasonName + ", location=" + location
				+ ", locationSum=" + locationSum + ", seasonStartDate=" + seasonStartDate + ", seasonEndDate="
				+ seasonEndDate + ", seasonRegisterStart=" + seasonRegisterStart + ", seasonRegisterEnd="
				+ seasonRegisterEnd + ", competitionSystem=" + competitionSystem + ", seasonGroup=" + seasonGroup
				+ ", teamMax=" + teamMax + ", teamMin=" + teamMin + ", playerMax=" + playerMax + ", playerMin="
				+ playerMin + ", payment=" + payment + ", paymentDeadline=" + paymentDeadline + ", teamSum=" + teamSum
				+ "]";
	}



	public SeasonBean() {
		super();
		
	}

	
	
	public Integer getSeasonId() {
		return seasonId;
	}
	
	public void setSeasonId(Integer seasonId) {
		this.seasonId = seasonId;
	}
	public String getSeasonName() {
		return seasonName;
	}
	public void setSeasonName(String seasonName) {
		this.seasonName = seasonName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Integer getLocationSum() {
		return locationSum;
	}
	public void setLocationSum(Integer locationSum) {
		this.locationSum = locationSum;
	}
	public Date getSeasonStartDate() {
		return seasonStartDate;
	}
	public void setSeasonStartDate(Date seasonStartDate) {
		this.seasonStartDate = seasonStartDate;
	}
	public Date getSeasonEndDate() {
		return seasonEndDate;
	}
	public void setSeasonEndDate(Date seasonEndDate) {
		this.seasonEndDate = seasonEndDate;
	}
	public Date getSeasonRegisterStart() {
		return seasonRegisterStart;
	}
	public void setSeasonRegisterStart(Date seasonRegisterStart) {
		this.seasonRegisterStart = seasonRegisterStart;
	}
	public Date getSeasonRegisterEnd() {
		return seasonRegisterEnd;
	}
	public void setSeasonRegisterEnd(Date seasonRegisterEnd) {
		this.seasonRegisterEnd = seasonRegisterEnd;
	}
	public String getCompetitionSystem() {
		return competitionSystem;
	}
	public void setCompetitionSystem(String competitionSystem) {
		this.competitionSystem = competitionSystem;
	}
	public String getSeasonGroup() {
		return seasonGroup;
	}
	public void setSeasonGroup(String seasonGroup) {
		this.seasonGroup = seasonGroup;
	}
	public Integer getTeamMax() {
		return teamMax;
	}
	public void setTeamMax(Integer teamMax) {
		this.teamMax = teamMax;
	}
	public Integer getTeamMin() {
		return teamMin;
	}
	public void setTeamMin(Integer teamMin) {
		this.teamMin = teamMin;
	}
	public Integer getPlayerMax() {
		return playerMax;
	}
	public void setPlayerMax(Integer playerMax) {
		this.playerMax = playerMax;
	}
	public Integer getPlayerMin() {
		return playerMin;
	}
	public void setPlayerMin(Integer playerMin) {
		this.playerMin = playerMin;
	}
	public Integer getPayment() {
		return payment;
	}
	public void setPayment(Integer payment) {
		this.payment = payment;
	}
	public Date getPaymentDeadline() {
		return paymentDeadline;
	}
	public void setPaymentDeadline(Date paymentDeadline) {
		this.paymentDeadline = paymentDeadline;
	}
	public Integer getTeamSum() {
		return teamSum;
	}
	public void setTeamSum(Integer teamSum) {
		this.teamSum = teamSum;
	}
	
}
