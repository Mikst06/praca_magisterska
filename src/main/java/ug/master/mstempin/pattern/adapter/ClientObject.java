package ug.master.mstempin.pattern.adapter;

public class ClientObject implements ClientI{

    String f_string;

    Integer f_integer;

    Boolean f_boolean;

    public ClientObject(String f_string, Integer f_integer, Boolean f_boolean) {
        this.f_string = f_string;
        this.f_integer = f_integer;
        this.f_boolean = f_boolean;
    }

    public ClientObject() {
    }

    @Override
    public void action() {
        Integer result;
        Integer length = f_string.length();
        if(f_boolean) {
            result = (length * f_integer);
        } else {
            result = (length);
        }
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
