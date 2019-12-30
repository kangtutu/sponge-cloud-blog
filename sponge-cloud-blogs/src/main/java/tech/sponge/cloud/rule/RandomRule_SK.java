package tech.sponge.cloud.rule;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AbstractLoadBalancerRule;
import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.Server;

import java.util.List;
import java.util.Random;

public class RandomRule_SK extends AbstractLoadBalancerRule {

    private int total = 0; //总共被调用的次数，目前定义每台被调用5次
    private int currentIndex = 0; //当前提供服务的机器号

    @Override
    public void initWithNiwsConfig(IClientConfig iClientConfig) {

    }

    @Override
    public Server choose(Object key) {
        return choose(getLoadBalancer(),key);
    }

    public Server choose(ILoadBalancer lb, Object key) {
        Random random = new Random();

        if(lb == null){
            return null;
        }

        Server server = null;

        while(server == null){
            //若线程被中断则返回null
            if(Thread.interrupted()){
                return null;
            }

            //获取健康的服务提供者
            List<Server> reachableServers = lb.getReachableServers();
            //获取注册中心所有的服务提供者
            List<Server> allServers = lb.getAllServers();

            //获取注册中心中服务提供者的个数，若为0则直接返回null
            int serverCount = allServers.size();
            if(serverCount == 0){
                return null;
            }

            //获取需要调用的服务提供者
            int index = random.nextInt(serverCount);
            server = reachableServers.get(index);

            //自定义负载均衡算法
            if(total < 5){
                //若total计数小于5则还是拿上次的服务，然后total累加
                server = reachableServers.get(currentIndex);
                total++;
            }else{
                //若totla大于5则将total归零，服务下表数加1，若服务下标大于健康服务集合中的个数则归零
                total = 0;
                currentIndex++;
                if(currentIndex >= reachableServers.size()){
                    currentIndex = 0;
                }
            }

            //若server为null则线程中断一会，然后再继续
            if(server == null){
                Thread.yield();
                continue;
            }

            //若server正常则直接返回
            if(server.isAlive()){
                return server;
            }

            server = null;
            Thread.yield();
        }
        return server;
    }

}
