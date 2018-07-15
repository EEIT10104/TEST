package eeit.repository;

import java.util.List;

import eeit.model.RegisterBean;
import eeit.model.SeasonBean;

public interface SeasonDAO {

	List<SeasonBean>  getAllSeasons(); 

	void upSeason(SeasonBean upseason);
	SeasonBean getSeasonById(int seasonId);
	void addSeason(SeasonBean newseason);
	void deleteSeason(int seasonId); 
	
	
	List<RegisterBean> getAllRegister();
	List<RegisterBean> getRegisterById(int seasonId);
	RegisterBean getRegisterByTeamId(int teamId);
	void updateRegister(RegisterBean registerBean);
	void addRegister(RegisterBean newregister);
	RegisterBean getRegisterLast();
	
	
}
