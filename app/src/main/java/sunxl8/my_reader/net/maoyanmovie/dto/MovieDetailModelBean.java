package sunxl8.my_reader.net.maoyanmovie.dto;

import java.util.List;

/**
 * Created by sunxl8 on 2017/3/7.
 */

public class MovieDetailModelBean {

    /**
     * cat : 动作,冒险,科幻
     * dealsum : 0
     * dir : 詹姆斯·曼高德
     * dra : 故事将发生在很久很久之后的未来世界，与现行的X战警宇宙相隔甚远。迈入暮年的金刚狼（休·杰克曼 饰）渐渐失去了体内的自愈因子。当一个与他能力相似的变种人女孩劳拉（达芙妮·基恩 饰）出现，小姑娘也能伸出与金刚狼一样的钢爪。X教授便请狼叔出山保护劳拉，阻止生化人杀手Reavers组织绑架劳拉的计划。
     * dur : 123
     * id : 247875
     * imax : true
     * img : http://p1.meituan.net/165.220/movie/0b7cc256954866593a8e79009acade71487726.jpg
     * isShowing : true
     * late : false
     * mk : 0
     * nm : 金刚狼3：殊死一战
     * photos : ["http://p0.meituan.net/w.h/mmdb/faef390f3acf3d60f7501738b0e9bb446144.jpeg"]
     * pn : 121
     * preSale : 0
     * rt : 2017-03-03上映
     * sc : 8.9
     * scm : 狼叔最终战，不舍说再见
     * showSnum : true
     * snum : 106327 评分人数
     * src : 美国
     * star : 休·杰克曼 帕特里克·斯图尔特 达芙妮·基恩 波伊德·霍布鲁克 斯戴芬·莫昌特 理查德·格兰特 艾瑞琪·拉·塞拉 伊莉丝·尼尔 伊丽莎白·罗德里格斯 劳伦·格罗斯 Quincy Fouse 多瑞丝·莫加多 Reynaldo Gallegos Kirk H. Andersen Christina M. Williams Ann Mckenzie John Raymond 汉娜·韦斯特菲尔德 辛西娅·勒布朗 Carlos Ramónne Graham David Melendez Sean Stevens Michael J. Bradford Ronald Joe Vasquez Tony Beard 杰伊·奥利弗 Julia Holt Dave Randolph-Mayhem Davis 马克·阿什沃斯 Frank Gallegos David Kallaway Al Coronel 詹姆斯·摩西·布莱克 汉·索托 William Schaff Erica Austin Diane Mozzone 泰德·弗格森 Ron M Patterson Anthony Escobar Artie Mozzone Eric Berris James Donald Chuck Newsom Gonzalo Robles Edgar Leza Sadarias Harrell 史蒂夫·基什 劳拉·格莱斯 Katie Anne Mitchell Mary Peyton Stewart 克里斯托弗·赫斯基 Damon Carney Saber Bankson Richard Beal Jon Arthur Edsel Pete Samantha Hopkins 伦尼洛·夫廷 Holly Bonney 克日什托夫·索斯亚斯基 Stephen Dunlevy 丹尼尔·伯恩哈特 Ryan Sturz Brandon Melendy Luke Hawx
     * vd : http://maoyan.meituan.net/movie/videos/854x480152636127edb4b8fa1880f801facab52.mp4
     * ver : 2D/IMAX 2D/中国巨幕/全景声
     * vnum : 23
     * wish : 85893
     * wishst : 0
     */

    private String cat;
    private int dealsum;
    private String dir;
    private String dra;
    private int dur;
    private int id;
    private boolean imax;
    private String img;
    private boolean isShowing;
    private boolean late;
    private int mk;
    private String nm;
    private int pn;
    private int preSale;
    private String rt;
    private double sc;
    private String scm;
    private boolean showSnum;
    private int snum;
    private String src;
    private String star;
    private String vd;
    private String ver;
    private int vnum;
    private int wish;
    private int wishst;
    private List<String> photos;

    public String getCat() {
        return cat;
    }

    public void setCat(String cat) {
        this.cat = cat;
    }

    public int getDealsum() {
        return dealsum;
    }

    public void setDealsum(int dealsum) {
        this.dealsum = dealsum;
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public String getDra() {
        return dra;
    }

    public void setDra(String dra) {
        this.dra = dra;
    }

    public int getDur() {
        return dur;
    }

    public void setDur(int dur) {
        this.dur = dur;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isImax() {
        return imax;
    }

    public void setImax(boolean imax) {
        this.imax = imax;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public boolean isIsShowing() {
        return isShowing;
    }

    public void setIsShowing(boolean isShowing) {
        this.isShowing = isShowing;
    }

    public boolean isLate() {
        return late;
    }

    public void setLate(boolean late) {
        this.late = late;
    }

    public int getMk() {
        return mk;
    }

    public void setMk(int mk) {
        this.mk = mk;
    }

    public String getNm() {
        return nm;
    }

    public void setNm(String nm) {
        this.nm = nm;
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

    public String getRt() {
        return rt;
    }

    public void setRt(String rt) {
        this.rt = rt;
    }

    public double getSc() {
        return sc;
    }

    public void setSc(double sc) {
        this.sc = sc;
    }

    public String getScm() {
        return scm;
    }

    public void setScm(String scm) {
        this.scm = scm;
    }

    public boolean isShowSnum() {
        return showSnum;
    }

    public void setShowSnum(boolean showSnum) {
        this.showSnum = showSnum;
    }

    public int getSnum() {
        return snum;
    }

    public void setSnum(int snum) {
        this.snum = snum;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public String getStar() {
        return star;
    }

    public void setStar(String star) {
        this.star = star;
    }

    public String getVd() {
        return vd;
    }

    public void setVd(String vd) {
        this.vd = vd;
    }

    public String getVer() {
        return ver;
    }

    public void setVer(String ver) {
        this.ver = ver;
    }

    public int getVnum() {
        return vnum;
    }

    public void setVnum(int vnum) {
        this.vnum = vnum;
    }

    public int getWish() {
        return wish;
    }

    public void setWish(int wish) {
        this.wish = wish;
    }

    public int getWishst() {
        return wishst;
    }

    public void setWishst(int wishst) {
        this.wishst = wishst;
    }

    public List<String> getPhotos() {
        return photos;
    }

    public void setPhotos(List<String> photos) {
        this.photos = photos;
    }
}
