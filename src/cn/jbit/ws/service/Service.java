package cn.jbit.ws.service;

import org.apache.cxf.frontend.ServerFactoryBean;

import cn.jbit.ws.servcie.ProductService;
import cn.jbit.ws.servcie.impl.ProductServiceImpl;

/**
 * 创建Web Service服务端。
 * @author 北大青鸟
 *
 */
public class Service {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductService service = new ProductServiceImpl();
		
		ServerFactoryBean svrFactory = new ServerFactoryBean();
		svrFactory.setServiceClass(ProductService.class);
		svrFactory.setAddress("http://localhost:8080/ProductService1");
		svrFactory.setServiceBean(service);
		svrFactory.create();
	}

}
