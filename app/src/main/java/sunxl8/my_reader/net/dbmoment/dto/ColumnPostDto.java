package sunxl8.my_reader.net.dbmoment.dto;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by sunxl8 on 2017/3/6.
 */

public class ColumnPostDto {


    /**
     * count : 20
     * column : {"id":26,"icon":"https://img3.doubanio.com/f/presto/22d66667149bbb968d8f4c31a333df7877c8ed2c/images/column/column-26.png","description":"每日段子，提神醒脑","name":"打鸡血","post_total":941}
     * posts : [{"display_style":10001,"is_editor_choice":false,"published_time":"2015-09-05 00:00:00","original_url":"","url":"https://moment.douban.com/post/124041/?douban_rec=1","short_url":"https://dou.bz/0VsPh2","is_liked":false,"column":"打鸡血","app_css":7,"abstract":"【本文含有动图，请在WiFi或3G环境下打开】今天教了学中文的德国小哥怎么用\u201c惹\u201d，刚去超市他对我说了一句\u201c我太累惹\u201d","like_count":659,"comments_count":108,"thumbs":[],"created_time":"2015-08-29 08:00:04","title":"打鸡血｜这么懂事的男票不多了 2015.09.05","share_pic_url":"https://moment.douban.com/share_pic/post/124041.jpg","type":"1001","id":124041}]
     * offset : 0
     * total : 941
     */

    private int count;
    private ColumnBean column;
    private int offset;
    private int total;
    private List<PostsBean> posts;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public ColumnBean getColumn() {
        return column;
    }

    public void setColumn(ColumnBean column) {
        this.column = column;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<PostsBean> getPosts() {
        return posts;
    }

    public void setPosts(List<PostsBean> posts) {
        this.posts = posts;
    }

}
