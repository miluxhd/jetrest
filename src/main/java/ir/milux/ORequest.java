package ir.milux;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ORequest {
    public ORequest() {
    }

    public String getFiled() {
        return filed;
    }

    public void setFiled(String filed) {
        this.filed = filed;
    }

    String filed;

    public ORequest(String filed) {
        this.filed = filed;
    }

}
