package service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import Dao.Dao;
import Dao.KaiinnMgr;
import bean.KaiinLineBean;
import bean.ListOutBean;
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

    //登録
    public RegistBean regist(int id, String name, SexEnum sex)
    {
        try (
                Connection con = Dao.getConnection();)
        {
            KaiinnMgr kmgr = new KaiinnMgr( con );
            Kaiinn k = new Kaiinn( id, name, sex );
            RegistBean bean = new RegistBean();
            //会員登録
            kmgr.put( k );
            //登録結果(会員リスト)を取得し、beanにセット
            bean.setList( listout() );
            return bean;
        } catch (ClassNotFoundException | SQLException e)
        {
            e.printStackTrace();
            throw new RuntimeException( e );
        }
    }

    //リスト出力
    public ListOutBean listout()
    {
        try (
                Connection con = Dao.getConnection();)
        {
            KaiinnMgr kmgr = new KaiinnMgr( con );
            //SQL実行結果
            Collection<Kaiinn> list = kmgr.values();
            //
            List<KaiinLineBean> listBean = new ArrayList<KaiinLineBean>();
            //listBean
            for (Kaiinn k :list) {
                KaiinLineBean kaiinBean = new KaiinLineBean();
                kaiinBean.setKaiinNo( k.getKaiinNo() );
                kaiinBean.setName( k.getName() );
                kaiinBean.setRegistDate( k.getRegistDate() );
                kaiinBean.setSex( k.getSex() );
                listBean.add( kaiinBean );
            }
            ListOutBean bean = new ListOutBean();
            bean.setLine( listBean );
            return bean;
        } catch (ClassNotFoundException | SQLException e)
        {
            e.printStackTrace();
            throw new RuntimeException( e );
        }
    }
}
