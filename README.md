# spring-boot-feign

## 使用 feign
### 纯java方式使用 feign
测试实例`com.example.feign.GitHubExample`

### spring 中使feign访问指定url api
测试实例`com.example.feign.client.FixUrlClient`

### 使用spring cloud 服务发现访问指定服务
的是实例`com.example.feign.client.RegCenterClient`

## 踩坑
### http get请求提交 http body内容时自动转为 post请求问题
原因是feign 默认使用jdk中的 http client组件提交http请求，但是该组件不支持使用get方式提交 http body内容，所以自动转为 post请求提交。
解决方式是引入以下依赖将jdk的 http client替换为apache http client。  
对于使用`spring-cloud-starter-openfeign` 的项目，通过引入依赖即可替换
原因参见：`org.springframework.cloud.openfeign.ribbon.HttpClientFeignLoadBalancedConfiguration`
```xml
		<dependency>
			<groupId>io.github.openfeign</groupId>
			<artifactId>feign-httpclient</artifactId>
		</dependency>
```

非spring项目使用以下代码更改http client组件
```java
public class TestExample{
    //... 这里隐藏一百万行业务代码
    public static void main(String... args) {
        Rap2 target = Feign.builder()
                .client(new ApacheHttpClient())//XXX 使用 ApacheHttp 可以通过get方法提交http body，默认的不行
                .encoder(new GsonEncoder()).target(Rap2.class, "http://192.168.0.104:8080/app/mock/7");
        String repos = target.repos(new TestParam("ssss",2));
        System.out.println("repos:" + repos);
    }
}
```


