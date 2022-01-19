package a18_lombok;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Builder
@AllArgsConstructor
@NoArgsConstructor
//따로 사용하는 경우 따로 어노테이션
@Getter
@Setter
@ToString
@EqualsAndHashCode


public class Student {
	private String name;
	private int grade;
	private int cla;
	private int number;
	private String adress;
	private int phonenumber;
	private String year;
	

	
	

}
