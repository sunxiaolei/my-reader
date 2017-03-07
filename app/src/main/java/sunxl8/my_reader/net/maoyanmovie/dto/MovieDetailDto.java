package sunxl8.my_reader.net.maoyanmovie.dto;

import java.util.List;

/**
 * Created by sunxl8 on 2017/3/7.
 */

public class MovieDetailDto {

    /**
     * control : {"expires":3600}
     * status : 0
     * data : {"MovieDetailModel":{"cat":"动作,冒险,科幻","dealsum":0,"dir":"詹姆斯·曼高德 ","dra":"故事将发生在很久很久之后的未来世界，与现行的X战警宇宙相隔甚远。迈入暮年的金刚狼（休·杰克曼 饰）渐渐失去了体内的自愈因子。当一个与他能力相似的变种人女孩劳拉（达芙妮·基恩 饰）出现，小姑娘也能伸出与金刚狼一样的钢爪。X教授便请狼叔出山保护劳拉，阻止生化人杀手Reavers组织绑架劳拉的计划。","dur":123,"id":247875,"imax":true,"img":"http://p1.meituan.net/165.220/movie/0b7cc256954866593a8e79009acade71487726.jpg","isShowing":true,"late":false,"mk":0,"nm":"金刚狼3：殊死一战","photos":["http://p0.meituan.net/w.h/mmdb/faef390f3acf3d60f7501738b0e9bb446144.jpeg"],"pn":121,"preSale":0,"rt":"2017-03-03上映","sc":8.9,"scm":"狼叔最终战，不舍说再见","showSnum":true,"snum":106327,"src":"美国","star":"休·杰克曼 帕特里克·斯图尔特 达芙妮·基恩 波伊德·霍布鲁克 斯戴芬·莫昌特 理查德·格兰特 艾瑞琪·拉·塞拉 伊莉丝·尼尔 伊丽莎白·罗德里格斯 劳伦·格罗斯 Quincy Fouse 多瑞丝·莫加多 Reynaldo Gallegos Kirk H. Andersen Christina M. Williams Ann Mckenzie John Raymond 汉娜·韦斯特菲尔德 辛西娅·勒布朗 Carlos Ramónne Graham David Melendez Sean Stevens Michael J. Bradford Ronald Joe Vasquez Tony Beard 杰伊·奥利弗 Julia Holt Dave Randolph-Mayhem Davis 马克·阿什沃斯 Frank Gallegos David Kallaway Al Coronel 詹姆斯·摩西·布莱克 汉·索托 William Schaff Erica Austin Diane Mozzone 泰德·弗格森 Ron M Patterson Anthony Escobar Artie Mozzone Eric Berris James Donald Chuck Newsom Gonzalo Robles Edgar Leza Sadarias Harrell 史蒂夫·基什 劳拉·格莱斯 Katie Anne Mitchell Mary Peyton Stewart 克里斯托弗·赫斯基 Damon Carney Saber Bankson Richard Beal Jon Arthur Edsel Pete Samantha Hopkins 伦尼洛·夫廷 Holly Bonney 克日什托夫·索斯亚斯基 Stephen Dunlevy 丹尼尔·伯恩哈特 Ryan Sturz Brandon Melendy Luke Hawx ","vd":"http://maoyan.meituan.net/movie/videos/854x480152636127edb4b8fa1880f801facab52.mp4","ver":"2D/IMAX 2D/中国巨幕/全景声","vnum":23,"wish":85893,"wishst":0},"CommentResponseModel":{"hcmts":[{"avatarurl":"https://img.meituan.net/avatar/cc74b3f5b81202443dc64d3dca4ddb58278106.jpg","nick":"TonyStarbin","approve":1332,"oppose":0,"reply":151,"vipInfo":"","userId":42512507,"score":5,"nickName":"TonyStarbin","time":"2017-03-03 02:59","id":98623650,"content":"不想剧透，但是不看一定会后悔，电影结束后，全场起立鼓掌，好多人都在哽咽在流泪，如果你用心看过前几部，你就知道为什么会发生这样的事情了！陪伴17年的狼叔也要离开了，此部之后再无狼叔，如果翻拍，也没有人可以超越休杰克曼！狼叔不会回来了，以后还会有更多人的离开，且行且珍惜\u2026\n \u2014To Wolverine\n \u2014To Logan\n \u2014To Hugh Jackman\n \u2014To my youth\nI have always wanted to know what death is feeling, now I finally know."}],"total":21681,"hasNext":true}}
     */

    private ControlBean control;
    private int status;
    private DataBean data;

    public ControlBean getControl() {
        return control;
    }

