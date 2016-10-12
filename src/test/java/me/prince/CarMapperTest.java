package me.prince;



import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import me.prince.Car;
import me.prince.CarDto;
import me.prince.CarMapper;
import me.prince.CarType;

//import fr.xebia.extras.selma.Selma;

public class CarMapperTest {

	@Test
	public void shouldMapCarToDto() {
	    //given
	    Car car = new Car( "Morris", 5, CarType.SEDAN);
	    
	    CarDto carDto = CarMapper.INSTANCE.carToCarDto(car);
	 
	    System.out.println(carDto);
	    //when
//	    CarMapper mapper = Selma.builder(CarMapper.class).build();
//	    
//	    CarDto carDto = mapper.carToCarDto(car);
//	    //then
	    assertThat( carDto ).isNotNull();
	    assertThat( carDto.getMake() ).isEqualTo( "Morris" );
	    assertThat( carDto.getSeatCount() ).isEqualTo( 5 );
	    assertThat( carDto.getType() ).isEqualTo( "SEDAN" );
	}
}
