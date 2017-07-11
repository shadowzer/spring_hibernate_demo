package com.example.demo.hibernate.entity;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;

/**
 * Created by cod_s on 08.07.2017.
 */
@Entity
@Table(name = "CHES", schema = "SHAD")
public class ChesEntity {
    private int id;
    private String varchar2Column;
    private Long number102;
    private Date dateColumn;

    @Id
    @Column(name = "ID", nullable = false, precision = 0)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "VARCHAR2_COLUMN", nullable = true, length = 20)
    public String getVarchar2Column() {
        return varchar2Column;
    }

    public void setVarchar2Column(String varchar2Column) {
        this.varchar2Column = varchar2Column;
    }

    @Basic
    @Column(name = "NUMBER10_2", nullable = true, precision = 2)
    public Long getNumber102() {
        return number102;
    }

    public void setNumber102(Long number102) {
        this.number102 = number102;
    }

    @Basic
    @Column(name = "DATE_COLUMN", nullable = true)
    public Date getDateColumn() {
        return dateColumn;
    }

    public void setDateColumn(Date dateColumn) {
        this.dateColumn = dateColumn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ChesEntity that = (ChesEntity) o;

        if (id != that.id) return false;
        if (varchar2Column != null ? !varchar2Column.equals(that.varchar2Column) : that.varchar2Column != null)
            return false;
        if (number102 != null ? !number102.equals(that.number102) : that.number102 != null) return false;
        if (dateColumn != null ? !dateColumn.equals(that.dateColumn) : that.dateColumn != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (varchar2Column != null ? varchar2Column.hashCode() : 0);
        result = 31 * result + (number102 != null ? number102.hashCode() : 0);
        result = 31 * result + (dateColumn != null ? dateColumn.hashCode() : 0);
        return result;
    }
}
