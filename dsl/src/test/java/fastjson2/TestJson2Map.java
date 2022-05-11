package fastjson2;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONReader;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class TestJson2Map {

    @Test
    public void test1(){
        String str ="{\"cF_F2F_F3\":[0.1,0.0000000000001]}";

        Map map=JSON.parseObject(str, HashMap.class);
    }
}
