package sunxl8.my_reader.net.dbmoment.dto;

import java.io.Serializable;

/**
 * Created by sunxl8 on 2017/3/6.
 */

public class ColumnBean implements Serializable{
    /**
     * id : 48
     * icon : https://img3.doubanio.com/f/presto/dcf68a77cd9ca171f9965dd9c5d4f7dbaa031d1b/images/column/column-48.png
     * description : 收录“一刻”最受欢迎内容
     * name : 热门精选
     * post_total : 2911
     */

    private int id;
    private String icon;
    private String description;
    private String name;
    private int post_total;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPost_total() {
        return post_total;
    }

    public void setPost_total(int post_total) {
        this.post_total = post_total;
    }
}
