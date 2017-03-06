package sunxl8.my_reader.net.maoyanmovie.dto;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by sunxl8 on 2017/3/6.
 */

public class MainListDto {

    /**
     * control : {"expires":1800}
     * status : 0
     * data : {"hasNext":false,"movies":[{"showInfo":"今天223家影院放映3258场","late":false,"cnms":0,"sn":0,"sc":8.9,"ver":"2D/IMAX 2D/中国巨幕/全景声","rt":"2017-03-03上映","dur":123,"img":"http://p1.meituan.net/165.220/movie/0b7cc256954866593a8e79009acade71487726.jpg","imax":true,"snum":97142,"pn":121,"preSale":0,"vd":"","dir":"詹姆斯·曼高德","star":"休·杰克曼,帕特里克·斯图尔特,达芙妮·基恩","cat":"动作,冒险,科幻","wish":85893,"3d":false,"nm":"金刚狼3：殊死一战","src":"","showDate":"","scm":"狼叔最终战，不舍说再见","time":"","id":247875}]}
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
         * expires : 1800
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
         * hasNext : false
         * movies : [{"showInfo":"今天223家影院放映3258场","late":false,"cnms":0,"sn":0,"sc":8.9,"ver":"2D/IMAX 2D/中国巨幕/全景声","rt":"2017-03-03上映","dur":123,"img":"http://p1.meituan.net/165.220/movie/0b7cc256954866593a8e79009acade71487726.jpg","imax":true,"snum":97142,"pn":121,"preSale":0,"vd":"","dir":"詹姆斯·曼高德","star":"休·杰克曼,帕特里克·斯图尔特,达芙妮·基恩","cat":"动作,冒险,科幻","wish":85893,"3d":false,"nm":"金刚狼3：殊死一战","src":"","showDate":"","scm":"狼叔最终战，不舍说再见","time":"","id":247875}]
         */

        private boolean hasNext;
        private List<MoviesBean> movies;

        public boolean isHasNext() {
            return hasNext;
        }

        public void setHasNext(boolean hasNext) {
            this.hasNext = hasNext;
        }

        public List<MoviesBean> getMovies() {
            return movies;
        }

        public void setMovies(List<MoviesBean> movies) {
            this.movies = movies;
        }

        public static class MoviesBean {
            /**
             * showInfo : 今天223家影院放映3258场
             * late : false
             * cnms : 0
             * sn : 0
             * sc : 8.9
             * ver : 2D/IMAX 2D/中国巨幕/全景声
             * rt : 2017-03-03上映
             * dur : 123
             * img : http://p1.meituan.net/165.220/movie/0b7cc256954866593a8e79009acade71487726.jpg
             * imax : true
             * snum : 97142
             * pn : 121
             * preSale : 0
             * vd :
             * dir : 詹姆斯·曼高德
             * star : 休·杰克曼,帕特里克·斯图尔特,达芙妮·基恩
             * cat : 动作,冒险,科幻
             * wish : 85893
             * 3d : false
             * nm : 金刚狼3：殊死一战
             * src :
             * showDate :
             * scm : 狼叔最终战，不舍说再见
             * time :
             * id : 247875
             */

            private String showInfo;
            private boolean late;
            private int cnms;
            private int sn;
            private double sc;
            private String ver;
            private String rt;
            private int dur;
            private String img;
            private boolean imax;
            private int snum;
            private int pn;
            private int preSale;
            private String vd;
            private String dir;
            private String star;
            private String cat;
            private int wish;
            @SerializedName("3d")
            private boolean value3d;
            private String nm;
            private String src;
            private String showDate;
            private String scm;
            private String time;
            private int id;

            public String getShowInfo() {
                return showInfo;
            }

            public void setShowInfo(String showInfo) {
                this.showInfo = showInfo;
            }

            public boolean isLate() {
                return late;
            }

            public void setLate(boolean late) {
                this.late = late;
            }

            public int getCnms() {
                return cnms;
            }

            public void setCnms(int cnms) {
                this.cnms = cnms;
            }

            public int getSn() {
                return sn;
            }

            public void setSn(int sn) {
                this.sn = sn;
            }

            public double getSc() {
                return sc;
            }

            public void setSc(double sc) {
                this.sc = sc;
            }

            public String getVer() {
                return ver;
            }

            public void setVer(String ver) {
                this.ver = ver;
            }

            public String getRt() {
                return rt;
            }

            public void setRt(String rt) {
                this.rt = rt;
            }

            public int getDur() {
                return dur;
            }

            public void setDur(int dur) {
                this.dur = dur;
            }

            public String getImg() {
                return img;
            }

            public void setImg(String img) {
                this.img = img;
            }

            public boolean isImax() {
                return imax;
            }

            public void setImax(boolean imax) {
                this.imax = imax;
            }

            public int getSnum() {
                return snum;
            }

            public void setSnum(int snum) {
                this.snum = snum;
            }

            public int getPn() {
                return pn;
            }

            public void setPn(int pn) {
                this.pn = pn;
            }

            public int getPreSale() {
                return preSale;
            }

            public void setPreSale(int preSale) {
                this.preSale = preSale;
            }

            public String getVd() {
                return vd;
            }

            public void setVd(String vd) {
                this.vd = vd;
            }

            public String getDir() {
                return dir;
            }

            public void setDir(String dir) {
                this.dir = dir;
            }

            public String getStar() {
                return star;
            }

            public void setStar(String star) {
                this.star = star;
            }

            public String getCat() {
                return cat;
            }

            public void setCat(String cat) {
                this.cat = cat;
            }

            public int getWish() {
                return wish;
            }

            public void setWish(int wish) {
                this.wish = wish;
            }

            public boolean isValue3d() {
                return value3d;
            }

            public void setValue3d(boolean value3d) {
                this.value3d = value3d;
            }

            public String getNm() {
                return nm;
            }

            public void setNm(String nm) {
                this.nm = nm;
            }

            public String getSrc() {
                return src;
            }

            public void setSrc(String src) {
                this.src = src;
            }

            public String getShowDate() {
                return showDate;
            }

            public void setShowDate(String showDate) {
                this.showDate = showDate;
            }

            public String getScm() {
                return scm;
            }

            public void setScm(String scm) {
                this.scm = scm;
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
        }
    }
}
