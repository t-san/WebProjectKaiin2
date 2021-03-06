package vo;

import java.util.Date;

import domain.SexEnum;

//---------------------------------------------
//会員クラス
public class Kaiinn
{
    private int kaiinNo;
    private String name;
    private Date registDate;
    private SexEnum sex;

    //コンストラクタ
    public Kaiinn(int kaiinNo, String name, SexEnum sex)
    {
        this.kaiinNo = kaiinNo;
        this.name = name;
        this.registDate = new Date();
        this.sex = sex;
    }

    //コンストラクタ(オーバーロード)
    public Kaiinn(int kaiinNo, String name, Date d, SexEnum sex)
    {
        this.kaiinNo = kaiinNo;
        this.name = name;
        this.registDate = d;
        this.sex = sex;
    }

    public SexEnum getSex()
    {
        return sex;
    }

    public int getKaiinNo()
    {
        return kaiinNo;
    }

    public String getName()
    {
        return name;
    }

    public Date getRegistDate()
    {
        return registDate;
    }
}