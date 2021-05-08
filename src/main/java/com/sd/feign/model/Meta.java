package com.sd.feign.model;
public class Meta
{
    private Pagination pagination;

    public Pagination getPagination ()
    {
        return pagination;
    }

    public void setPagination (Pagination pagination)
    {
        this.pagination = pagination;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [pagination = "+pagination+"]";
    }
}