    public void setControl(ControlBean control) {
        this.control = control;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class ControlBean {
        /**
         * expires : 3600
         */

        private int expires;

        public int getExpires() {
            return expires;
        }

        public void setExpires(int expires) {
            this.expires = expires;
        }
    }

    public static class DataBean {
        /**
         * MovieDetailModel : {"cat":"动作,冒险,科幻","dealsum":0,"dir":"詹姆斯·曼高德 ","dra":"故事将发生在很久很久之后的未来世界，与现行的X战警宇宙相隔甚远。迈入暮年的金刚狼（休·杰克曼 饰）渐渐失去了体内的自愈因子。当一个与他能力相似的变种人女孩劳拉（达芙妮·基恩 饰）出现，小姑娘也能伸出与金刚狼一样的钢爪。X教授便请狼叔出山保护劳拉，阻止生化人杀手Reavers组织绑架劳拉的计划。","dur":123,"id":247875,"imax":true,"img":"http://p1.meituan.net/165.220/movie/0b7cc256954866593a8e79009acade71487726.jpg","isShowing":true,"late":false,"mk":0,"nm":"金刚狼3：殊死一战","photos":["http://p0.meituan.net/w.h/mmdb/faef390f3acf3d60f7501738b0e9bb446144.jpeg"],"pn":121,"preSale":0,"rt":"2017-03-03上映","sc":8.9,"scm":"狼叔最终战，不舍说再见","showSnum":true,"snum":106327,"src":"美国","star":"休·杰克曼 帕特里克·斯图尔特 达芙妮·基恩 波伊德·霍布鲁克 斯戴芬·莫昌特 理查德·格兰特 艾瑞琪·拉·塞拉 伊莉丝·尼尔 伊丽莎白·罗德里格斯 劳伦·格罗斯 Quincy Fouse 多瑞丝·莫加多 Reynaldo Gallegos Kirk H. Andersen Christina M. Williams Ann Mckenzie John Raymond 汉娜·韦斯特菲尔德 辛西娅·勒布朗 Carlos Ramónne Graham David Melendez Sean Stevens Michael J. Bradford Ronald Joe Vasquez Tony Beard 杰伊·奥利弗 Julia Holt Dave Randolph-Mayhem Davis 马克·阿什沃斯 Frank Gallegos David Kallaway Al Coronel 詹姆斯·摩西·布莱克 汉·索托 William Schaff Erica Austin Diane Mozzone 泰德·弗格森 Ron M Patterson Anthony Escobar Artie Mozzone Eric Berris James Donald Chuck Newsom Gonzalo Robles Edgar Leza Sadarias Harrell 史蒂夫·基什 劳拉·格莱斯 Katie Anne Mitchell Mary Peyton Stewart 克里斯托弗·赫斯基 Damon Carney Saber Bankson Richard Beal Jon Arthur Edsel Pete Samantha Hopkins 伦尼洛·夫廷 Holly Bonney 克日什托夫·索斯亚斯基 Stephen Dunlevy 丹尼尔·伯恩哈特 Ryan Sturz Brandon Melendy Luke Hawx ","vd":"http://maoyan.meituan.net/movie/videos/854x480152636127edb4b8fa1880f801facab52.mp4","ver":"2D/IMAX 2D/中国巨幕/全景声","vnum":23,"wish":85893,"wishst":0}
         * CommentResponseModel : {"hcmts":[{"avatarurl":"https://img.meituan.net/avatar/cc74b3f5b81202443dc64d3dca4ddb58278106.jpg","nick":"TonyStarbin","approve":1332,"oppose":0,"reply":151,"vipInfo":"","userId":42512507,"score":5,"nickName":"TonyStarbin","time":"2017-03-03 02:59","id":98623650,"content":"不想剧透，但是不看一定会后悔，电影结束后，全场起立鼓掌，好多人都在哽咽在流泪，如果你用心看过前几部，你就知道为什么会发生这样的事情了！陪伴17年的狼叔也要离开了，此部之后再无狼叔，如果翻拍，也没有人可以超越休杰克曼！狼叔不会回来了，以后还会有更多人的离开，且行且珍惜\u2026\n \u2014To Wolverine\n \u2014To Logan\n \u2014To Hugh Jackman\n \u2014To my youth\nI have always wanted to know what death is feeling, now I finally know."}],"total":21681,"hasNext":true}
         */

        private MovieDetailModelBean MovieDetailModel;
        private CommentResponseModelBean CommentResponseModel;

        public MovieDetailModelBean getMovieDetailModel() {
            return MovieDetailModel;
        }

        public void setMovieDetailModel(MovieDetailModelBean MovieDetailModel) {
            this.MovieDetailModel = MovieDetailModel;
        }

        public CommentResponseModelBean getCommentResponseModel() {
            return CommentResponseModel;
        }

        public void setCommentResponseModel(CommentResponseModelBean CommentResponseModel) {
            this.CommentResponseModel = CommentResponseModel;
        }
    }
}
