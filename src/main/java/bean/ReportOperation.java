package bean;

public class ReportOperation {
    private String msg;

    public ReportOperation(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String report() {
        return msg;
    }
}
