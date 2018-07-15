package eeit.repository.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import eeit.model.RegisterBean;
import eeit.model.SeasonBean;
import eeit.repository.SeasonDAO;

@Repository
@SuppressWarnings("unchecked")
public class HibernateSeasonDAOImpl implements SeasonDAO {
	@Autowired
	SessionFactory factory;

	// select all
	@Override
	public List<SeasonBean> getAllSeasons() {
		String hql = "FROM  SeasonBean ORDER BY SEASONID DESC";
		Session session = null;
		List<SeasonBean> list = new ArrayList<>();
		session = factory.getCurrentSession();
		list = session.createQuery(hql).getResultList();

		return list;
	}
	// end

	// select one
	@Override
	public SeasonBean getSeasonById(int seasonId) {
		SeasonBean sb = null;
		Session session = factory.getCurrentSession();
		sb = session.get(SeasonBean.class, seasonId);
		return sb;
	}
	// end

	// updateSeason
	
	@Override
	public void upSeason(SeasonBean upseason) {

		String hql = "UPDATE SeasonBean SET SeasonName =:name,location =:location,locationSum =:locationSum"
				+ ",SeasonStartDate =:startDate,SeasonEndDate =:endDate,SeasonRegisterStart =:registerStart"
				+ ",SeasonRegisterEnd =:registerEnd,CompetitionSystem =:competitionSystem,SeasonGroup =:group"
				+ ",TeamMax =:teamMax ,TeamMin =:teamMin,PlayerMax =:playerMax"
				+ ",PlayerMin =:playerMin,Payment =:payment,PaymentDeadline =:paymentDeadline" + " where seasonId=:id";
		Session session = factory.getCurrentSession();

		int n = session.createQuery(hql).setParameter("id", upseason.getSeasonId())
				.setParameter("name", upseason.getSeasonName()).setParameter("startDate", upseason.getSeasonStartDate())
				.setParameter("endDate", upseason.getSeasonEndDate())
				.setParameter("registerStart", upseason.getSeasonRegisterStart())
				.setParameter("registerEnd", upseason.getSeasonRegisterEnd())
				.setParameter("location", upseason.getLocation()).setParameter("locationSum", upseason.getLocationSum())
				.setParameter("competitionSystem", upseason.getCompetitionSystem())
				.setParameter("group", upseason.getSeasonGroup()).setParameter("teamMax", upseason.getTeamMax())
				.setParameter("teamMin", upseason.getTeamMin()).setParameter("playerMax", upseason.getPlayerMax())
				.setParameter("playerMin", upseason.getPlayerMin()).setParameter("payment", upseason.getPayment())
				.setParameter("paymentDeadline", upseason.getPaymentDeadline()).executeUpdate();

	}
	// end

	// addSeason
	
	@Override
	public void addSeason(SeasonBean newseason) {
		Session session = factory.getCurrentSession();
		//System.out.println(newseason);
		session.save(newseason);

	}
	// end

	// deleteSeason
	@Override
	public void deleteSeason(int seasonId) {
		String hql = "DELETE FROM SeasonBean where seasonId=:id";
		Session session = factory.getCurrentSession();
		int n = session.createQuery(hql).setParameter("id", seasonId).executeUpdate();
	}
	// end

	
	
	
	
	

	// select registerTeam
	@Override
	public List<RegisterBean> getRegisterById(int seasonId) {
		String hql = "FROM  RegisterBean Where seasonId=:id";
//		RegisterBean sb = null;
		List<RegisterBean> list = new ArrayList<>();
		Session session = factory.getCurrentSession();
		list = session.createQuery(hql).setParameter("id", seasonId).getResultList();
		
		return list;
	}
	// end
	
	
	
	
	// updateRegister
	
	@Override
	public void updateRegister(RegisterBean registerBean) {
		String hql = "UPDATE RegisterBean SET PaymentComplete =:paymentComplete,PlayerComplete =:playerComplete"
				+ ",RegisterSuccess =:registerSuccess,RegisterNumber =:registerNumber"
				+ " where registerSeasonId=:id";

		Session session = factory.getCurrentSession();
		
		
		
			if((registerBean.isPaymentComplete()&&registerBean.isPlayerComplete())==true) {
				
				registerBean.setRegisterSuccess(true);
				}else {
					registerBean.setRegisterSuccess(false);
				}
		int n = session.createQuery(hql).setParameter("id", registerBean.getRegisterSeasonId())
				.setParameter("paymentComplete", registerBean.isPaymentComplete())
				.setParameter("playerComplete", registerBean.isPlayerComplete())
				.setParameter("registerSuccess", registerBean.isRegisterSuccess())
				.setParameter("registerNumber", registerBean.getRegisterNumber()).executeUpdate();

	}
	// end
	
	
	@Override
	public RegisterBean getRegisterByTeamId(int teamId) {
		RegisterBean rb = null;
		Session session = factory.getCurrentSession();
		rb = session.get(RegisterBean.class, teamId);
		return rb;
		
	}

	@Override
	public void addRegister(RegisterBean newregister) {
		
		Session session = factory.getCurrentSession();
	
		session.save(newregister);
	}

	@Override
	public List<RegisterBean> getAllRegister() {
		String hql = "FROM  RegisterBean ";
		Session session = null;
		List<RegisterBean> list = new ArrayList<>();
		session = factory.getCurrentSession();
		list = session.createQuery(hql).getResultList();

		return list;
		
	}

	@Override
	public RegisterBean getRegisterLast() {
		String hql = "FROM  RegisterBean ORDER BY REGISTERSEASONID DESC";
		Session session = null;
		List<RegisterBean> list = new ArrayList<>();
		session = factory.getCurrentSession();
		list = session.createQuery(hql).getResultList();
		
		RegisterBean rb =list.get(0);
		
		return rb;
	}


}
