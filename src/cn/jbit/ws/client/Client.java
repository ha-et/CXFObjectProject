package cn.jbit.ws.client;

import org.apache.cxf.frontend.ClientProxyFactoryBean;
import org.apache.cxf.interceptor.LoggingInInterceptor;

import cn.jbit.ws.entity.Product;
import cn.jbit.ws.servcie.ProductService;

/**
 * Web Service客户端。
 * @author 北大青鸟
 *
 */
public class Client {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClientProxyFactoryBean factory = new ClientProxyFactoryBean();
		factory.setServiceClass(ProductService.class);
		factory.setAddress("http://localhost:8080/ProductService");
		//http://127.0.0.1:8090/object
		factory.getInInterceptors().add(new LoggingInInterceptor());
		ProductService service = (ProductService)factory.create();
		
		Product product = new Product();
		product.setId(1001);
		product.setName("Ipad");
		product.setArea("深圳");
		product.setPrice(5680.0);
		
//		service.saveProduct(product);
		product = service.getProduct(1001);
		System.out.println(product.getName());
		
	}

}
