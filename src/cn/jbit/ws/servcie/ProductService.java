package cn.jbit.ws.servcie;

import cn.jbit.ws.entity.Product;

/**
 * 产品处理接口。
 * @author 北大青鸟
 *
 */
public interface ProductService {
	/**
	 * 保存产品信息。
	 * @param product
	 */
	public void saveProduct(Product product);

}
