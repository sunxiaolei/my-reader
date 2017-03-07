package sunxl8.my_reader.net.maoyanmovie.dto;

import java.util.List;

/**
 * Created by sunxl8 on 2017/3/7.
 */

public class CommentResponseModelBean {

    /**
     * hcmts : [{"avatarurl":"https://img.meituan.net/avatar/cc74b3f5b81202443dc64d3dca4ddb58278106.jpg","nick":"TonyStarbin","approve":1332,"oppose":0,"reply":151,"vipInfo":"","userId":42512507,"score":5,"nickName":"TonyStarbin","time":"2017-03-03 02:59","id":98623650,"content":"不想剧透，但是不看一定会后悔，电影结束后，全场起立鼓掌，好多人都在哽咽在流泪，如果你用心看过前几部，你就知道为什么会发生这样的事情了！陪伴17年的狼叔也要离开了，此部之后再无狼叔，如果翻拍，也没有人可以超越休杰克曼！狼叔不会回来了，以后还会有更多人的离开，且行且珍惜\u2026\n \u2014To Wolverine\n \u2014To Logan\n \u2014To Hugh Jackman\n \u2014To my youth\nI have always wanted to know what death is feeling, now I finally know."}]
     * total : 21681
     * hasNext : true
     */

    private int total;
    private boolean hasNext;
    private List<HcmtsBean> hcmts;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public boolean isHasNext() {
        return hasNext;
    }

    public void setHasNext(boolean hasNext) {
        this.hasNext = hasNext;
    }

    public List<HcmtsBean> getHcmts() {
        return hcmts;
    }

    public void setHcmts(List<HcmtsBean> hcmts) {
        this.hcmts = hcmts;
    }
}
