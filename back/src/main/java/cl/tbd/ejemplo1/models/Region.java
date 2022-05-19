package cl.tbd.ejemplo1.models;

import org.postgis.PGgeometry;

public class Region {
    private Integer gid;
    private String nom_reg;
    private String nom_prov;
    private String cod_num;
    private String nom_com;
    private Integer cod_regi;
    private Double superficie;
    private Integer poblac02;
    private Integer pobl2010;
    private Double shape_leng;
    private Double shape_area;
    private PGgeometry location;

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public String getNom_reg() {
        return nom_reg;
    }

    public void setNom_reg(String nom_reg) {
        this.nom_reg = nom_reg;
    }

    public String getNom_prov() {
        return nom_prov;
    }

    public void setNom_prov(String nom_prov) {
        this.nom_prov = nom_prov;
    }

    public String getCod_num() {
        return cod_num;
    }

    public void setCod_num(String cod_num) {
        this.cod_num = cod_num;
    }

    public String getNom_com() {
        return nom_com;
    }

    public void setNom_com(String nom_com) {
        this.nom_com = nom_com;
    }

    public Integer getCod_regi() {
        return cod_regi;
    }

    public void setCod_regi(Integer cod_regi) {
        this.cod_regi = cod_regi;
    }

    public Double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(Double superficie) {
        this.superficie = superficie;
    }

    public Integer getPoblac02() {
        return poblac02;
    }

    public void setPoblac02(Integer poblac02) {
        this.poblac02 = poblac02;
    }

    public Integer getPobl2010() {
        return pobl2010;
    }

    public void setPobl2010(Integer pobl2010) {
        this.pobl2010 = pobl2010;
    }

    public Double getShape_leng() {
        return shape_leng;
    }

    public void setShape_leng(Double shape_leng) {
        this.shape_leng = shape_leng;
    }

    public Double getShape_area() {
        return shape_area;
    }

    public void setShape_area(Double shape_area) {
        this.shape_area = shape_area;
    }

    public PGgeometry getLocation() {
        return location;
    }

    public void setLocation(PGgeometry location) {
        this.location = location;
    }
}
