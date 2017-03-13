package sunxl8.my_reader.net.maoyanmovie.dto;

import java.util.List;

/**
 * Created by hahaha on 2017/3/13.
 */

public class CommentListDto {


    /**
     * control : {"expires":300}
     * status : 0
     * data : {"CommentResponseModel":{"total":5147,"cmts":[{"nick":"ToyoGu李学栋","approve":0,"oppose":0,"reply":0,"avatarurl":"http://p1.meituan.net/avatar/15beaf1aafc1571890808171618e552741843.jpg","userId":62209126,"score":5,"id":17178527,"content":"不错，好看，","time":"2015-06-05 00:20"},{"nick":"死生成说","approve":0,"oppose":0,"reply":0,"avatarurl":"http://p0.meituan.net/avatar/__47448219__1684116.jpg","userId":15946769,"score":5,"id":17178526,"content":"VIP很爽的","time":"2015-06-05 00:20"},{"nick":"彩虹天边的雨云","approve":0,"oppose":0,"reply":0,"avatarurl":"http://p0.meituan.net/movie/__40465654__9539763.png","userId":137865391,"score":4,"id":17178518,"content":"场面震撼，衔接完美，美国式英雄主义，主角家不死光环，但是结尾有点简洁普通点","time":"2015-06-05 00:20"},{"nick":"春春的嘛","approve":0,"oppose":0,"reply":0,"avatarurl":"http://p1.meituan.net/avatar/a3ad3970104ede947f65d7a2d5685cdb12829.jpg","userId":1698060,"score":4,"id":17178511,"content":"强老大的电影要支持，灾难效果比之前几部灾难片好的多，强老大女儿身材棒棒哒！","time":"2015-06-05 00:20"},{"nick":"XxV543764616","approve":0,"oppose":0,"reply":0,"avatarurl":"http://p0.meituan.net/movie/__40465654__9539763.png","userId":201943883,"score":5,"id":17178494,"content":"不错啊，好几年没看灾难片了，感觉有点像2010","time":"2015-06-05 00:20"}]},"hasNext":true,"movieid":246363,"offset":5,"limit":5}
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
         * expires : 300
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
         * CommentResponseModel : {"total":5147,"cmts":[{"nick":"ToyoGu李学栋","approve":0,"oppose":0,"reply":0,"avatarurl":"http://p1.meituan.net/avatar/15beaf1aafc1571890808171618e552741843.jpg","userId":62209126,"score":5,"id":17178527,"content":"不错，好看，","time":"2015-06-05 00:20"},{"nick":"死生成说","approve":0,"oppose":0,"reply":0,"avatarurl":"http://p0.meituan.net/avatar/__47448219__1684116.jpg","userId":15946769,"score":5,"id":17178526,"content":"VIP很爽的","time":"2015-06-05 00:20"},{"nick":"彩虹天边的雨云","approve":0,"oppose":0,"reply":0,"avatarurl":"http://p0.meituan.net/movie/__40465654__9539763.png","userId":137865391,"score":4,"id":17178518,"content":"场面震撼，衔接完美，美国式英雄主义，主角家不死光环，但是结尾有点简洁普通点","time":"2015-06-05 00:20"},{"nick":"春春的嘛","approve":0,"oppose":0,"reply":0,"avatarurl":"http://p1.meituan.net/avatar/a3ad3970104ede947f65d7a2d5685cdb12829.jpg","userId":1698060,"score":4,"id":17178511,"content":"强老大的电影要支持，灾难效果比之前几部灾难片好的多，强老大女儿身材棒棒哒！","time":"2015-06-05 00:20"},{"nick":"XxV543764616","approve":0,"oppose":0,"reply":0,"avatarurl":"http://p0.meituan.net/movie/__40465654__9539763.png","userId":201943883,"score":5,"id":17178494,"content":"不错啊，好几年没看灾难片了，感觉有点像2010","time":"2015-06-05 00:20"}]}
         * hasNext : true
         * movieid : 246363
         * offset : 5
         * limit : 5
         */

