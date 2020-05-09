package cn.easysw.ccl.geteway.config;

import org.springframework.cloud.gateway.filter.OrderedGatewayFilter;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;

/**
 * @ClassName: GatewayConfig <br/>
 * @Function: TODO ADD FUNCTION. <br/>
 * @Reason: TODO ADD REASON. <br/>
 * @Date: 2020/4/28 3:02 下午<br/>
 * @author: jeff
 * @see
 * @since JDK 1.7-1.8
 * 佛祖保佑,永无BUG
 */
public class GatewayConfig {


    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder) {
        return routeLocatorBuilder.routes().route("id",
                r -> r.path("").uri("")).build();
    }
}
