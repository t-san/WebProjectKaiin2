package bean;

import java.util.Date;

import domain.SexEnum;

//会員レコードbean
public class KaiinLineBean
{
    private int kaiinNo;
    private String name;
    private Date registDate;
    private SexEnum sex;

    public KaiinLineBean()
    {
    }

    public int getKaiinNo()
    {
        return kaiinNo;
    }

    public void setKaiinNo(int kaiinNo)
    {
        this.kaiinNo = kaiinNo;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Date getRegistDate()
    {
        return registDate;
    }

    public void setRegistDate(Date registDate)
    {
        this.registDate = registDate;
    }

    public SexEnum getSex()
    {
        return sex;
    }

    public void setSex(SexEnum sex)
    {
        this.sex = sex;
    }

}
