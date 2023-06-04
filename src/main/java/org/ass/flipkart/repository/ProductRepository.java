package org.ass.flipkart.repository;

import org.ass.flipkart.dto.ProductDto;
import org.ass.flipkart.dto.StockDto;
import org.ass.flipkart.entity.OrderEntity;
import org.ass.flipkart.entity.ProductEntity;
import org.ass.flipkart.entity.StockEntity;
import org.ass.flipkart.util.SessionFactoryUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class ProductRepository {
	
	public Object saveProductDetails(ProductEntity productEntity) {
		
		SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Object object = session.merge(productEntity);
		transaction.commit();
		return object;
	}
public void saveStock(StockEntity stockEntity) {
		
		SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.merge(stockEntity);
		transaction.commit();
}
public void saveOrder(ProductEntity productEntity) {
	SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
	Session openSession = sessionFactory.openSession();
	Transaction transaction = openSession.beginTransaction();
	openSession.merge(productEntity);
	transaction.commit();
	
	
}
	
	public void preparedProductAndStockInfo(ProductDto productDto) {
		ProductEntity productEntity = new ProductEntity();
		productEntity.setName(productDto.getName());
		productEntity.setPrice(productDto.getPrice());
		productEntity.setProductType(productDto.getProductType());
		productEntity.setManufactureDate(productDto.getManufactureDate());
		productEntity.setQuantity(productDto.getQuantity());
		Object object = saveProductDetails(productEntity);
		
		
		StockEntity stockEntity = new StockEntity();
		stockEntity.setQuantity(productEntity.getQuantity());
		stockEntity.setProductId(((ProductEntity)object).getAltKey());
		
		saveStock(stockEntity);
			
	}
	public ProductEntity findProductById(long id) {
		SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		ProductEntity entity = session.get(ProductEntity.class, id);
		return entity;
		
	}
	public StockEntity findStockById(long id) {
		SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		StockEntity entity = session.get(StockEntity.class, id);
		return entity;
	}

}
