package service;

import Dao.KaiinnMgr;
import bean.SearchBean;
import vo.Kaiinn;

public class KaiinnService {


	KaiinnMgr kmgr=new KaiinnMgr();

	public SearchBean search(int id)
	{
		Kaiinn kaiinn=kmgr.get(id);

		SearchBean bean=new SearchBean();

		bean.setId(kaiinn.getKaiinNo());
		bean.setName(kaiinn.getName());
		bean.setRegistDate(kaiinn.getRegistDate());



		return bean;
	}


}
