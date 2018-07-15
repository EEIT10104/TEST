package eeit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import allPay.payment.integration.AllInOne;
import allPay.payment.integration.domain.AioCheckOutALL;
import eeit.model.RegisterBean;
import eeit.model.SeasonBean;
import eeit.service.SeasonService;

@Controller
public class SeasonController {

	@Autowired
	SeasonService seasonSerivce;
	
	
	
	public static AllInOne all;
	
	@RequestMapping("/seasons")
	public String list(Model model) {
		List<SeasonBean> list = seasonSerivce.getAllSeasons();
		model.addAttribute("seasons",list);
		return "seasons";
	}
	
	
	@RequestMapping("/season")
	public String getSeasonById(@RequestParam("id") Integer id,Model model) {
		
		model.addAttribute("season",seasonSerivce.getSeasonById(id));
		return "season";
	}
	
	@RequestMapping(value ="addseason",method = RequestMethod.GET)
	public String getAddNewSeasonFrom(Model model) {
		SeasonBean sb = new SeasonBean();
		model.addAttribute("seasonBean",sb);
		return "addseason";
	}
	
	@RequestMapping(value ="addseason",method = RequestMethod.POST)
	public String processAddNewSeasonForm(@ModelAttribute("seasonBean") SeasonBean sb) {
		
		seasonSerivce.addSeason(sb);
		return "redirect:/seasons";
	}
	@RequestMapping("/delete")
	public String deleteSeasonById(@RequestParam("id") Integer id) {
		
		//System.out.println(id);
		seasonSerivce.deleteSeason(id);
		
		return "redirect:/seasons";
	}
	
	@RequestMapping(value ="/update",method = RequestMethod.GET)
	public String getUpdateSeasonFrom(@ModelAttribute("upSeasonBean") SeasonBean sb,@RequestParam("id") Integer id,Model model) {
		
		

		sb =seasonSerivce.getSeasonById(id);
		
		model.addAttribute("upSeasonBean",sb);
		
		return "update";
	}
	
	@RequestMapping(value ="/update", method=RequestMethod.POST)
	public String getUpdateSeason(@ModelAttribute("upSeasonBean") SeasonBean sb,Model model) {
		System.out.println("1"+sb);
		//sb.getSeasonId();
		System.out.println("1"+sb);
		seasonSerivce.upSeason(sb);;
		return "redirect:/seasons";
	}
	
	
	
	
	
	
	
	
	
	@RequestMapping("/register")
	public String getRegisterById(@RequestParam("id") Integer id,Model model) {
		model.addAttribute("register",seasonSerivce.getRegisterById(id));
		//System.out.println(seasonSerivce.getRegisterById(id));
		return "register";
	}
	
	
//	@RequestMapping("/checkregister")
//	public String getRegisterByTeamId(@RequestParam("id") Integer id,Model model) {
//		
//		model.addAttribute("checkregister",seasonSerivce.getRegisterByTeamId(id));
//		return "checkregister";
//	}
	
	
	@RequestMapping(value ="/checkregister",method = RequestMethod.GET)
	public String getUpdateRegister(@RequestParam("id") Integer id,Model model) {
		RegisterBean sb =seasonSerivce.getRegisterByTeamId(id);
		model.addAttribute("registerBean",sb);
		return "checkregister";
	}
	
	@RequestMapping(value ="/checkregister", method=RequestMethod.POST)
	public String processUpdateRegister(@ModelAttribute("registerBean") RegisterBean sb,Model model) {
		
		seasonSerivce.updateRegister(sb);
		return "redirect:/register?id="+sb.getSeasonId();
	}
	
	
	
	
	@RequestMapping(value ="/addregister",method = RequestMethod.GET)
	public String getAddNewRegisterFrom(@RequestParam("id") Integer id,Model model) {
		RegisterBean rb = new RegisterBean();
		rb.setSeasonId(id);
		model.addAttribute("registerBean",rb);
		return "addregister";
	}
	
	@RequestMapping(value ="/addregister",method = RequestMethod.POST)
	public String processAddNewRegisterForm(@RequestParam("id") Integer id,@ModelAttribute("registerBean") RegisterBean rb,Model model) {
		rb.setSeasonId(id);
		
		seasonSerivce.addRegister(rb);
		int a = rb.getRegisterSeasonId();
		
	
		
		rb.setRegisterNumber("PMderr5278"+a);
		seasonSerivce.updateRegister(rb);
		
		
		
		
		String number =rb.getRegisterNumber();
		
		AllInOne allpay = new AllInOne("");
		AioCheckOutALL obj = new AioCheckOutALL();
		obj.setMerchantTradeNo(number);
		obj.setMerchantTradeDate("2018/08/01 08:05:23");
		obj.setTotalAmount("20");
		obj.setTradeDesc("test Description");
		obj.setItemName("TestItem");
		obj.setReturnURL("http://localhost:8080/PMderr1/memberseasons");
		obj.setNeedExtraPaidInfo("N");
		obj.setHoldTradeAMT("0");
		obj.setUseRedeem("N");
		obj.setClientBackURL("http://localhost:8080/PMderr1/memberseasons");
		
		System.out.println("-----------------------------");
		String form =allpay.aioCheckOut(obj, null);
		System.out.println(form);
		model.addAttribute("form",form);
		return "allpay";
	}
	
	
	@RequestMapping("/memberseasons")
	public String list1(Model model) {
		List<SeasonBean> list = seasonSerivce.getAllSeasons();
		model.addAttribute("seasons",list);
		return "memberseasons";
	}

}
