package org.ass.flipkart;

import java.time.Instant;
import java.util.Date;

import org.ass.flipkart.dto.OrderDto;
import org.ass.flipkart.dto.ProductDto;
import org.ass.flipkart.repository.ProductRepository;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       System.out.println( "Hello World!" );
       Date date = new Date();
       ProductDto productDto = new ProductDto();
       
       productDto.setName("shirt");
       productDto.setManufactureDate(date);
       productDto.setPrice(650);
       productDto.setProductType("dress");
       productDto.setQuantity(20);
       
       ProductRepository repository = new ProductRepository();
       repository.preparedProductAndStockInfo(productDto);
//     	OrderDto dto = new  OrderDto();
//     	dto.setProductId(1);
//     	dto.setQuantity(2);
//     	dto.setPaymentMode("online");
    }
}
