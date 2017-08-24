package ir.milux;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class OResponse {
    public OResponse() {
    }

    String filed;
    public OResponse(String filed) {
        this.filed = filed;
    }

    public String getFiled() {
        return filed;
    }

    public void setFiled(String filed) {
        this.filed = filed;
    }

}