        private CommentResponseModelBean CommentResponseModel;
        private boolean hasNext;
        private int movieid;
        private int offset;
        private int limit;

        public CommentResponseModelBean getCommentResponseModel() {
            return CommentResponseModel;
        }

        public void setCommentResponseModel(CommentResponseModelBean CommentResponseModel) {
            this.CommentResponseModel = CommentResponseModel;
        }

        public boolean isHasNext() {
            return hasNext;
        }

        public void setHasNext(boolean hasNext) {
            this.hasNext = hasNext;
        }

        public int getMovieid() {
            return movieid;
        }

        public void setMovieid(int movieid) {
            this.movieid = movieid;
        }

        public int getOffset() {
            return offset;
        }

        public void setOffset(int offset) {
            this.offset = offset;
        }

        public int getLimit() {
            return limit;
        }

        public void setLimit(int limit) {
            this.limit = limit;
        }

        public static class CommentResponseModelBean {
            /**
             * total : 5147
             * cmts : [{"nick":"ToyoGu李学栋","approve":0,"oppose":0,"reply":0,"avatarurl":"http://p1.meituan.net/avatar/15beaf1aafc1571890808171618e552741843.jpg","userId":62209126,"score":5,"id":17178527,"content":"不错，好看，","time":"2015-06-05 00:20"},{"nick":"死生成说","approve":0,"oppose":0,"reply":0,"avatarurl":"http://p0.meituan.net/avatar/__47448219__1684116.jpg","userId":15946769,"score":5,"id":17178526,"content":"VIP很爽的","time":"2015-06-05 00:20"},{"nick":"彩虹天边的雨云","approve":0,"oppose":0,"reply":0,"avatarurl":"http://p0.meituan.net/movie/__40465654__9539763.png","userId":137865391,"score":4,"id":17178518,"content":"场面震撼，衔接完美，美国式英雄主义，主角家不死光环，但是结尾有点简洁普通点","time":"2015-06-05 00:20"},{"nick":"春春的嘛","approve":0,"oppose":0,"reply":0,"avatarurl":"http://p1.meituan.net/avatar/a3ad3970104ede947f65d7a2d5685cdb12829.jpg","userId":1698060,"score":4,"id":17178511,"content":"强老大的电影要支持，灾难效果比之前几部灾难片好的多，强老大女儿身材棒棒哒！","time":"2015-06-05 00:20"},{"nick":"XxV543764616","approve":0,"oppose":0,"reply":0,"avatarurl":"http://p0.meituan.net/movie/__40465654__9539763.png","userId":201943883,"score":5,"id":17178494,"content":"不错啊，好几年没看灾难片了，感觉有点像2010","time":"2015-06-05 00:20"}]
             */

            private int total;
            private List<CmtsBean> cmts;

            public int getTotal() {
                return total;
            }

            public void setTotal(int total) {
                this.total = total;
            }

            public List<CmtsBean> getCmts() {
                return cmts;
            }

            public void setCmts(List<CmtsBean> cmts) {
                this.cmts = cmts;
            }

            public static class CmtsBean {
                /**
                 * nick : ToyoGu李学栋
                 * approve : 0
                 * oppose : 0
                 * reply : 0
                 * avatarurl : http://p1.meituan.net/avatar/15beaf1aafc1571890808171618e552741843.jpg
                 * userId : 62209126
                 * score : 5
                 * id : 17178527
                 * content : 不错，好看，
                 * time : 2015-06-05 00:20
                 */

                private String nick;
                private int approve;
                private int oppose;
                private int reply;
                private String avatarurl;
                private int userId;
                private int score;
                private int id;
                private String content;
                private String time;

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

                public String getAvatarurl() {
                    return avatarurl;
                }

                public void setAvatarurl(String avatarurl) {
                    this.avatarurl = avatarurl;
                }

                public int getUserId() {
                    return userId;
                }

                public void setUserId(int userId) {
                    this.userId = userId;
                }

                public int getScore() {
                    return score;
                }

                public void setScore(int score) {
                    this.score = score;
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

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }
            }
        }
    }
}
