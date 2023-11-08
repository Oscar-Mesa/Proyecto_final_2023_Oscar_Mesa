/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app_final;

/**
 *
 * @author AP-SE105-01
 */
public class cls_plots {
    private String str_code;
    private String str_name;
    private String str_area;
    private String str_address;
    private String str_crops;   
    private String str_code_worker;

    public cls_plots(String str_code, String str_name, String str_area, String str_address, String str_crops, String str_code_worker) {
        this.str_code = str_code;
        this.str_name = str_name;
        this.str_area = str_area;
        this.str_address = str_address;
        this.str_crops = str_crops;
        this.str_code_worker = str_code_worker;
    }

    
    //GETTER
    public String getStr_code() {
        return str_code;
    }

    public String getStr_name() {
        return str_name;
    }

    public String getStr_area() {
        return str_area;
    }

    public String getStr_address() {
        return str_address;
    }

    public String getStr_crops() {
        return str_crops;
    }

    public String getStr_code_worker() {
        return str_code_worker;
    }
    
    //SETTER

    public void setStr_name(String str_name) {
        this.str_name = str_name;
    }

    public void setStr_area(String str_area) {
        this.str_area = str_area;
    }

    public void setStr_address(String str_address) {
        this.str_address = str_address;
    }

    public void setStr_crops(String str_crops) {
        this.str_crops = str_crops;
    }

    public void setStr_code_worker(String str_code_worker) {
        this.str_code_worker = str_code_worker;
    }
    
    
    
}
