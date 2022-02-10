package a22_데이터베이스.Dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Product {
	private int product_code;
	private String product_name;
	private int category_code;
	
}
