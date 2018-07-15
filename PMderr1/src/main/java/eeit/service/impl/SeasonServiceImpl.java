package eeit.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import eeit.model.RegisterBean;
import eeit.model.SeasonBean;
import eeit.repository.SeasonDAO;
import eeit.service.SeasonService;
@Transactional
@Service
public class SeasonServiceImpl implements SeasonService {
	
	@Autowired
	private  SeasonDAO seasonRepository;
	
	

	@Override
	public List<SeasonBean> getAllSeasons() {
		
		return seasonRepository.getAllSeasons();
	}

	
	
	@Override
	public SeasonBean getSeasonById(int seasonId) {
		
		return seasonRepository.getSeasonById(seasonId);
	}
	
	
	@Override
	public void upSeason(SeasonBean upseason) {
		seasonRepository.upSeason(upseason);
		
	}
	
	@Override
	public void addSeason(SeasonBean newseason) {
		seasonRepository.addSeason(newseason);
		
	}

	@Override
	public  void deleteSeason(int seasonId) {
		 seasonRepository.deleteSeason(seasonId);
	}
	
	
	
	
	
	
	@Override
	public List<RegisterBean> getRegisterById(int seasonId) {
		
		return seasonRepository.getRegisterById(seasonId);
	}

	
	@Override
	public void updateRegister(RegisterBean registerBean) {
		seasonRepository.updateRegister(registerBean);
		
	}


	@Override
	public RegisterBean getRegisterByTeamId(int teamId) {
		return seasonRepository.getRegisterByTeamId(teamId);
		
	}



	@Override
	public void addRegister(RegisterBean newregister) {
		seasonRepository.addRegister(newregister);
		
	}



	@Override
	public List<RegisterBean> getAllRegister() {
		return seasonRepository.getAllRegister();
		
	}



	@Override
	public RegisterBean getRegisterLast() {
		
		return seasonRepository.getRegisterLast();
	}


}
