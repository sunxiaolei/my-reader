package sunxl8.my_reader.net.doubanmoment.dto;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

/**
 * Created by sunxl8 on 2017/3/6.
 */

public class PostsBean implements Serializable {
    /**
     * display_style : 10001
     * is_editor_choice : false
     * published_time : 2015-09-05 00:00:00
     * original_url :
     * url : https://moment.douban.com/post/124041/?douban_rec=1
     * short_url : https://dou.bz/0VsPh2
     * is_liked : false
     * column : 打鸡血
     * app_css : 7
     * abstract : 【本文含有动图，请在WiFi或3G环境下打开】今天教了学中文的德国小哥怎么用“惹”，刚去超市他对我说了一句“我太累惹”
     * like_count : 659
     * comments_count : 108
     * thumbs : []
     * created_time : 2015-08-29 08:00:04
     * title : 打鸡血｜这么懂事的男票不多了 2015.09.05
     * share_pic_url : https://moment.douban.com/share_pic/post/124041.jpg
     * type : 1001
     * id : 124041
     */

    private int display_style;
    private boolean is_editor_choice;
    private String published_time;
    private String original_url;
    private String url;
    private String short_url;
    private boolean is_liked;
    private String column;
    private int app_css;
    @SerializedName("abstract")
    private String abstractX;
    private int like_count;
    private int comments_count;
    private String created_time;
    private String title;
    private String share_pic_url;
    private String type;
    private int id;
    private List<?> thumbs;

    public int getDisplay_style() {
        return display_style;
    }

    public void setDisplay_style(int display_style) {
        this.display_style = display_style;
    }

    public boolean isIs_editor_choice() {
        return is_editor_choice;
    }

    public void setIs_editor_choice(boolean is_editor_choice) {
        this.is_editor_choice = is_editor_choice;
    }

    public String getPublished_time() {
        return published_time;
    }

    public void setPublished_time(String published_time) {
        this.published_time = published_time;
    }

    public String getOriginal_url() {
        return original_url;
    }

    public void setOriginal_url(String original_url) {
        this.original_url = original_url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getShort_url() {
        return short_url;
    }

    public void setShort_url(String short_url) {
        this.short_url = short_url;
    }

    public boolean isIs_liked() {
        return is_liked;
    }

    public void setIs_liked(boolean is_liked) {
        this.is_liked = is_liked;
    }

    public String getColumn() {
        return column;
    }

    public void setColumn(String column) {
        this.column = column;
    }

    public int getApp_css() {
        return app_css;
    }

    public void setApp_css(int app_css) {
        this.app_css = app_css;
    }

    public String getAbstractX() {
        return abstractX;
    }

    public void setAbstractX(String abstractX) {
        this.abstractX = abstractX;
    }

    public int getLike_count() {
        return like_count;
    }

    public void setLike_count(int like_count) {
        this.like_count = like_count;
    }

    public int getComments_count() {
        return comments_count;
    }

    public void setComments_count(int comments_count) {
        this.comments_count = comments_count;
    }

    public String getCreated_time() {
        return created_time;
    }

    public void setCreated_time(String created_time) {
        this.created_time = created_time;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getShare_pic_url() {
        return share_pic_url;
    }

    public void setShare_pic_url(String share_pic_url) {
        this.share_pic_url = share_pic_url;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<?> getThumbs() {
        return thumbs;
    }

    public void setThumbs(List<?> thumbs) {
        this.thumbs = thumbs;
    }
}
