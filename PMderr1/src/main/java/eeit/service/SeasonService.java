package eeit.service;

import java.util.List;

import eeit.model.RegisterBean;
import eeit.model.SeasonBean;

public interface SeasonService {
	List<SeasonBean> getAllSeasons();
	SeasonBean getSeasonById(int seasonId);
	void upSeason(SeasonBean upseason);
	void addSeason(SeasonBean newseason);
	void deleteSeason(int seasonId);
	
	
	List<RegisterBean> getAllRegister();
	List<RegisterBean> getRegisterById(int seasonId);
	void updateRegister(RegisterBean registerBean);
	RegisterBean getRegisterByTeamId(int teamId);
	void addRegister(RegisterBean newregister);
	RegisterBean getRegisterLast();
}
