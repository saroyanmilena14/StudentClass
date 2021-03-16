package Classes.methods.ABC;

public class C extends A{

    private String nickname;


    public C (String name , int age,  String nickname) {
        super(name,age) ;
        this.nickname=nickname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }



}
