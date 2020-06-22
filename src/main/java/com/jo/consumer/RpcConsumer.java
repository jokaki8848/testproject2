package com.jo.consumer;

import com.jo.api.IRpcHelloService;
import com.jo.api.IRpcService;
import com.jo.consumer.proxy.*;

public class RpcConsumer {
	
    public static void main(String[] args){
        IRpcHelloService rpcHello = RpcProxy.create(IRpcHelloService.class);
        
        System.out.println(rpcHello.hello("rpc"));

        IRpcService service = RpcProxy.create(IRpcService.class);
        
        System.out.println("2 + 3 = " + service.add(2, 3));
        System.out.println("3 - 2 = " + service.sub(3, 2));
        System.out.println("2 * 2 = " + service.mult(2, 3));
        System.out.println("3 / 2 = " + service.div(3, 2));
    }
    
}
