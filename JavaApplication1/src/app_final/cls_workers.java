/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app_final;

/**
 *
 * @author AP-SE105-01
 */
public class cls_workers {
    private String str_code;
    private String str_name;
    private int int_job;
    private int int_sexo;
    private String str_contact;
    private String str_address;
    private String str_email;

    public cls_workers(String str_code, String str_name, int int_job, int int_sexo, String str_contact, String str_address, String str_email) {
        this.str_code = str_code;
        this.str_name = str_name;
        this.int_job = int_job;
        this.int_sexo = int_sexo;
        this.str_contact = str_contact;
        this.str_address = str_address;
        this.str_email = str_email;
    }

    
    //GETTERS
    public String getStr_code() {
        return str_code;
    }

    public String getStr_name() {
        return str_name;
    }

    public int getInt_job() {
        return int_job;
    }

    public int getInt_sexo() {
        return int_sexo;
    }

    public String getStr_contact() {
        return str_contact;
    }

    public String getStr_address() {
        return str_address;
    }

    public String getStr_email() {
        return str_email;
    }

    
    
    
    
    //SETTERS
    public void setStr_name(String str_name) {
        this.str_name = str_name;
    }

    public void setInt_job(int int_job) {
        this.int_job = int_job;
    }

    public void setInt_sexo(int int_sexo) {
        this.int_sexo = int_sexo;
    }

    public void setStr_contact(String str_contact) {
        this.str_contact = str_contact;
    }

    public void setStr_address(String str_address) {
        this.str_address = str_address;
    }

    public void setStr_email(String str_email) {
        this.str_email = str_email;
    }
    
    
    
    
}
