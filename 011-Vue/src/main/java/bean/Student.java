package bean;

/**
 * JavaWeb
 *
 * @author : ÔøÐ¡½Ü
 * @date : 2022-02-06 15:24
 **/
public class Student {
    private String uname;
    private String pwd;

    public Student(String uname, String pwd) {
        this.uname = uname;
        this.pwd = pwd;
    }

    public Student() {
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "student{" +
                "uname='" + uname + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}
