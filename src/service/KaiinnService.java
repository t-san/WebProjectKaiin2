package service;

import java.sql.Connection;
import java.sql.SQLException;

import Dao.Dao;
import Dao.KaiinnMgr;
import bean.RegistBean;
import bean.SearchBean;
import domain.SexEnum;
import vo.Kaiinn;

public class KaiinnService
{

	//検索
	public SearchBean search(int id)
	{
		try (
				Connection con = Dao.getConnection();)
		{
			KaiinnMgr kmgr = new KaiinnMgr( con );

			Kaiinn kaiinn = kmgr.get( id );

			SearchBean bean = new SearchBean();

			bean.setId( kaiinn.getKaiinNo() );
			bean.setName( kaiinn.getName() );
			bean.setRegistDate( kaiinn.getRegistDate() );
			bean.setSex( kaiinn.getSex() );
			return bean;
		} catch (ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
			throw new RuntimeException( e );
		}
	}

	public RegistBean regist(int id ,String name,SexEnum sex) {
		try (
				Connection con = Dao.getConnection();)
		{
			KaiinnMgr kmgr = new KaiinnMgr( con );
			Kaiinn k =new Kaiinn(id,name,sex);
			RegistBean bean;
			kmgr.put( k );
			return bean;
		} catch (ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
			throw new RuntimeException( e );
		}
	}
}
