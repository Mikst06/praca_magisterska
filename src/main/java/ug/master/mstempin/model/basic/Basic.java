package ug.master.mstempin.model.basic;

public class Basic {

    String f_string;

    Integer f_integer;

    Boolean f_boolean;

    public Basic(String f_string, Integer f_integer, Boolean f_boolean) {
        this.f_string = f_string;
        this.f_integer = f_integer;
        this.f_boolean = f_boolean;
    }

    public Basic() {
    }

    public String getF_string() {
        return f_string;
    }

    public Integer getF_integer() {
        return f_integer;
    }

    public Boolean getF_boolean() {
        return f_boolean;
    }
}
