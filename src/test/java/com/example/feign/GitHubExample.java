package com.example.feign;

import feign.Body;
import feign.Feign;
import feign.RequestLine;
import feign.gson.GsonEncoder;
import feign.httpclient.ApacheHttpClient;
import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

import java.util.List;

public class GitHubExample {

    interface Rap2 {
        @RequestLine("GET /test1")
        String repos(TestParam testParam);

        @RequestLine("POST /test1")
        String repos2(TestParam testParam);
    }

    static class TestParam {
        String name;

        public TestParam(String name, int sex) {
            this.name = name;
            this.sex = sex;
        }

        int sex;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getSex() {
            return sex;
        }

        public void setSex(int sex) {
            this.sex = sex;
        }
    }

    public static void main(String... args) {
        Rap2 target = Feign.builder()
                .client(new ApacheHttpClient())//XXX 使用 ApacheHttp 可以通过get方法提交http body，默认的不行
                .encoder(new GsonEncoder()).target(Rap2.class, "http://192.168.0.104:8080/app/mock/7");
        String repos = target.repos(new TestParam("ssss",2));
        System.out.println("repos:" + repos);
    }
}
