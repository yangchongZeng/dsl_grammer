package fastjson2;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONReader;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FastJson2Test {

    public static void main(String[] args) {
        String str ="{\"cF_F2F_F3\":[0.423121111111111,3532607394.3445453]}";

        Map map=JSON.parseObject(str, HashMap.class,
                JSONReader.Feature.UseBigDecimalForDoubles,JSONReader.Feature.UseBigDecimalForFloats);

        System.out.println(((JSONArray)map.get("cF_F2F_F3")).get(0).getClass());
        System.out.println(((JSONArray)map.get("cF_F2F_F3")).get(1).getClass());
        System.out.println(((JSONArray)map.get("cF_F2F_F3")).get(1));
//        Entity entity=JSONObject.parseObject(str,Entity.class);
//        System.out.println(entity.getcF_F2F_F3().get(0).getClass());
//        System.out.println(entity.getcF_F2F_F3().get(1).getClass());
    }
}

// class Entity{
//    private List<Double> cF_F2F_F3;
//
//     public List<Double> getcF_F2F_F3() {
//         return cF_F2F_F3;
//     }
//
//     public void setcF_F2F_F3(List<Double> cF_F2F_F3) {
//         this.cF_F2F_F3 = cF_F2F_F3;
//     }
// }
