package sunxl8.my_reader.net.maoyanmovie.dto;

/**
 * Created by sunxl8 on 2017/3/7.
 */

public class HcmtsBean {

    /**
     * avatarurl : https://img.meituan.net/avatar/cc74b3f5b81202443dc64d3dca4ddb58278106.jpg
     * nick : TonyStarbin
     * approve : 1332
     * oppose : 0
     * reply : 151
     * vipInfo :
     * userId : 42512507
     * score : 5
     * nickName : TonyStarbin
     * time : 2017-03-03 02:59
     * id : 98623650
     * content : 不想剧透，但是不看一定会后悔，电影结束后，全场起立鼓掌，好多人都在哽咽在流泪，如果你用心看过前几部，你就知道为什么会发生这样的事情了！陪伴17年的狼叔也要离开了，此部之后再无狼叔，如果翻拍，也没有人可以超越休杰克曼！狼叔不会回来了，以后还会有更多人的离开，且行且珍惜…
     —To Wolverine
     —To Logan
     —To Hugh Jackman
     —To my youth
     I have always wanted to know what death is feeling, now I finally know.
     */

    private String avatarurl;
    private String nick;
    private int approve;
    private int oppose;
    private int reply;
    private String vipInfo;
    private int userId;
    private double score;
    private String nickName;
    private String time;
    private int id;
    private String content;

    public String getAvatarurl() {
        return avatarurl;
    }

    public void setAvatarurl(String avatarurl) {
        this.avatarurl = avatarurl;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public int getApprove() {
        return approve;
    }

    public void setApprove(int approve) {
        this.approve = approve;
    }

    public int getOppose() {
        return oppose;
    }

    public void setOppose(int oppose) {
        this.oppose = oppose;
    }

    public int getReply() {
        return reply;
    }

    public void setReply(int reply) {
        this.reply = reply;
    }

    public String getVipInfo() {
        return vipInfo;
    }

    public void setVipInfo(String vipInfo) {
        this.vipInfo = vipInfo;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
