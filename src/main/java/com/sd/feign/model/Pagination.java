package com.sd.feign.model;
public class Pagination
{
    private String total;

    private String pages;

    private String limit;

    private String page;

    public String getTotal ()
    {
        return total;
    }

    public void setTotal (String total)
    {
        this.total = total;
    }

    public String getPages ()
    {
        return pages;
    }

    public void setPages (String pages)
    {
        this.pages = pages;
    }

    public String getLimit ()
    {
        return limit;
    }

    public void setLimit (String limit)
    {
        this.limit = limit;
    }

    public String getPage ()
    {
        return page;
    }

    public void setPage (String page)
    {
        this.page = page;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [total = "+total+", pages = "+pages+", limit = "+limit+", page = "+page+"]";
    }
}