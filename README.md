# Practice Ehcache With SpringMVC

## Default Key Generator Implementation
```java
public class DefaultKeyGenerator implements KeyGenerator {

    public static final int NO_PARAM_KEY = 0;
    public static final int NULL_PARAM_KEY = 53;

    public Object generate(Object target, Method method, Object... params) {
        if (params.length == 1) {
            return (params[0] == null ? NULL_PARAM_KEY : params[0]);
        }
        if (params.length == 0) {
            return NO_PARAM_KEY;
        }
        int hashCode = 17;
        for (Object object : params) {
            hashCode = 31 * hashCode + (object == null ? NULL_PARAM_KEY : object.hashCode());
        }
        return Integer.valueOf(hashCode);
    }

}
```

## TO-DO
1. Cache Monitoring Config
2. Cache Replication Config

## More-Information Link
- [vsChart - Redis vs Ehcache](http://vschart.com/compare/ehcache/vs/redis-database)
- [SlideShare - Spring 3.1에서 ehcache 활용 전략](http://www.slideshare.net/heungrae_kim/spring-31-ehcache?qid=8e365107-b29a-491e-9284-35a9f30eb649&v=&b=&from_search=1)
- [StackOverFlow - Custom Key Generator With AOP Strategy](http://stackoverflow.com/questions/6730641/how-can-i-set-a-custom-keygenerator-for-spring-cache)
- [자바캔 - EHCache를 이용한 캐시 구현](http://javacan.tistory.com/entry/133)
