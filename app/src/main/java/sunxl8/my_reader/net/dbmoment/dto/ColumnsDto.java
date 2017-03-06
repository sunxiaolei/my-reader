package sunxl8.my_reader.net.dbmoment.dto;

import java.util.List;

/**
 * Created by sunxl8 on 2017/3/6.
 */

public class ColumnsDto {

    /**
     * total : 20
     * columns : [{"id":48,"icon":"https://img3.doubanio.com/f/presto/dcf68a77cd9ca171f9965dd9c5d4f7dbaa031d1b/images/column/column-48.png","description":"收录\u201c一刻\u201d最受欢迎内容","name":"热门精选","post_total":2911},{"id":26,"icon":"https://img3.doubanio.com/f/presto/22d66667149bbb968d8f4c31a333df7877c8ed2c/images/column/column-26.png","description":"每日段子，提神醒脑","name":"打鸡血","post_total":941},{"id":57,"icon":"https://img3.doubanio.com/f/presto/ba4d062068874f7452f174b904fad2a609ee83bd/images/column/column-57.png","description":"睡前静静，做个好梦。","name":"洗洗睡","post_total":451},{"id":42,"icon":"https://img3.doubanio.com/f/presto/d82391cda142a9b3e9cee39b8660da79bc4497ad/images/column/column-42.png","description":"时尚穿衣护肤美发全搜罗","name":"爱美丽","post_total":698},{"id":33,"icon":"https://img3.doubanio.com/f/presto/c7da80e7bdd5388c1c4f882c16d84ce64fa7775f/images/column/column-33.png","description":"书里书外，感受阅读之美","name":"闲翻书","post_total":1073},{"id":32,"icon":"https://img3.doubanio.com/f/presto/68c4ec787b99179e73a1a465b2f709c120c32ef8/images/column/column-32.png","description":"推荐电影，分享影评","name":"看电影","post_total":1107},{"id":52,"icon":"https://img3.doubanio.com/f/presto/d8a4f36bf0d31d5df33d69b98c1b3842ccc472d8/images/column/column-52.png","description":"新砖好碟，乐史八卦","name":"听音乐","post_total":379},{"id":53,"icon":"https://img3.doubanio.com/f/presto/c8f6c5dcefaade6601e603197ecf90166f249a71/images/column/column-53.png","description":"门槛其实没那么高","name":"聊艺术","post_total":201},{"id":34,"icon":"https://img3.doubanio.com/f/presto/fe9e3459326305684181174cf8199161b0e6b3b5/images/column/column-34.png","description":"回贴里面有精华","name":"他们在聊什么","post_total":134},{"id":37,"icon":"https://img3.doubanio.com/f/presto/d2c85716bde8921facfa7837a79af6d2b880cf53/images/column/column-37.png","description":"没心没肺笑一笑","name":"哈哈哈","post_total":118},{"id":23,"icon":"https://img3.doubanio.com/f/presto/8da9b4c02c0a7bd7bff567e7beb69c70b19a38a3/images/column/column-23.png","description":"精选菜谱，享受假日生活","name":"假日厨房","post_total":366},{"id":38,"icon":"https://img3.doubanio.com/f/presto/35927443c4b18212caf1d157f3dca95a0b85598b/images/column/column-38.png","description":"舌尖上的时光","name":"食记","post_total":913},{"id":50,"icon":"https://img3.doubanio.com/f/presto/496b033ef47761c591d8b6891cafaa333b6380fb/images/column/column-50.png","description":"新设备，新应用","name":"玩手机","post_total":135},{"id":54,"icon":"https://img3.doubanio.com/f/presto/90b1d55371b6ce186a140bcdf6a4abcb6581bbdc/images/column/column-54.png","description":"你可以过得更精致","name":"生活家","post_total":237},{"id":40,"icon":"https://img3.doubanio.com/f/presto/e61f6c7da9d418c0c5cb4c3debe400b3e25804c8/images/column/column-40.png","description":"旅行见闻，带你看远处风景","name":"去远方","post_total":1599},{"id":39,"icon":"https://img3.doubanio.com/f/presto/56301ad07cac3b0a09cbf6169a460f15700ff549/images/column/column-39.png","description":"异国生活记录","name":"海外志","post_total":238},{"id":35,"icon":"https://img3.doubanio.com/f/presto/7940b7d05c9f3cf221edc82b69fee22254f16e3f/images/column/column-35.png","description":"不一定有用，但是有趣","name":"冷知识","post_total":264},{"id":41,"icon":"https://img3.doubanio.com/f/presto/bedf8818de1d12d8db2fa4959671d3439d4a7847/images/column/column-41.png","description":"维护世界和平，全靠卖萌","name":"萌","post_total":445},{"id":46,"icon":"https://img3.doubanio.com/f/presto/481f0f2cad43d53571870ec6d5b9327480a8ca04/images/column/column-46.png","description":"精彩内容，分批装载","name":"连载","post_total":338},{"id":45,"icon":"https://img3.doubanio.com/f/presto/8bff95d769e4677b2eb579b124dc50660a6f60a5/images/column/icon_default.png","description":"其实没那么可怕。","name":"鬼敲门","post_total":37}]
     */

    private int total;
    private List<ColumnBean> columns;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<ColumnBean> getColumns() {
        return columns;
    }

    public void setColumns(List<ColumnBean> columns) {
        this.columns = columns;
    }

}
