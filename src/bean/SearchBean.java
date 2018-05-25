package bean;

import java.util.Date;

import domain.SexEnum;

public class SearchBean
{
    private int id;
    private String name;
    private Date registDate;
    private SexEnum sex;
    private boolean isExist;
    private String message;

    public SearchBean()
    {
        super();
    }

    public SexEnum getSex()
    {
        return sex;
    }

    public void setSex(SexEnum sex)
    {
        this.sex = sex;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
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

    public boolean isExist()
    {
        return isExist;
    }

    public void setExist(boolean isExist)
    {
        this.isExist = isExist;
    }

    public String getMessage()
    {
        return message;
    }

    public void setMessage(String message)
    {
        this.message = message;
    }

    @Override
    public String toString()
    {
        return "会員ID：" + id + "　　名前：" + name + "　　登録日時：" + registDate + "　　性別：" + sex.name();
    }

}
